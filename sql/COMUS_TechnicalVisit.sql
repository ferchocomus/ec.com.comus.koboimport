-- =====================================================================
-- COMUS_TechnicalVisit
-- Verificacion tecnica de instalaciones y control agricola (KoboToolbox)
-- Tabla plana: una fila por submission de Kobo, una columna por criterio.
-- Generado a partir de RG-CERT-GG-20.xlsx (XLSForm) - ver data/RG-CERT-GG-20.xml
-- =====================================================================

-- Columnas estandar generadas siguiendo la misma convencion fisica
-- que ya usa este proyecto en C_BPartner_Extradata (ver DB real).
CREATE TABLE COMUS_TechnicalVisit (
    -- Columnas estandar iDempiere
    COMUS_TechnicalVisit_ID NUMERIC(10) NOT NULL,
    AD_Client_ID            NUMERIC(10),
    AD_Org_ID               NUMERIC(10),
    IsActive                CHAR(1) DEFAULT 'Y' NOT NULL,
    Created                 TIMESTAMP DEFAULT statement_timestamp(),
    CreatedBy               NUMERIC(10),
    Updated                 TIMESTAMP DEFAULT statement_timestamp(),
    UpdatedBy               NUMERIC(10),
    COMUS_TechnicalVisit_UU VARCHAR(36),

    -- Trazabilidad del submission de Kobo
    KoboSubmissionID   VARCHAR(255) NOT NULL,  -- _id del submission (clave de dedup/upsert)
    KoboSubmissionTime TIMESTAMP,              -- _submission_time del submission
    C_BPartner_ID      NUMERIC(10),            -- Tercero (productor) resuelto por CodigoProductor/TaxID
    RawKoboJSON        TEXT,                   -- Submission JSON completo, respaldo/auditoria

    -- geopoint ubicacion_visita, separado en componentes
    UbicacionLatitud  NUMERIC(10,6),
    UbicacionLongitud NUMERIC(10,6),
    UbicacionAltitud  NUMERIC(10,2),
    UbicacionPrecision NUMERIC(10,2),
    HoraInicio                 TIMESTAMP,      
    HoraFin                    TIMESTAMP,      
    FechaSistema               DATE,           
    UsuarioApp                 VARCHAR(100),   
    IdDispositivo              VARCHAR(100),   

    -- ---- DATOS GENERALES ----
    CodigoProductor            VARCHAR(60),      -- Código del productor
    NombreProductor            VARCHAR(200),     -- Nombre del productor
    FechaVisita                DATE,             -- Fecha de la visita
    Semana                     NUMERIC(10,0),    -- Semana del año
    TipoVisita                 VARCHAR(15),      -- Tipo de visita
    TecnicoResponsable         VARCHAR(200),     -- Técnico responsable
    ClaveUnica                 VARCHAR(120),   

    -- ---- INFRAESTRUCTURA ----
    EmpPiso                    VARCHAR(15),      -- Piso de concreto y en buen estado
    EmpPisoPts                 NUMERIC(1,0),   
    EmpMallaSaran              VARCHAR(15),      -- Dispone de malla sarán
    EmpMallaSaranPts           NUMERIC(1,0),   
    EmpFacilLimpieza           VARCHAR(15),      -- Superficies de fácil limpieza
    EmpFacilLimpiezaPts        NUMERIC(1,0),   
    EmpPerimetro               VARCHAR(15),      -- Perímetro sin malezas
    EmpPerimetroPts            NUMERIC(1,0),   
    EmpEstructuraMetalica      VARCHAR(15),      -- Estructura metálica en buen estado
    EmpEstructuraMetalicaPts   NUMERIC(1,0),   
    BqRepisas                  VARCHAR(15),      -- Dispone de 3 repisas de metal o cemento
    BqRepisasPts               NUMERIC(1,0),   
    BqVentilada                VARCHAR(15),      -- Ventilada y separada de la empacadora
    BqVentiladaPts             NUMERIC(1,0),   
    BqBajoLlave                VARCHAR(15),      -- Acceso asegurado bajo llave
    BqBajoLlavePts             NUMERIC(1,0),   
    BcPuertaOrden              VARCHAR(15),      -- Con puerta, ordenada y limpia
    BcPuertaOrdenPts           NUMERIC(1,0),   
    ZmDuchaLavaojos            VARCHAR(15),      -- Ducha y lavaojos de emergencia
    ZmDuchaLavaojosPts         NUMERIC(1,0),   
    ZmBordeRetencion           VARCHAR(15),      -- Borde de retención
    ZmBordeRetencionPts        NUMERIC(1,0),   
    ZmFosaDescontaminacion     VARCHAR(15),      -- Fosa de descontaminación
    ZmFosaDescontaminacionPts  NUMERIC(1,0),   
    PrPiso                     VARCHAR(15),      -- Piso de ripio o concreto
    PrPisoPts                  NUMERIC(1,0),   
    PrLimpio                   VARCHAR(15),      -- Limpio y sin basura
    PrLimpioPts                NUMERIC(1,0),   
    PrTecho                    VARCHAR(15),      -- Techo con estructura metálica
    PrTechoPts                 NUMERIC(1,0),   
    PedAguaClorada             VARCHAR(15),      -- Con agua clorada
    PedAguaCloradaPts          NUMERIC(1,0),   
    PedDesague                 VARCHAR(15),      -- Desagüe a pozo
    PedDesaguePts              NUMERIC(1,0),   
    PedIngreso                 VARCHAR(15),      -- Ubicado en el ingreso de la empacadora
    PedIngresoPts              NUMERIC(1,0),   
    FdTapa                     VARCHAR(15),      -- Con tapa protectora
    FdTapaPts                  NUMERIC(1,0),   
    FdLimpia                   VARCHAR(15),      -- Libre de maleza y basura
    FdLimpiaPts                NUMERIC(1,0),   
    BanoAgua                   VARCHAR(15),      -- Dispone de agua
    BanoAguaPts                NUMERIC(1,0),   
    BanoBasurero               VARCHAR(15),      -- Dispone de basurero
    BanoBasureroPts            NUMERIC(1,0),   
    BanoPapel                  VARCHAR(15),      -- Dispone de papel higiénico
    BanoPapelPts               NUMERIC(1,0),   
    LavAgua                    VARCHAR(15),      -- Con agua limpia
    LavAguaPts                 NUMERIC(1,0),   
    LavDesague                 VARCHAR(15),      -- Desagüe a pozo
    LavDesaguePts              NUMERIC(1,0),   
    LavJabon                   VARCHAR(15),      -- Con jabón sin olor
    LavJabonPts                NUMERIC(1,0),   
    LavToalla                  VARCHAR(15),      -- Con toalla de papel
    LavToallaPts               NUMERIC(1,0),   
    PuntajeInfraestructura     NUMERIC(5,0),   

    -- ---- EQUIPOS ----
    ELprTanque                 VARCHAR(15),      -- Tanque limpio y de uso exclusivo
    ELprTanquePts              NUMERIC(1,0),   
    ELprTendedero              VARCHAR(15),      -- Dispone de tendedero
    ELprTendederoPts           NUMERIC(1,0),   
    ETinasEstado               VARCHAR(15),      -- Limpias y en buen estado
    ETinasEstadoPts            NUMERIC(1,0),   
    ETinasNumero               VARCHAR(15),      -- Número acorde al proceso
    ETinasNumeroPts            NUMERIC(1,0),   
    EBalanzaEstado             VARCHAR(15),      -- Limpia y en buen estado
    EBalanzaEstadoPts          NUMERIC(1,0),   
    EBalanzaCalibrada          VARCHAR(15),      -- Calibrada
    EBalanzaCalibradaPts       NUMERIC(1,0),   
    EPlatosEstado              VARCHAR(15),      -- Limpios y en buen estado; mínimo 10
    EPlatosEstadoPts           NUMERIC(1,0),   
    EPlatosProtectores         VARCHAR(15),      -- Con protectores de platos
    EPlatosProtectoresPts      NUMERIC(1,0),   
    ECalibrador                VARCHAR(15),      -- Calibrador limpio y funcional
    ECalibradorPts             NUMERIC(1,0),   
    EMesaAcolchada             VARCHAR(15),      -- Mesa de empaque acolchada, limpia y en buen estado
    EMesaAcolchadaPts          NUMERIC(1,0),   
    EMesaFacilLimpieza         VARCHAR(15),      -- Mesa de material de fácil limpieza
    EMesaFacilLimpiezaPts      NUMERIC(1,0),   
    EDosificadores             VARCHAR(15),      -- Dosificadores limpios y en buen estado
    EDosificadoresPts          NUMERIC(1,0),   
    PuntajeEquipos             NUMERIC(5,0),   

    -- ---- HIGIENE, INOCUIDAD Y SEGURIDAD ----
    HRacimosColgadero          VARCHAR(15),      -- Colocados en colgadero
    HRacimosColgaderoPts       NUMERIC(1,0),   
    HCultivoSinBasura          VARCHAR(15),      -- Libre de basura común
    HCultivoSinBasuraPts       NUMERIC(1,0),   
    HCultivoSinAnimales        VARCHAR(15),      -- Sin presencia significativa de animales
    HCultivoSinAnimalesPts     NUMERIC(1,0),   
    HCultivoSinVertidos        VARCHAR(15),      -- Libre de vertidos de aguas grises o negras
    HCultivoSinVertidosPts     NUMERIC(1,0),   
    HSinRaquis                 VARCHAR(15),      -- Sin raquis dispersos en el cultivo
    HSinRaquisPts              NUMERIC(1,0),   
    HRetiroRestos              VARCHAR(15),      -- Retiro de restos de cosecha anterior
    HRetiroRestosPts           NUMERIC(1,0),   
    HEnvasesTripleLavado       VARCHAR(15),      -- Triple lavado y almacenamiento bajo llave hasta la gestión final
    HEnvasesTripleLavadoPts    NUMERIC(1,0),   
    HEmpacadoraLimpia          VARCHAR(15),      -- Limpia y ordenada
    HEmpacadoraLimpiaPts       NUMERIC(1,0),   
    HEmpacadoraSinAnimales     VARCHAR(15),      -- Sin presencia de animales
    HEmpacadoraSinAnimalesPts  NUMERIC(1,0),   
    HInmediacionesLimpias      VARCHAR(15),      -- Libres de basura
    HInmediacionesLimpiasPts   NUMERIC(1,0),   
    HCloracionCorrecta         VARCHAR(15),      -- Dosificación correcta
    HCloracionCorrectaPts      NUMERIC(1,0),   
    HMaterialesPalets          VARCHAR(15),      -- Materiales sobre pallets
    HMaterialesPaletsPts       NUMERIC(1,0),   
    HFrutaPalets               VARCHAR(15),      -- Fruta empacada sobre pallets
    HFrutaPaletsPts            NUMERIC(1,0),   
    HCarpetaActualizada        VARCHAR(15),      -- Carpeta de registros actualizada al menos hasta la semana anterior
    HCarpetaActualizadaPts     NUMERIC(1,0),   
    HEppGeneral                VARCHAR(15),      -- Uso de guantes, cofia, mandil y zapatos cerrados
    HEppGeneralPts             NUMERIC(1,0),   
    HEppTinas                  VARCHAR(15),      -- Uso de mascarilla y visor en tinas
    HEppTinasPts               NUMERIC(1,0),   
    HEppEnfunde                VARCHAR(15),      -- Uso de mascarilla con filtro durante el enfunde
    HEppEnfundePts             NUMERIC(1,0),   
    HUsanLavamanos             VARCHAR(15),      -- Usan lavamanos y pediluvio
    HUsanLavamanosPts          NUMERIC(1,0),   
    HAreaAlimentos             VARCHAR(15),      -- Usan áreas exclusivas para consumir alimentos
    HAreaAlimentosPts          NUMERIC(1,0),   
    HSinAccesorios             VARCHAR(15),      -- Sin pulseras, collares ni anillos durante el proceso
    HSinAccesoriosPts          NUMERIC(1,0),   
    HBotiquinExtintor          VARCHAR(15),      -- Botiquín abastecido y extintor vigente
    HBotiquinExtintorPts       NUMERIC(1,0),   
    PuntajeHigiene             NUMERIC(5,0),   

    -- ---- CONTROL DE LABORES POSTCOSECHA ----
    PcPhRango                  VARCHAR(15),      -- pH del tratamiento dentro del rango
    PcPhRangoPts               NUMERIC(1,0),   
    PcTinaFruta                VARCHAR(15),      -- Fruta no amontonada en la tina
    PcTinaFrutaPts             NUMERIC(1,0),   
    PcCambioAgua               VARCHAR(15),      -- Cambio de agua cada 100 racimos
    PcCambioAguaPts            NUMERIC(1,0),   
    PcPlatos                   VARCHAR(15),      -- Mínimo 10 platos escurriendo y fruta no amontonada
    PcPlatosPts                NUMERIC(1,0),   
    PcSaneo                    VARCHAR(15),      -- Saneo correcto en caja de 7 kg
    PcSaneoPts                 NUMERIC(1,0),   
    PcEsquineros               VARCHAR(15),      -- Elimina esquineros en caja de 7 kg
    PcEsquinerosPts            NUMERIC(1,0),   
    PcInmersion                VARCHAR(15),      -- Inmersión correcta de toda la mano o clúster
    PcInmersionPts             NUMERIC(1,0),   
    PcDosificacion             VARCHAR(15),      -- Dosificación correcta del tratamiento
    PcDosificacionPts          NUMERIC(1,0),   
    PcAspersor                 VARCHAR(15),      -- Aspersor limpio
    PcAspersorPts              NUMERIC(1,0),   
    PcAspersion                VARCHAR(15),      -- Aspersión realizada correctamente
    PcAspersionPts             NUMERIC(1,0),   
    PuntajePostcosecha         NUMERIC(5,0),   

    -- ---- CONTROL DE CALIDAD DE CAJAS ----
    CajasEvaluadas             NUMERIC(10,0),    -- Número de cajas evaluadas
    CajasDanoMecanico          NUMERIC(10,0),    -- Cajas con daños mecánicos (golpes, curvo o raspones)
    CajasDanoInsectos          NUMERIC(10,0),    -- Cajas con daño por insectos
    CajasDanoHongos            NUMERIC(10,0),    -- Cajas con daño por hongos
    CajasPresenciaInsectos     NUMERIC(10,0),    -- Cajas con presencia de insectos
    GradoColorCorrecto         VARCHAR(15),      -- Grado correcto y color de almendra
    TotalNoConformidades       NUMERIC(5,0),   

    -- ---- CONTROL AGRICOLA ----
    AgSinThrips                VARCHAR(15),      -- Sin presencia de thrips
    AgSinThripsPts             NUMERIC(1,0),   
    AgSinPulgon                VARCHAR(15),      -- Sin presencia de pulgón
    AgSinPulgonPts             NUMERIC(1,0),   
    AgSinCochinilla            VARCHAR(15),      -- Sin presencia de cochinilla
    AgSinCochinillaPts         NUMERIC(1,0),   
    AgSinHormigas              VARCHAR(15),      -- Sin presencia de hormigas que afecten el cultivo
    AgSinHormigasPts           NUMERIC(1,0),   
    AgSinPuntaCigarro          VARCHAR(15),      -- Sin punta de cigarro
    AgSinPuntaCigarroPts       NUMERIC(1,0),   
    AgSinFusariumR4            VARCHAR(15),      -- Sin síntomas de Fusarium raza 4
    AgSinFusariumR4Pts         NUMERIC(1,0),   
    AgSinMoko                  VARCHAR(15),      -- Sin síntomas de moko
    AgSinMokoPts               NUMERIC(1,0),   
    AgSinSigatoka              VARCHAR(15),      -- Sin afectación de sigatoka
    AgSinSigatokaPts           NUMERIC(1,0),   
    AgControlMaleza            VARCHAR(15),      -- Control de maleza realizado
    AgControlMalezaPts         NUMERIC(1,0),   
    AgDeshoje                  VARCHAR(15),      -- Deshoje realizado correctamente
    AgDeshojePts               NUMERIC(1,0),   
    AgDeshije                  VARCHAR(15),      -- Deshije realizado correctamente
    AgDeshijePts               NUMERIC(1,0),   
    AgDeschante                VARCHAR(15),      -- Deschante realizado correctamente
    AgDeschantePts             NUMERIC(1,0),   
    AgDestalle                 VARCHAR(15),      -- Destalle realizado correctamente
    AgDestallePts              NUMERIC(1,0),   
    AgResiembra                VARCHAR(15),      -- Resiembra realizada cuando corresponde
    AgResiembraPts             NUMERIC(1,0),   
    AgCintaCorrecta            VARCHAR(15),      -- Cinta correcta
    AgCintaCorrectaPts         NUMERIC(1,0),   
    AgRacimosDaypas            VARCHAR(15),      -- Racimos con daypas
    AgRacimosDaypasPts         NUMERIC(1,0),   
    AgDeschiveDesflore         VARCHAR(15),      -- Deschive y desflore correctos
    AgDeschiveDesflorePts      NUMERIC(1,0),   
    AgControlHormigas          VARCHAR(15),      -- Control de hormigas realizado cuando corresponde
    AgControlHormigasPts       NUMERIC(1,0),   
    AgControlSigatoka          VARCHAR(15),      -- Control de sigatoka realizado cuando corresponde
    AgControlSigatokaPts       NUMERIC(1,0),   
    AgFertilizo                VARCHAR(15),      -- Realizó fertilización
    AgFertilizoPts             NUMERIC(1,0),   
    AgPlanDefinido             VARCHAR(15),      -- Dispone de un plan de fertilización definido
    AgPlanDefinidoPts          NUMERIC(1,0),   
    AgFertilizoFinca           VARCHAR(15),      -- Fertilizó toda el área planificada
    AgFertilizoFincaPts        NUMERIC(1,0),   
    AgEnraizamiento            VARCHAR(15),      -- Realizó enraizamiento vía drench cuando correspondía
    AgEnraizamientoPts         NUMERIC(1,0),   
    AgFertilizacionEdafica     VARCHAR(15),      -- Realizó fertilización edáfica con granulados cuando correspondía
    AgFertilizacionEdaficaPts  NUMERIC(1,0),   
    TipoPlanFertilizacion      VARCHAR(15),      -- Tipo de plan de fertilización
    ProductosFertilizacion     VARCHAR(500),     -- Productos utilizados
    NumeroFasesFertilizacion   NUMERIC(10,0),    -- Número de fases de fertilización
    FechaLimiteCumplimiento    DATE,             -- Fecha límite para cumplir las acciones pendientes
    PuntajeAgricola            NUMERIC(5,0),   
    CalificacionAgricola       VARCHAR(20),    
    PuntajeGlobal              NUMERIC(5,0),   
    PorcentajeGlobal           NUMERIC(5,2),   

    -- ---- OBSERVACIONES, EVIDENCIA Y FIRMA ----
    Observaciones              VARCHAR(2000),    -- Observaciones
    Recomendaciones            VARCHAR(2000),    -- Recomendaciones y acciones correctivas
    FotoEvidencia              VARCHAR(255),     -- Fotografía de evidencia
    ProductorPresente          VARCHAR(15),      -- ¿El productor o su representante estuvo presente?
    NombreFirmante             VARCHAR(200),     -- Nombre de quien firma
    FirmaProductor             VARCHAR(255),     -- Firma del productor o representante
    MotivoSinFirma             VARCHAR(500),     -- Motivo por el que no se obtuvo la firma

    CONSTRAINT COMUS_TechnicalVisit_KEY PRIMARY KEY (COMUS_TechnicalVisit_ID)
);

