# Contexto del proyecto (para retomar en otra sesión)

Plugin OSGi de iDempiere 8.2 que importa submissions de KoboToolbox. Dos
integraciones conviven en el plugin:

1. **C_BPartner_Extradata** (ya existente, funcionando) — datos extra de
   productor, importados por `ImportKoboSubmissions.java`.
2. **COMUS_TechnicalVisit** (en curso, esta sesión) — checklist de
   verificación técnica de instalaciones y control agrícola.

## Estado de COMUS_TechnicalVisit

- Formulario fuente: `data/RG-CERT-GG-20.xlsx` / `data/RG-CERT-GG-20.xml`
  (XLSForm de Kobo, ~150 criterios de checklist en 5 secciones).
- Diseño elegido: **tabla plana** (una fila por submission, una columna por
  criterio), no header+detalle ni JSON-blob. Motivo: reportabilidad directa
  en Smart Browse/Jasper sin joins, upsert simple por `KoboSubmissionID`,
  y es el mismo patrón ya usado en `C_BPartner_Extradata`. Detalle del
  razonamiento (BD/import/reportes) quedó discutido en la conversación,
  no repetido aquí.
- `AD_Table_ID = 1000118` (ya registrada en el diccionario).
- SQL de referencia en `sql/`:
  - `COMUS_TechnicalVisit.sql` — DDL original (243 columnas: 9 estándar
    iDempiere + 4 trazabilidad Kobo + 4 geopoint desagregado + 226 de
    negocio). Ya ejecutado contra la BD real.
  - `COMUS_TechnicalVisit_FixColumnNames.sql` — **ya aplicado**. Corrige
    `AD_Column.ColumnName`/`Name` y `AD_Element.ColumnName`/`Name`/`PrintName`
    a PascalCase (la sincronización desde BD los había traído en minúsculas
    porque Postgres pliega identificadores sin comillas). La columna física
    en Postgres sigue en minúsculas (`emppiso`, etc.) — es el comportamiento
    normal/esperado, igual que `IsNaturalPerson`/`isnaturalperson` en
    `C_BPartner_Extradata`. No se debe volver a sincronizar esta tabla desde
    la BD sin volver a aplicar el fix de nombres después.
- **Bug encontrado y corregido**: las 4 columnas de geolocalización
  (`UbicacionLatitud/Longitud/Altitud/Precision`) habían sincronizado como
  `AD_Reference_ID=11` (Integer) en vez de `22` (Number), truncando
  coordenadas GPS. Ya corregido con UPDATE directo + regeneración de
  `X_COMUS_TechnicalVisit`/`I_COMUS_TechnicalVisit` (ahora usan `BigDecimal`).
- Clases modelo (`I_COMUS_TechnicalVisit.java`, `X_COMUS_TechnicalVisit.java`)
  ya generadas y están en `src/com/comus/model/`.
- Proceso de importación escrito: `src/com/comus/process/ImportKoboTechnicalVisit.java`.
  - Mapeo **genérico**: cada clave del JSON de Kobo (sin el prefijo de grupo)
    se convierte a PascalCase y se busca esa columna vía
    `POInfo.getColumnIndex()` + `PO.set_ValueOfColumn()`. No hay 226 setters
    hardcodeados — si el formulario agrega/quita un criterio y se agrega/quita
    la columna correspondiente en la tabla, el import se adapta solo.
  - Campos especiales fuera del mapeo genérico: `_id` → `KoboSubmissionID`,
    `_submission_time` → `KoboSubmissionTime`, submission completo →
    `RawKoboJSON` (columna TEXT de respaldo/auditoría), `ubicacion_visita`
    (geopoint "lat lon alt precision") → las 4 columnas `Ubicacion*`.
  - Dedup/upsert por `KoboSubmissionID`, igual patrón que
    `ImportKoboSubmissions`.
  - **Resolución de Tercero — asunción a validar con el usuario**: se
    busca `C_BPartner` por `Value = CodigoProductor` (no por `TaxID`, a
    diferencia del proceso hermano). Si no hay match, el registro se
    importa igual sin `C_BPartner_ID` (no se descarta, a diferencia del
    proceso hermano que sí descarta submissions sin Tercero). Confirmar si
    esto es lo que se espera.
  - `ModelFactory.java` y `ProcessFactory.java` ya actualizados para
    registrar el nuevo modelo/proceso.
- **Sin compilar** — el usuario compila manualmente en Eclipse (ver memoria
  `no-compilar-manual`).

## Pendiente / próximos pasos

1. Compilar en Eclipse y corregir cualquier error de API que no se haya
   detectado sin compilador (los métodos usados —`set_ValueOfColumn`,
   `get_ColumnIndex`, `POInfo.getColumnClass`— se verificaron contra el jar
   real `org.adempiere.base-8.2.0.202110211605.jar`, pero no hubo
   compilación completa del `.java`).
2. Registrar el nuevo **AD_Process** en el diccionario para
   `ImportKoboTechnicalVisit` (className
   `com.comus.process.ImportKoboTechnicalVisit`), con los mismos 4
   parámetros que ya tiene el proceso de `ImportKoboSubmissions`:
   `KoboBaseURL`, `KoboApiToken`, `KoboAssetUID`, `AD_Org_ID`.
3. Confirmar/crear en el diccionario las 6 Reference Lists mencionadas al
   final de `sql/COMUS_TechnicalVisit.sql` (`tiene/parcial/no_tiene`,
   `cumple/no_cumple`, `cumple/no_cumple/no_aplica`, `si/no`,
   `primera/seguimiento/verificacion/otra`,
   `propio/flp/otro/no_definido`) y asignarlas a las columnas VARCHAR(15)
   correspondientes — no confirmado si ya se hizo.
4. Validar con datos reales de Kobo (probar contra el asset real, no solo
   revisión de código).
5. Opcional, no hecho: los `Name`/`PrintName` de columnas y elementos
   quedaron en PascalCase técnico (ej. "EmpPiso"), no en español legible.
   Si se quiere una etiqueta humana en las ventanas/reportes, falta un
   segundo update usando el texto original de la pregunta Kobo (ya
   disponible en `data/RG-CERT-GG-20.xlsx`, columna `label`).
6. Validar la asunción de `resolveBPartner` (punto arriba).

## Ambiente de prueba (sin credenciales aquí por seguridad)

Hay un Postgres local usado para validar SQL contra la base real del
proyecto (`idempiere_flp`) antes de aplicar cambios. Las credenciales no se
guardan en este archivo ni en memoria — pedirlas de nuevo si se necesita
validar algo en otra sesión.

## Lección de proceso (importante)

En esta sesión se ejecutó por error un UPDATE contra la base real sin
autorización explícita previa (un script con `BEGIN...COMMIT` propio se
ejecutó pensando que era un dry-run con rollback). Regla desde ahora:
**nunca ejecutar nada que mute la BD real sin mostrar el comando exacto y
esperar confirmación explícita del usuario primero**, ni siquiera "para
probar". Ver memoria `feedback_db_confirmation`.
