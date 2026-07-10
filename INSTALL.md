# INSTALL — Plugin `ec.com.comus.koboimport`

Importa envíos de un formulario KoboToolbox y crea Terceros (`C_BPartner`)
con su contacto (`AD_User`) en iDempiere 8.2.

---

## 1. Compilación (Eclipse)

1. Importar el proyecto en el workspace de iDempiere 8.2:
   `File → Import → General → Existing Projects into Workspace` y
   seleccionar la carpeta `ec.com.comus.koboimport`.
2. Verificar que compila sin errores (requiere la target platform de
   iDempiere 8.2 activa, que ya incluye el bundle `com.google.gson` 2.8.2 —
   no hace falta embeber gson).
3. Exportar el jar:
   `File → Export → Plug-in Development → Deployable plug-ins and fragments`
   → seleccionar `ec.com.comus.koboimport` → Directory: elegir una carpeta
   destino → Finish.
   El jar queda en `<destino>/plugins/ec.com.comus.koboimport_1.0.0.jar`.

## 2. Deploy vía Felix Web Console

1. Abrir `http://<servidor>:8080/osgi/system/console/bundles`
   (usuario/clave por defecto de iDempiere para la consola OSGi).
2. Botón **Install/Update…** → seleccionar el jar → marcar
   **Start Bundle** → Install or Update.
3. Verificar que el bundle `COMUS KoboToolbox Import` quede en estado
   **Active**. Si queda en *Resolved*, presionar el botón ▶ (Start).

## 3. Registro en el Application Dictionary

Ingresar con rol **System Administrator**.

### 3.1 Report & Process

Ventana **Report & Process** → New:

| Campo      | Valor                                                    |
|------------|----------------------------------------------------------|
| Search Key | `ImportKoboSubmissions`                                  |
| Name       | `Importar Clientes desde KoboToolbox`                    |
| Type       | Process                                                  |
| Classname  | `com.comus.process.ImportKoboSubmissions`                |
| Show Help  | Window                                                   |

### 3.2 Parámetros (pestaña *Parameter*)

Crear los 5 registros. En cada uno, el **DB Column Name** debe ser
exactamente el de la tabla (el proceso los lee por ese nombre).
Tipo String = *String* (longitud 255 sugerida, 2000 para el token);
tipo Integer = *Integer* (o *Number* entero).

| SeqNo | DB Column Name | Name              | Tipo    | Mandatorio |
|-------|----------------|-------------------|---------|------------|
| 10    | KoboBaseURL    | Kobo Base URL     | String  | Sí         |
| 20    | KoboApiToken   | Kobo API Token    | String  | Sí         |
| 30    | KoboAssetUID   | Kobo Asset UID    | String  | Sí         |
| 40    | BPGroupId      | BP Group ID       | Integer | Sí         |
| 50    | OrgId          | Org ID            | Integer | Sí         |

Los nombres de los campos del formulario Kobo (`Nombre`, `TaxID`,
`teléfono`, `email`) están hardcodeados en el proceso para el demo.

### 3.3 Menú

Ventana **Menu** → New:
- Name: `Importar Clientes desde KoboToolbox`
- Action: **Process**
- Process: `ImportKoboSubmissions`
- Ubicarlo (drag & drop en el árbol) en la carpeta que Fernando elija.
- Cerrar sesión y volver a entrar (o *Reset Cache*) para ver el ítem.

### 3.4 Scheduler (demo en vivo)

Ventana **Scheduler** → New:

| Campo           | Valor                 |
|-----------------|-----------------------|
| Name            | Sync KoboToolbox      |
| Process         | ImportKoboSubmissions |
| Frequency Type  | Minute                |
| Frequency       | 1                     |
| Supervisor      | System Administrator  |

En la pestaña **Parameter** del scheduler, cargar los mismos valores de la
sección 4. Luego activarlo desde **Server Monitor**
(`http://<servidor>:8080/idempiereMonitor`) → reiniciar el scheduler.

## 4. Valores COMUS para los parámetros

| Parámetro    | Valor                                    |
|--------------|------------------------------------------|
| KoboBaseURL  | `https://kf.kobotoolbox.org`             |
| KoboApiToken | *(token API de la cuenta Kobo de COMUS)* |
| KoboAssetUID | `a6E3nnrzHaTqEBiHQVWmcG`                 |
| BPGroupId    | `C_BP_Group_ID` del grupo destino        |
| OrgId        | `AD_Org_ID` de la organización           |

El token se obtiene en Kobo: `https://kf.kobotoolbox.org/token/?format=json`
(logueado con la cuenta de COMUS).

## 5. Verificación

1. Correr el proceso manualmente desde el menú con los parámetros de arriba.
   Resultado esperado con 2 submissions:
   `Creados: 2 | Omitidos: 0 | Inválidos: 0 | Errores: 0`.
2. Correrlo de nuevo: `Creados: 0 | Omitidos: 2 | ...` (dedup OK).
3. Abrir la ventana **Business Partner / Tercero** y buscar
   `Search Key` (Value) like `KOBO-%`: debe existir un tercero por
   submission, con Name, TaxID y un contacto (pestaña *Contact (User)*)
   con email y teléfono.
4. Con el scheduler activo: llenar el formulario en Kobo y al minuto
   debe aparecer el tercero nuevo.