ALTER TABLE COMUS_TechnicalVisit
    ADD CONSTRAINT COMUS_TechVisit_KoboSubm_UQ UNIQUE (KoboSubmissionID);

CREATE INDEX COMUS_TechVisit_BPartner_IDX ON COMUS_TechnicalVisit (C_BPartner_ID);
CREATE INDEX COMUS_TechVisit_CodProd_IDX   ON COMUS_TechnicalVisit (CodigoProductor);
CREATE INDEX COMUS_TechVisit_FechaVis_IDX  ON COMUS_TechnicalVisit (FechaVisita);

-- =====================================================================
-- Reference Lists a crear en Application Dictionary y asignar a las
-- columnas VARCHAR(15) correspondientes (mismos codigos que usa Kobo,
-- para que el import copie el valor sin traducir):
--
--   COMUS_Escala210   (~50 columnas *_pts pareadas): tiene / parcial / no_tiene
--   COMUS_CumpleNo    (calidad_cajas + gran parte de control_agricola): cumple / no_cumple
--   COMUS_CumpleNa    (labores_opcionales): cumple / no_cumple / no_aplica
--   COMUS_SiNo        (ProductorPresente): si / no
--   COMUS_TipoVisita  (TipoVisita): primera / seguimiento / verificacion / otra
--   COMUS_TipoPlanFert(TipoPlanFertilizacion): propio / flp / otro / no_definido
-- =====================================================================
