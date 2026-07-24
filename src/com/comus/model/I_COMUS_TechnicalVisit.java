/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package com.comus.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for COMUS_TechnicalVisit
 *  @author iDempiere (generated) 
 *  @version Release 8.2
 */
@SuppressWarnings("all")
public interface I_COMUS_TechnicalVisit 
{

    /** TableName=COMUS_TechnicalVisit */
    public static final String Table_Name = "COMUS_TechnicalVisit";

    /** AD_Table_ID=1000118 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AgCintaCorrecta */
    public static final String COLUMNNAME_AgCintaCorrecta = "AgCintaCorrecta";

	/** Set AgCintaCorrecta	  */
	public void setAgCintaCorrecta (String AgCintaCorrecta);

	/** Get AgCintaCorrecta	  */
	public String getAgCintaCorrecta();

    /** Column name AgCintaCorrectaPts */
    public static final String COLUMNNAME_AgCintaCorrectaPts = "AgCintaCorrectaPts";

	/** Set AgCintaCorrectaPts	  */
	public void setAgCintaCorrectaPts (BigDecimal AgCintaCorrectaPts);

	/** Get AgCintaCorrectaPts	  */
	public BigDecimal getAgCintaCorrectaPts();

    /** Column name AgControlHormigas */
    public static final String COLUMNNAME_AgControlHormigas = "AgControlHormigas";

	/** Set AgControlHormigas	  */
	public void setAgControlHormigas (String AgControlHormigas);

	/** Get AgControlHormigas	  */
	public String getAgControlHormigas();

    /** Column name AgControlHormigasPts */
    public static final String COLUMNNAME_AgControlHormigasPts = "AgControlHormigasPts";

	/** Set AgControlHormigasPts	  */
	public void setAgControlHormigasPts (BigDecimal AgControlHormigasPts);

	/** Get AgControlHormigasPts	  */
	public BigDecimal getAgControlHormigasPts();

    /** Column name AgControlMaleza */
    public static final String COLUMNNAME_AgControlMaleza = "AgControlMaleza";

	/** Set AgControlMaleza	  */
	public void setAgControlMaleza (String AgControlMaleza);

	/** Get AgControlMaleza	  */
	public String getAgControlMaleza();

    /** Column name AgControlMalezaPts */
    public static final String COLUMNNAME_AgControlMalezaPts = "AgControlMalezaPts";

	/** Set AgControlMalezaPts	  */
	public void setAgControlMalezaPts (BigDecimal AgControlMalezaPts);

	/** Get AgControlMalezaPts	  */
	public BigDecimal getAgControlMalezaPts();

    /** Column name AgControlSigatoka */
    public static final String COLUMNNAME_AgControlSigatoka = "AgControlSigatoka";

	/** Set AgControlSigatoka	  */
	public void setAgControlSigatoka (String AgControlSigatoka);

	/** Get AgControlSigatoka	  */
	public String getAgControlSigatoka();

    /** Column name AgControlSigatokaPts */
    public static final String COLUMNNAME_AgControlSigatokaPts = "AgControlSigatokaPts";

	/** Set AgControlSigatokaPts	  */
	public void setAgControlSigatokaPts (BigDecimal AgControlSigatokaPts);

	/** Get AgControlSigatokaPts	  */
	public BigDecimal getAgControlSigatokaPts();

    /** Column name AgDeschante */
    public static final String COLUMNNAME_AgDeschante = "AgDeschante";

	/** Set AgDeschante	  */
	public void setAgDeschante (String AgDeschante);

	/** Get AgDeschante	  */
	public String getAgDeschante();

    /** Column name AgDeschantePts */
    public static final String COLUMNNAME_AgDeschantePts = "AgDeschantePts";

	/** Set AgDeschantePts	  */
	public void setAgDeschantePts (BigDecimal AgDeschantePts);

	/** Get AgDeschantePts	  */
	public BigDecimal getAgDeschantePts();

    /** Column name AgDeschiveDesflore */
    public static final String COLUMNNAME_AgDeschiveDesflore = "AgDeschiveDesflore";

	/** Set AgDeschiveDesflore	  */
	public void setAgDeschiveDesflore (String AgDeschiveDesflore);

	/** Get AgDeschiveDesflore	  */
	public String getAgDeschiveDesflore();

    /** Column name AgDeschiveDesflorePts */
    public static final String COLUMNNAME_AgDeschiveDesflorePts = "AgDeschiveDesflorePts";

	/** Set AgDeschiveDesflorePts	  */
	public void setAgDeschiveDesflorePts (BigDecimal AgDeschiveDesflorePts);

	/** Get AgDeschiveDesflorePts	  */
	public BigDecimal getAgDeschiveDesflorePts();

    /** Column name AgDeshije */
    public static final String COLUMNNAME_AgDeshije = "AgDeshije";

	/** Set AgDeshije	  */
	public void setAgDeshije (String AgDeshije);

	/** Get AgDeshije	  */
	public String getAgDeshije();

    /** Column name AgDeshijePts */
    public static final String COLUMNNAME_AgDeshijePts = "AgDeshijePts";

	/** Set AgDeshijePts	  */
	public void setAgDeshijePts (BigDecimal AgDeshijePts);

	/** Get AgDeshijePts	  */
	public BigDecimal getAgDeshijePts();

    /** Column name AgDeshoje */
    public static final String COLUMNNAME_AgDeshoje = "AgDeshoje";

	/** Set AgDeshoje	  */
	public void setAgDeshoje (String AgDeshoje);

	/** Get AgDeshoje	  */
	public String getAgDeshoje();

    /** Column name AgDeshojePts */
    public static final String COLUMNNAME_AgDeshojePts = "AgDeshojePts";

	/** Set AgDeshojePts	  */
	public void setAgDeshojePts (BigDecimal AgDeshojePts);

	/** Get AgDeshojePts	  */
	public BigDecimal getAgDeshojePts();

    /** Column name AgDestalle */
    public static final String COLUMNNAME_AgDestalle = "AgDestalle";

	/** Set AgDestalle	  */
	public void setAgDestalle (String AgDestalle);

	/** Get AgDestalle	  */
	public String getAgDestalle();

    /** Column name AgDestallePts */
    public static final String COLUMNNAME_AgDestallePts = "AgDestallePts";

	/** Set AgDestallePts	  */
	public void setAgDestallePts (BigDecimal AgDestallePts);

	/** Get AgDestallePts	  */
	public BigDecimal getAgDestallePts();

    /** Column name AgEnraizamiento */
    public static final String COLUMNNAME_AgEnraizamiento = "AgEnraizamiento";

	/** Set AgEnraizamiento	  */
	public void setAgEnraizamiento (String AgEnraizamiento);

	/** Get AgEnraizamiento	  */
	public String getAgEnraizamiento();

    /** Column name AgEnraizamientoPts */
    public static final String COLUMNNAME_AgEnraizamientoPts = "AgEnraizamientoPts";

	/** Set AgEnraizamientoPts	  */
	public void setAgEnraizamientoPts (BigDecimal AgEnraizamientoPts);

	/** Get AgEnraizamientoPts	  */
	public BigDecimal getAgEnraizamientoPts();

    /** Column name AgFertilizacionEdafica */
    public static final String COLUMNNAME_AgFertilizacionEdafica = "AgFertilizacionEdafica";

	/** Set AgFertilizacionEdafica	  */
	public void setAgFertilizacionEdafica (String AgFertilizacionEdafica);

	/** Get AgFertilizacionEdafica	  */
	public String getAgFertilizacionEdafica();

    /** Column name AgFertilizacionEdaficaPts */
    public static final String COLUMNNAME_AgFertilizacionEdaficaPts = "AgFertilizacionEdaficaPts";

	/** Set AgFertilizacionEdaficaPts	  */
	public void setAgFertilizacionEdaficaPts (BigDecimal AgFertilizacionEdaficaPts);

	/** Get AgFertilizacionEdaficaPts	  */
	public BigDecimal getAgFertilizacionEdaficaPts();

    /** Column name AgFertilizo */
    public static final String COLUMNNAME_AgFertilizo = "AgFertilizo";

	/** Set AgFertilizo	  */
	public void setAgFertilizo (String AgFertilizo);

	/** Get AgFertilizo	  */
	public String getAgFertilizo();

    /** Column name AgFertilizoFinca */
    public static final String COLUMNNAME_AgFertilizoFinca = "AgFertilizoFinca";

	/** Set AgFertilizoFinca	  */
	public void setAgFertilizoFinca (String AgFertilizoFinca);

	/** Get AgFertilizoFinca	  */
	public String getAgFertilizoFinca();

    /** Column name AgFertilizoFincaPts */
    public static final String COLUMNNAME_AgFertilizoFincaPts = "AgFertilizoFincaPts";

	/** Set AgFertilizoFincaPts	  */
	public void setAgFertilizoFincaPts (BigDecimal AgFertilizoFincaPts);

	/** Get AgFertilizoFincaPts	  */
	public BigDecimal getAgFertilizoFincaPts();

    /** Column name AgFertilizoPts */
    public static final String COLUMNNAME_AgFertilizoPts = "AgFertilizoPts";

	/** Set AgFertilizoPts	  */
	public void setAgFertilizoPts (BigDecimal AgFertilizoPts);

	/** Get AgFertilizoPts	  */
	public BigDecimal getAgFertilizoPts();

    /** Column name AgPlanDefinido */
    public static final String COLUMNNAME_AgPlanDefinido = "AgPlanDefinido";

	/** Set AgPlanDefinido	  */
	public void setAgPlanDefinido (String AgPlanDefinido);

	/** Get AgPlanDefinido	  */
	public String getAgPlanDefinido();

    /** Column name AgPlanDefinidoPts */
    public static final String COLUMNNAME_AgPlanDefinidoPts = "AgPlanDefinidoPts";

	/** Set AgPlanDefinidoPts	  */
	public void setAgPlanDefinidoPts (BigDecimal AgPlanDefinidoPts);

	/** Get AgPlanDefinidoPts	  */
	public BigDecimal getAgPlanDefinidoPts();

    /** Column name AgRacimosDaypas */
    public static final String COLUMNNAME_AgRacimosDaypas = "AgRacimosDaypas";

	/** Set AgRacimosDaypas	  */
	public void setAgRacimosDaypas (String AgRacimosDaypas);

	/** Get AgRacimosDaypas	  */
	public String getAgRacimosDaypas();

    /** Column name AgRacimosDaypasPts */
    public static final String COLUMNNAME_AgRacimosDaypasPts = "AgRacimosDaypasPts";

	/** Set AgRacimosDaypasPts	  */
	public void setAgRacimosDaypasPts (BigDecimal AgRacimosDaypasPts);

	/** Get AgRacimosDaypasPts	  */
	public BigDecimal getAgRacimosDaypasPts();

    /** Column name AgResiembra */
    public static final String COLUMNNAME_AgResiembra = "AgResiembra";

	/** Set AgResiembra	  */
	public void setAgResiembra (String AgResiembra);

	/** Get AgResiembra	  */
	public String getAgResiembra();

    /** Column name AgResiembraPts */
    public static final String COLUMNNAME_AgResiembraPts = "AgResiembraPts";

	/** Set AgResiembraPts	  */
	public void setAgResiembraPts (BigDecimal AgResiembraPts);

	/** Get AgResiembraPts	  */
	public BigDecimal getAgResiembraPts();

    /** Column name AgSinCochinilla */
    public static final String COLUMNNAME_AgSinCochinilla = "AgSinCochinilla";

	/** Set AgSinCochinilla	  */
	public void setAgSinCochinilla (String AgSinCochinilla);

	/** Get AgSinCochinilla	  */
	public String getAgSinCochinilla();

    /** Column name AgSinCochinillaPts */
    public static final String COLUMNNAME_AgSinCochinillaPts = "AgSinCochinillaPts";

	/** Set AgSinCochinillaPts	  */
	public void setAgSinCochinillaPts (BigDecimal AgSinCochinillaPts);

	/** Get AgSinCochinillaPts	  */
	public BigDecimal getAgSinCochinillaPts();

    /** Column name AgSinFusariumR4 */
    public static final String COLUMNNAME_AgSinFusariumR4 = "AgSinFusariumR4";

	/** Set AgSinFusariumR4	  */
	public void setAgSinFusariumR4 (String AgSinFusariumR4);

	/** Get AgSinFusariumR4	  */
	public String getAgSinFusariumR4();

    /** Column name AgSinFusariumR4Pts */
    public static final String COLUMNNAME_AgSinFusariumR4Pts = "AgSinFusariumR4Pts";

	/** Set AgSinFusariumR4Pts	  */
	public void setAgSinFusariumR4Pts (BigDecimal AgSinFusariumR4Pts);

	/** Get AgSinFusariumR4Pts	  */
	public BigDecimal getAgSinFusariumR4Pts();

    /** Column name AgSinHormigas */
    public static final String COLUMNNAME_AgSinHormigas = "AgSinHormigas";

	/** Set AgSinHormigas	  */
	public void setAgSinHormigas (String AgSinHormigas);

	/** Get AgSinHormigas	  */
	public String getAgSinHormigas();

    /** Column name AgSinHormigasPts */
    public static final String COLUMNNAME_AgSinHormigasPts = "AgSinHormigasPts";

	/** Set AgSinHormigasPts	  */
	public void setAgSinHormigasPts (BigDecimal AgSinHormigasPts);

	/** Get AgSinHormigasPts	  */
	public BigDecimal getAgSinHormigasPts();

    /** Column name AgSinMoko */
    public static final String COLUMNNAME_AgSinMoko = "AgSinMoko";

	/** Set AgSinMoko	  */
	public void setAgSinMoko (String AgSinMoko);

	/** Get AgSinMoko	  */
	public String getAgSinMoko();

    /** Column name AgSinMokoPts */
    public static final String COLUMNNAME_AgSinMokoPts = "AgSinMokoPts";

	/** Set AgSinMokoPts	  */
	public void setAgSinMokoPts (BigDecimal AgSinMokoPts);

	/** Get AgSinMokoPts	  */
	public BigDecimal getAgSinMokoPts();

    /** Column name AgSinPulgon */
    public static final String COLUMNNAME_AgSinPulgon = "AgSinPulgon";

	/** Set AgSinPulgon	  */
	public void setAgSinPulgon (String AgSinPulgon);

	/** Get AgSinPulgon	  */
	public String getAgSinPulgon();

    /** Column name AgSinPulgonPts */
    public static final String COLUMNNAME_AgSinPulgonPts = "AgSinPulgonPts";

	/** Set AgSinPulgonPts	  */
	public void setAgSinPulgonPts (BigDecimal AgSinPulgonPts);

	/** Get AgSinPulgonPts	  */
	public BigDecimal getAgSinPulgonPts();

    /** Column name AgSinPuntaCigarro */
    public static final String COLUMNNAME_AgSinPuntaCigarro = "AgSinPuntaCigarro";

	/** Set AgSinPuntaCigarro	  */
	public void setAgSinPuntaCigarro (String AgSinPuntaCigarro);

	/** Get AgSinPuntaCigarro	  */
	public String getAgSinPuntaCigarro();

    /** Column name AgSinPuntaCigarroPts */
    public static final String COLUMNNAME_AgSinPuntaCigarroPts = "AgSinPuntaCigarroPts";

	/** Set AgSinPuntaCigarroPts	  */
	public void setAgSinPuntaCigarroPts (BigDecimal AgSinPuntaCigarroPts);

	/** Get AgSinPuntaCigarroPts	  */
	public BigDecimal getAgSinPuntaCigarroPts();

    /** Column name AgSinSigatoka */
    public static final String COLUMNNAME_AgSinSigatoka = "AgSinSigatoka";

	/** Set AgSinSigatoka	  */
	public void setAgSinSigatoka (String AgSinSigatoka);

	/** Get AgSinSigatoka	  */
	public String getAgSinSigatoka();

    /** Column name AgSinSigatokaPts */
    public static final String COLUMNNAME_AgSinSigatokaPts = "AgSinSigatokaPts";

	/** Set AgSinSigatokaPts	  */
	public void setAgSinSigatokaPts (BigDecimal AgSinSigatokaPts);

	/** Get AgSinSigatokaPts	  */
	public BigDecimal getAgSinSigatokaPts();

    /** Column name AgSinThrips */
    public static final String COLUMNNAME_AgSinThrips = "AgSinThrips";

	/** Set AgSinThrips	  */
	public void setAgSinThrips (String AgSinThrips);

	/** Get AgSinThrips	  */
	public String getAgSinThrips();

    /** Column name AgSinThripsPts */
    public static final String COLUMNNAME_AgSinThripsPts = "AgSinThripsPts";

	/** Set AgSinThripsPts	  */
	public void setAgSinThripsPts (BigDecimal AgSinThripsPts);

	/** Get AgSinThripsPts	  */
	public BigDecimal getAgSinThripsPts();

    /** Column name BanoAgua */
    public static final String COLUMNNAME_BanoAgua = "BanoAgua";

	/** Set BanoAgua	  */
	public void setBanoAgua (String BanoAgua);

	/** Get BanoAgua	  */
	public String getBanoAgua();

    /** Column name BanoAguaPts */
    public static final String COLUMNNAME_BanoAguaPts = "BanoAguaPts";

	/** Set BanoAguaPts	  */
	public void setBanoAguaPts (BigDecimal BanoAguaPts);

	/** Get BanoAguaPts	  */
	public BigDecimal getBanoAguaPts();

    /** Column name BanoBasurero */
    public static final String COLUMNNAME_BanoBasurero = "BanoBasurero";

	/** Set BanoBasurero	  */
	public void setBanoBasurero (String BanoBasurero);

	/** Get BanoBasurero	  */
	public String getBanoBasurero();

    /** Column name BanoBasureroPts */
    public static final String COLUMNNAME_BanoBasureroPts = "BanoBasureroPts";

	/** Set BanoBasureroPts	  */
	public void setBanoBasureroPts (BigDecimal BanoBasureroPts);

	/** Get BanoBasureroPts	  */
	public BigDecimal getBanoBasureroPts();

    /** Column name BanoPapel */
    public static final String COLUMNNAME_BanoPapel = "BanoPapel";

	/** Set BanoPapel	  */
	public void setBanoPapel (String BanoPapel);

	/** Get BanoPapel	  */
	public String getBanoPapel();

    /** Column name BanoPapelPts */
    public static final String COLUMNNAME_BanoPapelPts = "BanoPapelPts";

	/** Set BanoPapelPts	  */
	public void setBanoPapelPts (BigDecimal BanoPapelPts);

	/** Get BanoPapelPts	  */
	public BigDecimal getBanoPapelPts();

    /** Column name BcPuertaOrden */
    public static final String COLUMNNAME_BcPuertaOrden = "BcPuertaOrden";

	/** Set BcPuertaOrden	  */
	public void setBcPuertaOrden (String BcPuertaOrden);

	/** Get BcPuertaOrden	  */
	public String getBcPuertaOrden();

    /** Column name BcPuertaOrdenPts */
    public static final String COLUMNNAME_BcPuertaOrdenPts = "BcPuertaOrdenPts";

	/** Set BcPuertaOrdenPts	  */
	public void setBcPuertaOrdenPts (BigDecimal BcPuertaOrdenPts);

	/** Get BcPuertaOrdenPts	  */
	public BigDecimal getBcPuertaOrdenPts();

    /** Column name BqBajoLlave */
    public static final String COLUMNNAME_BqBajoLlave = "BqBajoLlave";

	/** Set BqBajoLlave	  */
	public void setBqBajoLlave (String BqBajoLlave);

	/** Get BqBajoLlave	  */
	public String getBqBajoLlave();

    /** Column name BqBajoLlavePts */
    public static final String COLUMNNAME_BqBajoLlavePts = "BqBajoLlavePts";

	/** Set BqBajoLlavePts	  */
	public void setBqBajoLlavePts (BigDecimal BqBajoLlavePts);

	/** Get BqBajoLlavePts	  */
	public BigDecimal getBqBajoLlavePts();

    /** Column name BqRepisas */
    public static final String COLUMNNAME_BqRepisas = "BqRepisas";

	/** Set BqRepisas	  */
	public void setBqRepisas (String BqRepisas);

	/** Get BqRepisas	  */
	public String getBqRepisas();

    /** Column name BqRepisasPts */
    public static final String COLUMNNAME_BqRepisasPts = "BqRepisasPts";

	/** Set BqRepisasPts	  */
	public void setBqRepisasPts (BigDecimal BqRepisasPts);

	/** Get BqRepisasPts	  */
	public BigDecimal getBqRepisasPts();

    /** Column name BqVentilada */
    public static final String COLUMNNAME_BqVentilada = "BqVentilada";

	/** Set BqVentilada	  */
	public void setBqVentilada (String BqVentilada);

	/** Get BqVentilada	  */
	public String getBqVentilada();

    /** Column name BqVentiladaPts */
    public static final String COLUMNNAME_BqVentiladaPts = "BqVentiladaPts";

	/** Set BqVentiladaPts	  */
	public void setBqVentiladaPts (BigDecimal BqVentiladaPts);

	/** Get BqVentiladaPts	  */
	public BigDecimal getBqVentiladaPts();

    /** Column name CajasDanoHongos */
    public static final String COLUMNNAME_CajasDanoHongos = "CajasDanoHongos";

	/** Set CajasDanoHongos	  */
	public void setCajasDanoHongos (int CajasDanoHongos);

	/** Get CajasDanoHongos	  */
	public int getCajasDanoHongos();

    /** Column name CajasDanoInsectos */
    public static final String COLUMNNAME_CajasDanoInsectos = "CajasDanoInsectos";

	/** Set CajasDanoInsectos	  */
	public void setCajasDanoInsectos (int CajasDanoInsectos);

	/** Get CajasDanoInsectos	  */
	public int getCajasDanoInsectos();

    /** Column name CajasDanoMecanico */
    public static final String COLUMNNAME_CajasDanoMecanico = "CajasDanoMecanico";

	/** Set CajasDanoMecanico	  */
	public void setCajasDanoMecanico (int CajasDanoMecanico);

	/** Get CajasDanoMecanico	  */
	public int getCajasDanoMecanico();

    /** Column name CajasEvaluadas */
    public static final String COLUMNNAME_CajasEvaluadas = "CajasEvaluadas";

	/** Set CajasEvaluadas	  */
	public void setCajasEvaluadas (int CajasEvaluadas);

	/** Get CajasEvaluadas	  */
	public int getCajasEvaluadas();

    /** Column name CajasPresenciaInsectos */
    public static final String COLUMNNAME_CajasPresenciaInsectos = "CajasPresenciaInsectos";

	/** Set CajasPresenciaInsectos	  */
	public void setCajasPresenciaInsectos (int CajasPresenciaInsectos);

	/** Get CajasPresenciaInsectos	  */
	public int getCajasPresenciaInsectos();

    /** Column name CalificacionAgricola */
    public static final String COLUMNNAME_CalificacionAgricola = "CalificacionAgricola";

	/** Set CalificacionAgricola	  */
	public void setCalificacionAgricola (String CalificacionAgricola);

	/** Get CalificacionAgricola	  */
	public String getCalificacionAgricola();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name ClaveUnica */
    public static final String COLUMNNAME_ClaveUnica = "ClaveUnica";

	/** Set ClaveUnica	  */
	public void setClaveUnica (String ClaveUnica);

	/** Get ClaveUnica	  */
	public String getClaveUnica();

    /** Column name CodigoProductor */
    public static final String COLUMNNAME_CodigoProductor = "CodigoProductor";

	/** Set CodigoProductor	  */
	public void setCodigoProductor (String CodigoProductor);

	/** Get CodigoProductor	  */
	public String getCodigoProductor();

    /** Column name COMUS_TechnicalVisit_ID */
    public static final String COLUMNNAME_COMUS_TechnicalVisit_ID = "COMUS_TechnicalVisit_ID";

	/** Set COMUS_TechnicalVisit	  */
	public void setCOMUS_TechnicalVisit_ID (int COMUS_TechnicalVisit_ID);

	/** Get COMUS_TechnicalVisit	  */
	public int getCOMUS_TechnicalVisit_ID();

    /** Column name COMUS_TechnicalVisit_UU */
    public static final String COLUMNNAME_COMUS_TechnicalVisit_UU = "COMUS_TechnicalVisit_UU";

	/** Set COMUS_TechnicalVisit_UU	  */
	public void setCOMUS_TechnicalVisit_UU (String COMUS_TechnicalVisit_UU);

	/** Get COMUS_TechnicalVisit_UU	  */
	public String getCOMUS_TechnicalVisit_UU();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name EBalanzaCalibrada */
    public static final String COLUMNNAME_EBalanzaCalibrada = "EBalanzaCalibrada";

	/** Set EBalanzaCalibrada	  */
	public void setEBalanzaCalibrada (String EBalanzaCalibrada);

	/** Get EBalanzaCalibrada	  */
	public String getEBalanzaCalibrada();

    /** Column name EBalanzaCalibradaPts */
    public static final String COLUMNNAME_EBalanzaCalibradaPts = "EBalanzaCalibradaPts";

	/** Set EBalanzaCalibradaPts	  */
	public void setEBalanzaCalibradaPts (BigDecimal EBalanzaCalibradaPts);

	/** Get EBalanzaCalibradaPts	  */
	public BigDecimal getEBalanzaCalibradaPts();

    /** Column name EBalanzaEstado */
    public static final String COLUMNNAME_EBalanzaEstado = "EBalanzaEstado";

	/** Set EBalanzaEstado	  */
	public void setEBalanzaEstado (String EBalanzaEstado);

	/** Get EBalanzaEstado	  */
	public String getEBalanzaEstado();

    /** Column name EBalanzaEstadoPts */
    public static final String COLUMNNAME_EBalanzaEstadoPts = "EBalanzaEstadoPts";

	/** Set EBalanzaEstadoPts	  */
	public void setEBalanzaEstadoPts (BigDecimal EBalanzaEstadoPts);

	/** Get EBalanzaEstadoPts	  */
	public BigDecimal getEBalanzaEstadoPts();

    /** Column name ECalibrador */
    public static final String COLUMNNAME_ECalibrador = "ECalibrador";

	/** Set ECalibrador	  */
	public void setECalibrador (String ECalibrador);

	/** Get ECalibrador	  */
	public String getECalibrador();

    /** Column name ECalibradorPts */
    public static final String COLUMNNAME_ECalibradorPts = "ECalibradorPts";

	/** Set ECalibradorPts	  */
	public void setECalibradorPts (BigDecimal ECalibradorPts);

	/** Get ECalibradorPts	  */
	public BigDecimal getECalibradorPts();

    /** Column name EDosificadores */
    public static final String COLUMNNAME_EDosificadores = "EDosificadores";

	/** Set EDosificadores	  */
	public void setEDosificadores (String EDosificadores);

	/** Get EDosificadores	  */
	public String getEDosificadores();

    /** Column name EDosificadoresPts */
    public static final String COLUMNNAME_EDosificadoresPts = "EDosificadoresPts";

	/** Set EDosificadoresPts	  */
	public void setEDosificadoresPts (BigDecimal EDosificadoresPts);

	/** Get EDosificadoresPts	  */
	public BigDecimal getEDosificadoresPts();

    /** Column name ELprTanque */
    public static final String COLUMNNAME_ELprTanque = "ELprTanque";

	/** Set ELprTanque	  */
	public void setELprTanque (String ELprTanque);

	/** Get ELprTanque	  */
	public String getELprTanque();

    /** Column name ELprTanquePts */
    public static final String COLUMNNAME_ELprTanquePts = "ELprTanquePts";

	/** Set ELprTanquePts	  */
	public void setELprTanquePts (BigDecimal ELprTanquePts);

	/** Get ELprTanquePts	  */
	public BigDecimal getELprTanquePts();

    /** Column name ELprTendedero */
    public static final String COLUMNNAME_ELprTendedero = "ELprTendedero";

	/** Set ELprTendedero	  */
	public void setELprTendedero (String ELprTendedero);

	/** Get ELprTendedero	  */
	public String getELprTendedero();

    /** Column name ELprTendederoPts */
    public static final String COLUMNNAME_ELprTendederoPts = "ELprTendederoPts";

	/** Set ELprTendederoPts	  */
	public void setELprTendederoPts (BigDecimal ELprTendederoPts);

	/** Get ELprTendederoPts	  */
	public BigDecimal getELprTendederoPts();

    /** Column name EMesaAcolchada */
    public static final String COLUMNNAME_EMesaAcolchada = "EMesaAcolchada";

	/** Set EMesaAcolchada	  */
	public void setEMesaAcolchada (String EMesaAcolchada);

	/** Get EMesaAcolchada	  */
	public String getEMesaAcolchada();

    /** Column name EMesaAcolchadaPts */
    public static final String COLUMNNAME_EMesaAcolchadaPts = "EMesaAcolchadaPts";

	/** Set EMesaAcolchadaPts	  */
	public void setEMesaAcolchadaPts (BigDecimal EMesaAcolchadaPts);

	/** Get EMesaAcolchadaPts	  */
	public BigDecimal getEMesaAcolchadaPts();

    /** Column name EMesaFacilLimpieza */
    public static final String COLUMNNAME_EMesaFacilLimpieza = "EMesaFacilLimpieza";

	/** Set EMesaFacilLimpieza	  */
	public void setEMesaFacilLimpieza (String EMesaFacilLimpieza);

	/** Get EMesaFacilLimpieza	  */
	public String getEMesaFacilLimpieza();

    /** Column name EMesaFacilLimpiezaPts */
    public static final String COLUMNNAME_EMesaFacilLimpiezaPts = "EMesaFacilLimpiezaPts";

	/** Set EMesaFacilLimpiezaPts	  */
	public void setEMesaFacilLimpiezaPts (BigDecimal EMesaFacilLimpiezaPts);

	/** Get EMesaFacilLimpiezaPts	  */
	public BigDecimal getEMesaFacilLimpiezaPts();

    /** Column name EmpEstructuraMetalica */
    public static final String COLUMNNAME_EmpEstructuraMetalica = "EmpEstructuraMetalica";

	/** Set EmpEstructuraMetalica	  */
	public void setEmpEstructuraMetalica (String EmpEstructuraMetalica);

	/** Get EmpEstructuraMetalica	  */
	public String getEmpEstructuraMetalica();

    /** Column name EmpEstructuraMetalicaPts */
    public static final String COLUMNNAME_EmpEstructuraMetalicaPts = "EmpEstructuraMetalicaPts";

	/** Set EmpEstructuraMetalicaPts	  */
	public void setEmpEstructuraMetalicaPts (BigDecimal EmpEstructuraMetalicaPts);

	/** Get EmpEstructuraMetalicaPts	  */
	public BigDecimal getEmpEstructuraMetalicaPts();

    /** Column name EmpFacilLimpieza */
    public static final String COLUMNNAME_EmpFacilLimpieza = "EmpFacilLimpieza";

	/** Set EmpFacilLimpieza	  */
	public void setEmpFacilLimpieza (String EmpFacilLimpieza);

	/** Get EmpFacilLimpieza	  */
	public String getEmpFacilLimpieza();

    /** Column name EmpFacilLimpiezaPts */
    public static final String COLUMNNAME_EmpFacilLimpiezaPts = "EmpFacilLimpiezaPts";

	/** Set EmpFacilLimpiezaPts	  */
	public void setEmpFacilLimpiezaPts (BigDecimal EmpFacilLimpiezaPts);

	/** Get EmpFacilLimpiezaPts	  */
	public BigDecimal getEmpFacilLimpiezaPts();

    /** Column name EmpMallaSaran */
    public static final String COLUMNNAME_EmpMallaSaran = "EmpMallaSaran";

	/** Set EmpMallaSaran	  */
	public void setEmpMallaSaran (String EmpMallaSaran);

	/** Get EmpMallaSaran	  */
	public String getEmpMallaSaran();

    /** Column name EmpMallaSaranPts */
    public static final String COLUMNNAME_EmpMallaSaranPts = "EmpMallaSaranPts";

	/** Set EmpMallaSaranPts	  */
	public void setEmpMallaSaranPts (BigDecimal EmpMallaSaranPts);

	/** Get EmpMallaSaranPts	  */
	public BigDecimal getEmpMallaSaranPts();

    /** Column name EmpPerimetro */
    public static final String COLUMNNAME_EmpPerimetro = "EmpPerimetro";

	/** Set EmpPerimetro	  */
	public void setEmpPerimetro (String EmpPerimetro);

	/** Get EmpPerimetro	  */
	public String getEmpPerimetro();

    /** Column name EmpPerimetroPts */
    public static final String COLUMNNAME_EmpPerimetroPts = "EmpPerimetroPts";

	/** Set EmpPerimetroPts	  */
	public void setEmpPerimetroPts (BigDecimal EmpPerimetroPts);

	/** Get EmpPerimetroPts	  */
	public BigDecimal getEmpPerimetroPts();

    /** Column name EmpPiso */
    public static final String COLUMNNAME_EmpPiso = "EmpPiso";

	/** Set EmpPiso	  */
	public void setEmpPiso (String EmpPiso);

	/** Get EmpPiso	  */
	public String getEmpPiso();

    /** Column name EmpPisoPts */
    public static final String COLUMNNAME_EmpPisoPts = "EmpPisoPts";

	/** Set EmpPisoPts	  */
	public void setEmpPisoPts (BigDecimal EmpPisoPts);

	/** Get EmpPisoPts	  */
	public BigDecimal getEmpPisoPts();

    /** Column name EPlatosEstado */
    public static final String COLUMNNAME_EPlatosEstado = "EPlatosEstado";

	/** Set EPlatosEstado	  */
	public void setEPlatosEstado (String EPlatosEstado);

	/** Get EPlatosEstado	  */
	public String getEPlatosEstado();

    /** Column name EPlatosEstadoPts */
    public static final String COLUMNNAME_EPlatosEstadoPts = "EPlatosEstadoPts";

	/** Set EPlatosEstadoPts	  */
	public void setEPlatosEstadoPts (BigDecimal EPlatosEstadoPts);

	/** Get EPlatosEstadoPts	  */
	public BigDecimal getEPlatosEstadoPts();

    /** Column name EPlatosProtectores */
    public static final String COLUMNNAME_EPlatosProtectores = "EPlatosProtectores";

	/** Set EPlatosProtectores	  */
	public void setEPlatosProtectores (String EPlatosProtectores);

	/** Get EPlatosProtectores	  */
	public String getEPlatosProtectores();

    /** Column name EPlatosProtectoresPts */
    public static final String COLUMNNAME_EPlatosProtectoresPts = "EPlatosProtectoresPts";

	/** Set EPlatosProtectoresPts	  */
	public void setEPlatosProtectoresPts (BigDecimal EPlatosProtectoresPts);

	/** Get EPlatosProtectoresPts	  */
	public BigDecimal getEPlatosProtectoresPts();

    /** Column name ETinasEstado */
    public static final String COLUMNNAME_ETinasEstado = "ETinasEstado";

	/** Set ETinasEstado	  */
	public void setETinasEstado (String ETinasEstado);

	/** Get ETinasEstado	  */
	public String getETinasEstado();

    /** Column name ETinasEstadoPts */
    public static final String COLUMNNAME_ETinasEstadoPts = "ETinasEstadoPts";

	/** Set ETinasEstadoPts	  */
	public void setETinasEstadoPts (BigDecimal ETinasEstadoPts);

	/** Get ETinasEstadoPts	  */
	public BigDecimal getETinasEstadoPts();

    /** Column name ETinasNumero */
    public static final String COLUMNNAME_ETinasNumero = "ETinasNumero";

	/** Set ETinasNumero	  */
	public void setETinasNumero (String ETinasNumero);

	/** Get ETinasNumero	  */
	public String getETinasNumero();

    /** Column name ETinasNumeroPts */
    public static final String COLUMNNAME_ETinasNumeroPts = "ETinasNumeroPts";

	/** Set ETinasNumeroPts	  */
	public void setETinasNumeroPts (BigDecimal ETinasNumeroPts);

	/** Get ETinasNumeroPts	  */
	public BigDecimal getETinasNumeroPts();

    /** Column name FdLimpia */
    public static final String COLUMNNAME_FdLimpia = "FdLimpia";

	/** Set FdLimpia	  */
	public void setFdLimpia (String FdLimpia);

	/** Get FdLimpia	  */
	public String getFdLimpia();

    /** Column name FdLimpiaPts */
    public static final String COLUMNNAME_FdLimpiaPts = "FdLimpiaPts";

	/** Set FdLimpiaPts	  */
	public void setFdLimpiaPts (BigDecimal FdLimpiaPts);

	/** Get FdLimpiaPts	  */
	public BigDecimal getFdLimpiaPts();

    /** Column name FdTapa */
    public static final String COLUMNNAME_FdTapa = "FdTapa";

	/** Set FdTapa	  */
	public void setFdTapa (String FdTapa);

	/** Get FdTapa	  */
	public String getFdTapa();

    /** Column name FdTapaPts */
    public static final String COLUMNNAME_FdTapaPts = "FdTapaPts";

	/** Set FdTapaPts	  */
	public void setFdTapaPts (BigDecimal FdTapaPts);

	/** Get FdTapaPts	  */
	public BigDecimal getFdTapaPts();

    /** Column name FechaLimiteCumplimiento */
    public static final String COLUMNNAME_FechaLimiteCumplimiento = "FechaLimiteCumplimiento";

	/** Set FechaLimiteCumplimiento	  */
	public void setFechaLimiteCumplimiento (Timestamp FechaLimiteCumplimiento);

	/** Get FechaLimiteCumplimiento	  */
	public Timestamp getFechaLimiteCumplimiento();

    /** Column name FechaSistema */
    public static final String COLUMNNAME_FechaSistema = "FechaSistema";

	/** Set FechaSistema	  */
	public void setFechaSistema (Timestamp FechaSistema);

	/** Get FechaSistema	  */
	public Timestamp getFechaSistema();

    /** Column name FechaVisita */
    public static final String COLUMNNAME_FechaVisita = "FechaVisita";

	/** Set FechaVisita	  */
	public void setFechaVisita (Timestamp FechaVisita);

	/** Get FechaVisita	  */
	public Timestamp getFechaVisita();

    /** Column name FirmaProductor */
    public static final String COLUMNNAME_FirmaProductor = "FirmaProductor";

	/** Set FirmaProductor	  */
	public void setFirmaProductor (String FirmaProductor);

	/** Get FirmaProductor	  */
	public String getFirmaProductor();

    /** Column name FotoEvidencia */
    public static final String COLUMNNAME_FotoEvidencia = "FotoEvidencia";

	/** Set FotoEvidencia	  */
	public void setFotoEvidencia (String FotoEvidencia);

	/** Get FotoEvidencia	  */
	public String getFotoEvidencia();

    /** Column name GradoColorCorrecto */
    public static final String COLUMNNAME_GradoColorCorrecto = "GradoColorCorrecto";

	/** Set GradoColorCorrecto	  */
	public void setGradoColorCorrecto (String GradoColorCorrecto);

	/** Get GradoColorCorrecto	  */
	public String getGradoColorCorrecto();

    /** Column name HAreaAlimentos */
    public static final String COLUMNNAME_HAreaAlimentos = "HAreaAlimentos";

	/** Set HAreaAlimentos	  */
	public void setHAreaAlimentos (String HAreaAlimentos);

	/** Get HAreaAlimentos	  */
	public String getHAreaAlimentos();

    /** Column name HAreaAlimentosPts */
    public static final String COLUMNNAME_HAreaAlimentosPts = "HAreaAlimentosPts";

	/** Set HAreaAlimentosPts	  */
	public void setHAreaAlimentosPts (BigDecimal HAreaAlimentosPts);

	/** Get HAreaAlimentosPts	  */
	public BigDecimal getHAreaAlimentosPts();

    /** Column name HBotiquinExtintor */
    public static final String COLUMNNAME_HBotiquinExtintor = "HBotiquinExtintor";

	/** Set HBotiquinExtintor	  */
	public void setHBotiquinExtintor (String HBotiquinExtintor);

	/** Get HBotiquinExtintor	  */
	public String getHBotiquinExtintor();

    /** Column name HBotiquinExtintorPts */
    public static final String COLUMNNAME_HBotiquinExtintorPts = "HBotiquinExtintorPts";

	/** Set HBotiquinExtintorPts	  */
	public void setHBotiquinExtintorPts (BigDecimal HBotiquinExtintorPts);

	/** Get HBotiquinExtintorPts	  */
	public BigDecimal getHBotiquinExtintorPts();

    /** Column name HCarpetaActualizada */
    public static final String COLUMNNAME_HCarpetaActualizada = "HCarpetaActualizada";

	/** Set HCarpetaActualizada	  */
	public void setHCarpetaActualizada (String HCarpetaActualizada);

	/** Get HCarpetaActualizada	  */
	public String getHCarpetaActualizada();

    /** Column name HCarpetaActualizadaPts */
    public static final String COLUMNNAME_HCarpetaActualizadaPts = "HCarpetaActualizadaPts";

	/** Set HCarpetaActualizadaPts	  */
	public void setHCarpetaActualizadaPts (BigDecimal HCarpetaActualizadaPts);

	/** Get HCarpetaActualizadaPts	  */
	public BigDecimal getHCarpetaActualizadaPts();

    /** Column name HCloracionCorrecta */
    public static final String COLUMNNAME_HCloracionCorrecta = "HCloracionCorrecta";

	/** Set HCloracionCorrecta	  */
	public void setHCloracionCorrecta (String HCloracionCorrecta);

	/** Get HCloracionCorrecta	  */
	public String getHCloracionCorrecta();

    /** Column name HCloracionCorrectaPts */
    public static final String COLUMNNAME_HCloracionCorrectaPts = "HCloracionCorrectaPts";

	/** Set HCloracionCorrectaPts	  */
	public void setHCloracionCorrectaPts (BigDecimal HCloracionCorrectaPts);

	/** Get HCloracionCorrectaPts	  */
	public BigDecimal getHCloracionCorrectaPts();

    /** Column name HCultivoSinAnimales */
    public static final String COLUMNNAME_HCultivoSinAnimales = "HCultivoSinAnimales";

	/** Set HCultivoSinAnimales	  */
	public void setHCultivoSinAnimales (String HCultivoSinAnimales);

	/** Get HCultivoSinAnimales	  */
	public String getHCultivoSinAnimales();

    /** Column name HCultivoSinAnimalesPts */
    public static final String COLUMNNAME_HCultivoSinAnimalesPts = "HCultivoSinAnimalesPts";

	/** Set HCultivoSinAnimalesPts	  */
	public void setHCultivoSinAnimalesPts (BigDecimal HCultivoSinAnimalesPts);

	/** Get HCultivoSinAnimalesPts	  */
	public BigDecimal getHCultivoSinAnimalesPts();

    /** Column name HCultivoSinBasura */
    public static final String COLUMNNAME_HCultivoSinBasura = "HCultivoSinBasura";

	/** Set HCultivoSinBasura	  */
	public void setHCultivoSinBasura (String HCultivoSinBasura);

	/** Get HCultivoSinBasura	  */
	public String getHCultivoSinBasura();

    /** Column name HCultivoSinBasuraPts */
    public static final String COLUMNNAME_HCultivoSinBasuraPts = "HCultivoSinBasuraPts";

	/** Set HCultivoSinBasuraPts	  */
	public void setHCultivoSinBasuraPts (BigDecimal HCultivoSinBasuraPts);

	/** Get HCultivoSinBasuraPts	  */
	public BigDecimal getHCultivoSinBasuraPts();

    /** Column name HCultivoSinVertidos */
    public static final String COLUMNNAME_HCultivoSinVertidos = "HCultivoSinVertidos";

	/** Set HCultivoSinVertidos	  */
	public void setHCultivoSinVertidos (String HCultivoSinVertidos);

	/** Get HCultivoSinVertidos	  */
	public String getHCultivoSinVertidos();

    /** Column name HCultivoSinVertidosPts */
    public static final String COLUMNNAME_HCultivoSinVertidosPts = "HCultivoSinVertidosPts";

	/** Set HCultivoSinVertidosPts	  */
	public void setHCultivoSinVertidosPts (BigDecimal HCultivoSinVertidosPts);

	/** Get HCultivoSinVertidosPts	  */
	public BigDecimal getHCultivoSinVertidosPts();

    /** Column name HEmpacadoraLimpia */
    public static final String COLUMNNAME_HEmpacadoraLimpia = "HEmpacadoraLimpia";

	/** Set HEmpacadoraLimpia	  */
	public void setHEmpacadoraLimpia (String HEmpacadoraLimpia);

	/** Get HEmpacadoraLimpia	  */
	public String getHEmpacadoraLimpia();

    /** Column name HEmpacadoraLimpiaPts */
    public static final String COLUMNNAME_HEmpacadoraLimpiaPts = "HEmpacadoraLimpiaPts";

	/** Set HEmpacadoraLimpiaPts	  */
	public void setHEmpacadoraLimpiaPts (BigDecimal HEmpacadoraLimpiaPts);

	/** Get HEmpacadoraLimpiaPts	  */
	public BigDecimal getHEmpacadoraLimpiaPts();

    /** Column name HEmpacadoraSinAnimales */
    public static final String COLUMNNAME_HEmpacadoraSinAnimales = "HEmpacadoraSinAnimales";

	/** Set HEmpacadoraSinAnimales	  */
	public void setHEmpacadoraSinAnimales (String HEmpacadoraSinAnimales);

	/** Get HEmpacadoraSinAnimales	  */
	public String getHEmpacadoraSinAnimales();

    /** Column name HEmpacadoraSinAnimalesPts */
    public static final String COLUMNNAME_HEmpacadoraSinAnimalesPts = "HEmpacadoraSinAnimalesPts";

	/** Set HEmpacadoraSinAnimalesPts	  */
	public void setHEmpacadoraSinAnimalesPts (BigDecimal HEmpacadoraSinAnimalesPts);

	/** Get HEmpacadoraSinAnimalesPts	  */
	public BigDecimal getHEmpacadoraSinAnimalesPts();

    /** Column name HEnvasesTripleLavado */
    public static final String COLUMNNAME_HEnvasesTripleLavado = "HEnvasesTripleLavado";

	/** Set HEnvasesTripleLavado	  */
	public void setHEnvasesTripleLavado (String HEnvasesTripleLavado);

	/** Get HEnvasesTripleLavado	  */
	public String getHEnvasesTripleLavado();

    /** Column name HEnvasesTripleLavadoPts */
    public static final String COLUMNNAME_HEnvasesTripleLavadoPts = "HEnvasesTripleLavadoPts";

	/** Set HEnvasesTripleLavadoPts	  */
	public void setHEnvasesTripleLavadoPts (BigDecimal HEnvasesTripleLavadoPts);

	/** Get HEnvasesTripleLavadoPts	  */
	public BigDecimal getHEnvasesTripleLavadoPts();

    /** Column name HEppEnfunde */
    public static final String COLUMNNAME_HEppEnfunde = "HEppEnfunde";

	/** Set HEppEnfunde	  */
	public void setHEppEnfunde (String HEppEnfunde);

	/** Get HEppEnfunde	  */
	public String getHEppEnfunde();

    /** Column name HEppEnfundePts */
    public static final String COLUMNNAME_HEppEnfundePts = "HEppEnfundePts";

	/** Set HEppEnfundePts	  */
	public void setHEppEnfundePts (BigDecimal HEppEnfundePts);

	/** Get HEppEnfundePts	  */
	public BigDecimal getHEppEnfundePts();

    /** Column name HEppGeneral */
    public static final String COLUMNNAME_HEppGeneral = "HEppGeneral";

	/** Set HEppGeneral	  */
	public void setHEppGeneral (String HEppGeneral);

	/** Get HEppGeneral	  */
	public String getHEppGeneral();

    /** Column name HEppGeneralPts */
    public static final String COLUMNNAME_HEppGeneralPts = "HEppGeneralPts";

	/** Set HEppGeneralPts	  */
	public void setHEppGeneralPts (BigDecimal HEppGeneralPts);

	/** Get HEppGeneralPts	  */
	public BigDecimal getHEppGeneralPts();

    /** Column name HEppTinas */
    public static final String COLUMNNAME_HEppTinas = "HEppTinas";

	/** Set HEppTinas	  */
	public void setHEppTinas (String HEppTinas);

	/** Get HEppTinas	  */
	public String getHEppTinas();

    /** Column name HEppTinasPts */
    public static final String COLUMNNAME_HEppTinasPts = "HEppTinasPts";

	/** Set HEppTinasPts	  */
	public void setHEppTinasPts (BigDecimal HEppTinasPts);

	/** Get HEppTinasPts	  */
	public BigDecimal getHEppTinasPts();

    /** Column name HFrutaPalets */
    public static final String COLUMNNAME_HFrutaPalets = "HFrutaPalets";

	/** Set HFrutaPalets	  */
	public void setHFrutaPalets (String HFrutaPalets);

	/** Get HFrutaPalets	  */
	public String getHFrutaPalets();

    /** Column name HFrutaPaletsPts */
    public static final String COLUMNNAME_HFrutaPaletsPts = "HFrutaPaletsPts";

	/** Set HFrutaPaletsPts	  */
	public void setHFrutaPaletsPts (BigDecimal HFrutaPaletsPts);

	/** Get HFrutaPaletsPts	  */
	public BigDecimal getHFrutaPaletsPts();

    /** Column name HInmediacionesLimpias */
    public static final String COLUMNNAME_HInmediacionesLimpias = "HInmediacionesLimpias";

	/** Set HInmediacionesLimpias	  */
	public void setHInmediacionesLimpias (String HInmediacionesLimpias);

	/** Get HInmediacionesLimpias	  */
	public String getHInmediacionesLimpias();

    /** Column name HInmediacionesLimpiasPts */
    public static final String COLUMNNAME_HInmediacionesLimpiasPts = "HInmediacionesLimpiasPts";

	/** Set HInmediacionesLimpiasPts	  */
	public void setHInmediacionesLimpiasPts (BigDecimal HInmediacionesLimpiasPts);

	/** Get HInmediacionesLimpiasPts	  */
	public BigDecimal getHInmediacionesLimpiasPts();

    /** Column name HMaterialesPalets */
    public static final String COLUMNNAME_HMaterialesPalets = "HMaterialesPalets";

	/** Set HMaterialesPalets	  */
	public void setHMaterialesPalets (String HMaterialesPalets);

	/** Get HMaterialesPalets	  */
	public String getHMaterialesPalets();

    /** Column name HMaterialesPaletsPts */
    public static final String COLUMNNAME_HMaterialesPaletsPts = "HMaterialesPaletsPts";

	/** Set HMaterialesPaletsPts	  */
	public void setHMaterialesPaletsPts (BigDecimal HMaterialesPaletsPts);

	/** Get HMaterialesPaletsPts	  */
	public BigDecimal getHMaterialesPaletsPts();

    /** Column name HoraFin */
    public static final String COLUMNNAME_HoraFin = "HoraFin";

	/** Set HoraFin	  */
	public void setHoraFin (Timestamp HoraFin);

	/** Get HoraFin	  */
	public Timestamp getHoraFin();

    /** Column name HoraInicio */
    public static final String COLUMNNAME_HoraInicio = "HoraInicio";

	/** Set HoraInicio	  */
	public void setHoraInicio (Timestamp HoraInicio);

	/** Get HoraInicio	  */
	public Timestamp getHoraInicio();

    /** Column name HRacimosColgadero */
    public static final String COLUMNNAME_HRacimosColgadero = "HRacimosColgadero";

	/** Set HRacimosColgadero	  */
	public void setHRacimosColgadero (String HRacimosColgadero);

	/** Get HRacimosColgadero	  */
	public String getHRacimosColgadero();

    /** Column name HRacimosColgaderoPts */
    public static final String COLUMNNAME_HRacimosColgaderoPts = "HRacimosColgaderoPts";

	/** Set HRacimosColgaderoPts	  */
	public void setHRacimosColgaderoPts (BigDecimal HRacimosColgaderoPts);

	/** Get HRacimosColgaderoPts	  */
	public BigDecimal getHRacimosColgaderoPts();

    /** Column name HRetiroRestos */
    public static final String COLUMNNAME_HRetiroRestos = "HRetiroRestos";

	/** Set HRetiroRestos	  */
	public void setHRetiroRestos (String HRetiroRestos);

	/** Get HRetiroRestos	  */
	public String getHRetiroRestos();

    /** Column name HRetiroRestosPts */
    public static final String COLUMNNAME_HRetiroRestosPts = "HRetiroRestosPts";

	/** Set HRetiroRestosPts	  */
	public void setHRetiroRestosPts (BigDecimal HRetiroRestosPts);

	/** Get HRetiroRestosPts	  */
	public BigDecimal getHRetiroRestosPts();

    /** Column name HSinAccesorios */
    public static final String COLUMNNAME_HSinAccesorios = "HSinAccesorios";

	/** Set HSinAccesorios	  */
	public void setHSinAccesorios (String HSinAccesorios);

	/** Get HSinAccesorios	  */
	public String getHSinAccesorios();

    /** Column name HSinAccesoriosPts */
    public static final String COLUMNNAME_HSinAccesoriosPts = "HSinAccesoriosPts";

	/** Set HSinAccesoriosPts	  */
	public void setHSinAccesoriosPts (BigDecimal HSinAccesoriosPts);

	/** Get HSinAccesoriosPts	  */
	public BigDecimal getHSinAccesoriosPts();

    /** Column name HSinRaquis */
    public static final String COLUMNNAME_HSinRaquis = "HSinRaquis";

	/** Set HSinRaquis	  */
	public void setHSinRaquis (String HSinRaquis);

	/** Get HSinRaquis	  */
	public String getHSinRaquis();

    /** Column name HSinRaquisPts */
    public static final String COLUMNNAME_HSinRaquisPts = "HSinRaquisPts";

	/** Set HSinRaquisPts	  */
	public void setHSinRaquisPts (BigDecimal HSinRaquisPts);

	/** Get HSinRaquisPts	  */
	public BigDecimal getHSinRaquisPts();

    /** Column name HUsanLavamanos */
    public static final String COLUMNNAME_HUsanLavamanos = "HUsanLavamanos";

	/** Set HUsanLavamanos	  */
	public void setHUsanLavamanos (String HUsanLavamanos);

	/** Get HUsanLavamanos	  */
	public String getHUsanLavamanos();

    /** Column name HUsanLavamanosPts */
    public static final String COLUMNNAME_HUsanLavamanosPts = "HUsanLavamanosPts";

	/** Set HUsanLavamanosPts	  */
	public void setHUsanLavamanosPts (BigDecimal HUsanLavamanosPts);

	/** Get HUsanLavamanosPts	  */
	public BigDecimal getHUsanLavamanosPts();

    /** Column name IdDispositivo */
    public static final String COLUMNNAME_IdDispositivo = "IdDispositivo";

	/** Set IdDispositivo	  */
	public void setIdDispositivo (String IdDispositivo);

	/** Get IdDispositivo	  */
	public String getIdDispositivo();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name KoboSubmissionID */
    public static final String COLUMNNAME_KoboSubmissionID = "KoboSubmissionID";

	/** Set KoboSubmissionID	  */
	public void setKoboSubmissionID (String KoboSubmissionID);

	/** Get KoboSubmissionID	  */
	public String getKoboSubmissionID();

    /** Column name KoboSubmissionTime */
    public static final String COLUMNNAME_KoboSubmissionTime = "KoboSubmissionTime";

	/** Set KoboSubmissionTime	  */
	public void setKoboSubmissionTime (Timestamp KoboSubmissionTime);

	/** Get KoboSubmissionTime	  */
	public Timestamp getKoboSubmissionTime();

    /** Column name LavAgua */
    public static final String COLUMNNAME_LavAgua = "LavAgua";

	/** Set LavAgua	  */
	public void setLavAgua (String LavAgua);

	/** Get LavAgua	  */
	public String getLavAgua();

    /** Column name LavAguaPts */
    public static final String COLUMNNAME_LavAguaPts = "LavAguaPts";

	/** Set LavAguaPts	  */
	public void setLavAguaPts (BigDecimal LavAguaPts);

	/** Get LavAguaPts	  */
	public BigDecimal getLavAguaPts();

    /** Column name LavDesague */
    public static final String COLUMNNAME_LavDesague = "LavDesague";

	/** Set LavDesague	  */
	public void setLavDesague (String LavDesague);

	/** Get LavDesague	  */
	public String getLavDesague();

    /** Column name LavDesaguePts */
    public static final String COLUMNNAME_LavDesaguePts = "LavDesaguePts";

	/** Set LavDesaguePts	  */
	public void setLavDesaguePts (BigDecimal LavDesaguePts);

	/** Get LavDesaguePts	  */
	public BigDecimal getLavDesaguePts();

    /** Column name LavJabon */
    public static final String COLUMNNAME_LavJabon = "LavJabon";

	/** Set LavJabon	  */
	public void setLavJabon (String LavJabon);

	/** Get LavJabon	  */
	public String getLavJabon();

    /** Column name LavJabonPts */
    public static final String COLUMNNAME_LavJabonPts = "LavJabonPts";

	/** Set LavJabonPts	  */
	public void setLavJabonPts (BigDecimal LavJabonPts);

	/** Get LavJabonPts	  */
	public BigDecimal getLavJabonPts();

    /** Column name LavToalla */
    public static final String COLUMNNAME_LavToalla = "LavToalla";

	/** Set LavToalla	  */
	public void setLavToalla (String LavToalla);

	/** Get LavToalla	  */
	public String getLavToalla();

    /** Column name LavToallaPts */
    public static final String COLUMNNAME_LavToallaPts = "LavToallaPts";

	/** Set LavToallaPts	  */
	public void setLavToallaPts (BigDecimal LavToallaPts);

	/** Get LavToallaPts	  */
	public BigDecimal getLavToallaPts();

    /** Column name MotivoSinFirma */
    public static final String COLUMNNAME_MotivoSinFirma = "MotivoSinFirma";

	/** Set MotivoSinFirma	  */
	public void setMotivoSinFirma (String MotivoSinFirma);

	/** Get MotivoSinFirma	  */
	public String getMotivoSinFirma();

    /** Column name NombreFirmante */
    public static final String COLUMNNAME_NombreFirmante = "NombreFirmante";

	/** Set NombreFirmante	  */
	public void setNombreFirmante (String NombreFirmante);

	/** Get NombreFirmante	  */
	public String getNombreFirmante();

    /** Column name NombreProductor */
    public static final String COLUMNNAME_NombreProductor = "NombreProductor";

	/** Set NombreProductor	  */
	public void setNombreProductor (String NombreProductor);

	/** Get NombreProductor	  */
	public String getNombreProductor();

    /** Column name NumeroFasesFertilizacion */
    public static final String COLUMNNAME_NumeroFasesFertilizacion = "NumeroFasesFertilizacion";

	/** Set NumeroFasesFertilizacion	  */
	public void setNumeroFasesFertilizacion (int NumeroFasesFertilizacion);

	/** Get NumeroFasesFertilizacion	  */
	public int getNumeroFasesFertilizacion();

    /** Column name Observaciones */
    public static final String COLUMNNAME_Observaciones = "Observaciones";

	/** Set Observaciones	  */
	public void setObservaciones (String Observaciones);

	/** Get Observaciones	  */
	public String getObservaciones();

    /** Column name PcAspersion */
    public static final String COLUMNNAME_PcAspersion = "PcAspersion";

	/** Set PcAspersion	  */
	public void setPcAspersion (String PcAspersion);

	/** Get PcAspersion	  */
	public String getPcAspersion();

    /** Column name PcAspersionPts */
    public static final String COLUMNNAME_PcAspersionPts = "PcAspersionPts";

	/** Set PcAspersionPts	  */
	public void setPcAspersionPts (BigDecimal PcAspersionPts);

	/** Get PcAspersionPts	  */
	public BigDecimal getPcAspersionPts();

    /** Column name PcAspersor */
    public static final String COLUMNNAME_PcAspersor = "PcAspersor";

	/** Set PcAspersor	  */
	public void setPcAspersor (String PcAspersor);

	/** Get PcAspersor	  */
	public String getPcAspersor();

    /** Column name PcAspersorPts */
    public static final String COLUMNNAME_PcAspersorPts = "PcAspersorPts";

	/** Set PcAspersorPts	  */
	public void setPcAspersorPts (BigDecimal PcAspersorPts);

	/** Get PcAspersorPts	  */
	public BigDecimal getPcAspersorPts();

    /** Column name PcCambioAgua */
    public static final String COLUMNNAME_PcCambioAgua = "PcCambioAgua";

	/** Set PcCambioAgua	  */
	public void setPcCambioAgua (String PcCambioAgua);

	/** Get PcCambioAgua	  */
	public String getPcCambioAgua();

    /** Column name PcCambioAguaPts */
    public static final String COLUMNNAME_PcCambioAguaPts = "PcCambioAguaPts";

	/** Set PcCambioAguaPts	  */
	public void setPcCambioAguaPts (BigDecimal PcCambioAguaPts);

	/** Get PcCambioAguaPts	  */
	public BigDecimal getPcCambioAguaPts();

    /** Column name PcDosificacion */
    public static final String COLUMNNAME_PcDosificacion = "PcDosificacion";

	/** Set PcDosificacion	  */
	public void setPcDosificacion (String PcDosificacion);

	/** Get PcDosificacion	  */
	public String getPcDosificacion();

    /** Column name PcDosificacionPts */
    public static final String COLUMNNAME_PcDosificacionPts = "PcDosificacionPts";

	/** Set PcDosificacionPts	  */
	public void setPcDosificacionPts (BigDecimal PcDosificacionPts);

	/** Get PcDosificacionPts	  */
	public BigDecimal getPcDosificacionPts();

    /** Column name PcEsquineros */
    public static final String COLUMNNAME_PcEsquineros = "PcEsquineros";

	/** Set PcEsquineros	  */
	public void setPcEsquineros (String PcEsquineros);

	/** Get PcEsquineros	  */
	public String getPcEsquineros();

    /** Column name PcEsquinerosPts */
    public static final String COLUMNNAME_PcEsquinerosPts = "PcEsquinerosPts";

	/** Set PcEsquinerosPts	  */
	public void setPcEsquinerosPts (BigDecimal PcEsquinerosPts);

	/** Get PcEsquinerosPts	  */
	public BigDecimal getPcEsquinerosPts();

    /** Column name PcInmersion */
    public static final String COLUMNNAME_PcInmersion = "PcInmersion";

	/** Set PcInmersion	  */
	public void setPcInmersion (String PcInmersion);

	/** Get PcInmersion	  */
	public String getPcInmersion();

    /** Column name PcInmersionPts */
    public static final String COLUMNNAME_PcInmersionPts = "PcInmersionPts";

	/** Set PcInmersionPts	  */
	public void setPcInmersionPts (BigDecimal PcInmersionPts);

	/** Get PcInmersionPts	  */
	public BigDecimal getPcInmersionPts();

    /** Column name PcPhRango */
    public static final String COLUMNNAME_PcPhRango = "PcPhRango";

	/** Set PcPhRango	  */
	public void setPcPhRango (String PcPhRango);

	/** Get PcPhRango	  */
	public String getPcPhRango();

    /** Column name PcPhRangoPts */
    public static final String COLUMNNAME_PcPhRangoPts = "PcPhRangoPts";

	/** Set PcPhRangoPts	  */
	public void setPcPhRangoPts (BigDecimal PcPhRangoPts);

	/** Get PcPhRangoPts	  */
	public BigDecimal getPcPhRangoPts();

    /** Column name PcPlatos */
    public static final String COLUMNNAME_PcPlatos = "PcPlatos";

	/** Set PcPlatos	  */
	public void setPcPlatos (String PcPlatos);

	/** Get PcPlatos	  */
	public String getPcPlatos();

    /** Column name PcPlatosPts */
    public static final String COLUMNNAME_PcPlatosPts = "PcPlatosPts";

	/** Set PcPlatosPts	  */
	public void setPcPlatosPts (BigDecimal PcPlatosPts);

	/** Get PcPlatosPts	  */
	public BigDecimal getPcPlatosPts();

    /** Column name PcSaneo */
    public static final String COLUMNNAME_PcSaneo = "PcSaneo";

	/** Set PcSaneo	  */
	public void setPcSaneo (String PcSaneo);

	/** Get PcSaneo	  */
	public String getPcSaneo();

    /** Column name PcSaneoPts */
    public static final String COLUMNNAME_PcSaneoPts = "PcSaneoPts";

	/** Set PcSaneoPts	  */
	public void setPcSaneoPts (BigDecimal PcSaneoPts);

	/** Get PcSaneoPts	  */
	public BigDecimal getPcSaneoPts();

    /** Column name PcTinaFruta */
    public static final String COLUMNNAME_PcTinaFruta = "PcTinaFruta";

	/** Set PcTinaFruta	  */
	public void setPcTinaFruta (String PcTinaFruta);

	/** Get PcTinaFruta	  */
	public String getPcTinaFruta();

    /** Column name PcTinaFrutaPts */
    public static final String COLUMNNAME_PcTinaFrutaPts = "PcTinaFrutaPts";

	/** Set PcTinaFrutaPts	  */
	public void setPcTinaFrutaPts (BigDecimal PcTinaFrutaPts);

	/** Get PcTinaFrutaPts	  */
	public BigDecimal getPcTinaFrutaPts();

    /** Column name PedAguaClorada */
    public static final String COLUMNNAME_PedAguaClorada = "PedAguaClorada";

	/** Set PedAguaClorada	  */
	public void setPedAguaClorada (String PedAguaClorada);

	/** Get PedAguaClorada	  */
	public String getPedAguaClorada();

    /** Column name PedAguaCloradaPts */
    public static final String COLUMNNAME_PedAguaCloradaPts = "PedAguaCloradaPts";

	/** Set PedAguaCloradaPts	  */
	public void setPedAguaCloradaPts (BigDecimal PedAguaCloradaPts);

	/** Get PedAguaCloradaPts	  */
	public BigDecimal getPedAguaCloradaPts();

    /** Column name PedDesague */
    public static final String COLUMNNAME_PedDesague = "PedDesague";

	/** Set PedDesague	  */
	public void setPedDesague (String PedDesague);

	/** Get PedDesague	  */
	public String getPedDesague();

    /** Column name PedDesaguePts */
    public static final String COLUMNNAME_PedDesaguePts = "PedDesaguePts";

	/** Set PedDesaguePts	  */
	public void setPedDesaguePts (BigDecimal PedDesaguePts);

	/** Get PedDesaguePts	  */
	public BigDecimal getPedDesaguePts();

    /** Column name PedIngreso */
    public static final String COLUMNNAME_PedIngreso = "PedIngreso";

	/** Set PedIngreso	  */
	public void setPedIngreso (String PedIngreso);

	/** Get PedIngreso	  */
	public String getPedIngreso();

    /** Column name PedIngresoPts */
    public static final String COLUMNNAME_PedIngresoPts = "PedIngresoPts";

	/** Set PedIngresoPts	  */
	public void setPedIngresoPts (BigDecimal PedIngresoPts);

	/** Get PedIngresoPts	  */
	public BigDecimal getPedIngresoPts();

    /** Column name PorcentajeGlobal */
    public static final String COLUMNNAME_PorcentajeGlobal = "PorcentajeGlobal";

	/** Set PorcentajeGlobal	  */
	public void setPorcentajeGlobal (BigDecimal PorcentajeGlobal);

	/** Get PorcentajeGlobal	  */
	public BigDecimal getPorcentajeGlobal();

    /** Column name PrLimpio */
    public static final String COLUMNNAME_PrLimpio = "PrLimpio";

	/** Set PrLimpio	  */
	public void setPrLimpio (String PrLimpio);

	/** Get PrLimpio	  */
	public String getPrLimpio();

    /** Column name PrLimpioPts */
    public static final String COLUMNNAME_PrLimpioPts = "PrLimpioPts";

	/** Set PrLimpioPts	  */
	public void setPrLimpioPts (BigDecimal PrLimpioPts);

	/** Get PrLimpioPts	  */
	public BigDecimal getPrLimpioPts();

    /** Column name ProductorPresente */
    public static final String COLUMNNAME_ProductorPresente = "ProductorPresente";

	/** Set ProductorPresente	  */
	public void setProductorPresente (String ProductorPresente);

	/** Get ProductorPresente	  */
	public String getProductorPresente();

    /** Column name ProductosFertilizacion */
    public static final String COLUMNNAME_ProductosFertilizacion = "ProductosFertilizacion";

	/** Set ProductosFertilizacion	  */
	public void setProductosFertilizacion (String ProductosFertilizacion);

	/** Get ProductosFertilizacion	  */
	public String getProductosFertilizacion();

    /** Column name PrPiso */
    public static final String COLUMNNAME_PrPiso = "PrPiso";

	/** Set PrPiso	  */
	public void setPrPiso (String PrPiso);

	/** Get PrPiso	  */
	public String getPrPiso();

    /** Column name PrPisoPts */
    public static final String COLUMNNAME_PrPisoPts = "PrPisoPts";

	/** Set PrPisoPts	  */
	public void setPrPisoPts (BigDecimal PrPisoPts);

	/** Get PrPisoPts	  */
	public BigDecimal getPrPisoPts();

    /** Column name PrTecho */
    public static final String COLUMNNAME_PrTecho = "PrTecho";

	/** Set PrTecho	  */
	public void setPrTecho (String PrTecho);

	/** Get PrTecho	  */
	public String getPrTecho();

    /** Column name PrTechoPts */
    public static final String COLUMNNAME_PrTechoPts = "PrTechoPts";

	/** Set PrTechoPts	  */
	public void setPrTechoPts (BigDecimal PrTechoPts);

	/** Get PrTechoPts	  */
	public BigDecimal getPrTechoPts();

    /** Column name PuntajeAgricola */
    public static final String COLUMNNAME_PuntajeAgricola = "PuntajeAgricola";

	/** Set PuntajeAgricola	  */
	public void setPuntajeAgricola (BigDecimal PuntajeAgricola);

	/** Get PuntajeAgricola	  */
	public BigDecimal getPuntajeAgricola();

    /** Column name PuntajeEquipos */
    public static final String COLUMNNAME_PuntajeEquipos = "PuntajeEquipos";

	/** Set PuntajeEquipos	  */
	public void setPuntajeEquipos (BigDecimal PuntajeEquipos);

	/** Get PuntajeEquipos	  */
	public BigDecimal getPuntajeEquipos();

    /** Column name PuntajeGlobal */
    public static final String COLUMNNAME_PuntajeGlobal = "PuntajeGlobal";

	/** Set PuntajeGlobal	  */
	public void setPuntajeGlobal (BigDecimal PuntajeGlobal);

	/** Get PuntajeGlobal	  */
	public BigDecimal getPuntajeGlobal();

    /** Column name PuntajeHigiene */
    public static final String COLUMNNAME_PuntajeHigiene = "PuntajeHigiene";

	/** Set PuntajeHigiene	  */
	public void setPuntajeHigiene (BigDecimal PuntajeHigiene);

	/** Get PuntajeHigiene	  */
	public BigDecimal getPuntajeHigiene();

    /** Column name PuntajeInfraestructura */
    public static final String COLUMNNAME_PuntajeInfraestructura = "PuntajeInfraestructura";

	/** Set PuntajeInfraestructura	  */
	public void setPuntajeInfraestructura (BigDecimal PuntajeInfraestructura);

	/** Get PuntajeInfraestructura	  */
	public BigDecimal getPuntajeInfraestructura();

    /** Column name PuntajePostcosecha */
    public static final String COLUMNNAME_PuntajePostcosecha = "PuntajePostcosecha";

	/** Set PuntajePostcosecha	  */
	public void setPuntajePostcosecha (BigDecimal PuntajePostcosecha);

	/** Get PuntajePostcosecha	  */
	public BigDecimal getPuntajePostcosecha();

    /** Column name RawKoboJSON */
    public static final String COLUMNNAME_RawKoboJSON = "RawKoboJSON";

	/** Set RawKoboJSON	  */
	public void setRawKoboJSON (String RawKoboJSON);

	/** Get RawKoboJSON	  */
	public String getRawKoboJSON();

    /** Column name Recomendaciones */
    public static final String COLUMNNAME_Recomendaciones = "Recomendaciones";

	/** Set Recomendaciones	  */
	public void setRecomendaciones (String Recomendaciones);

	/** Get Recomendaciones	  */
	public String getRecomendaciones();

    /** Column name Semana */
    public static final String COLUMNNAME_Semana = "Semana";

	/** Set Semana	  */
	public void setSemana (int Semana);

	/** Get Semana	  */
	public int getSemana();

    /** Column name TecnicoResponsable */
    public static final String COLUMNNAME_TecnicoResponsable = "TecnicoResponsable";

	/** Set TecnicoResponsable	  */
	public void setTecnicoResponsable (String TecnicoResponsable);

	/** Get TecnicoResponsable	  */
	public String getTecnicoResponsable();

    /** Column name TipoPlanFertilizacion */
    public static final String COLUMNNAME_TipoPlanFertilizacion = "TipoPlanFertilizacion";

	/** Set TipoPlanFertilizacion	  */
	public void setTipoPlanFertilizacion (String TipoPlanFertilizacion);

	/** Get TipoPlanFertilizacion	  */
	public String getTipoPlanFertilizacion();

    /** Column name TipoVisita */
    public static final String COLUMNNAME_TipoVisita = "TipoVisita";

	/** Set TipoVisita	  */
	public void setTipoVisita (String TipoVisita);

	/** Get TipoVisita	  */
	public String getTipoVisita();

    /** Column name TotalNoConformidades */
    public static final String COLUMNNAME_TotalNoConformidades = "TotalNoConformidades";

	/** Set TotalNoConformidades	  */
	public void setTotalNoConformidades (BigDecimal TotalNoConformidades);

	/** Get TotalNoConformidades	  */
	public BigDecimal getTotalNoConformidades();

    /** Column name UbicacionAltitud */
    public static final String COLUMNNAME_UbicacionAltitud = "UbicacionAltitud";

	/** Set UbicacionAltitud	  */
	public void setUbicacionAltitud (BigDecimal UbicacionAltitud);

	/** Get UbicacionAltitud	  */
	public BigDecimal getUbicacionAltitud();

    /** Column name UbicacionLatitud */
    public static final String COLUMNNAME_UbicacionLatitud = "UbicacionLatitud";

	/** Set UbicacionLatitud	  */
	public void setUbicacionLatitud (BigDecimal UbicacionLatitud);

	/** Get UbicacionLatitud	  */
	public BigDecimal getUbicacionLatitud();

    /** Column name UbicacionLongitud */
    public static final String COLUMNNAME_UbicacionLongitud = "UbicacionLongitud";

	/** Set UbicacionLongitud	  */
	public void setUbicacionLongitud (BigDecimal UbicacionLongitud);

	/** Get UbicacionLongitud	  */
	public BigDecimal getUbicacionLongitud();

    /** Column name UbicacionPrecision */
    public static final String COLUMNNAME_UbicacionPrecision = "UbicacionPrecision";

	/** Set UbicacionPrecision	  */
	public void setUbicacionPrecision (BigDecimal UbicacionPrecision);

	/** Get UbicacionPrecision	  */
	public BigDecimal getUbicacionPrecision();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UsuarioApp */
    public static final String COLUMNNAME_UsuarioApp = "UsuarioApp";

	/** Set UsuarioApp	  */
	public void setUsuarioApp (String UsuarioApp);

	/** Get UsuarioApp	  */
	public String getUsuarioApp();

    /** Column name ZmBordeRetencion */
    public static final String COLUMNNAME_ZmBordeRetencion = "ZmBordeRetencion";

	/** Set ZmBordeRetencion	  */
	public void setZmBordeRetencion (String ZmBordeRetencion);

	/** Get ZmBordeRetencion	  */
	public String getZmBordeRetencion();

    /** Column name ZmBordeRetencionPts */
    public static final String COLUMNNAME_ZmBordeRetencionPts = "ZmBordeRetencionPts";

	/** Set ZmBordeRetencionPts	  */
	public void setZmBordeRetencionPts (BigDecimal ZmBordeRetencionPts);

	/** Get ZmBordeRetencionPts	  */
	public BigDecimal getZmBordeRetencionPts();

    /** Column name ZmDuchaLavaojos */
    public static final String COLUMNNAME_ZmDuchaLavaojos = "ZmDuchaLavaojos";

	/** Set ZmDuchaLavaojos	  */
	public void setZmDuchaLavaojos (String ZmDuchaLavaojos);

	/** Get ZmDuchaLavaojos	  */
	public String getZmDuchaLavaojos();

    /** Column name ZmDuchaLavaojosPts */
    public static final String COLUMNNAME_ZmDuchaLavaojosPts = "ZmDuchaLavaojosPts";

	/** Set ZmDuchaLavaojosPts	  */
	public void setZmDuchaLavaojosPts (BigDecimal ZmDuchaLavaojosPts);

	/** Get ZmDuchaLavaojosPts	  */
	public BigDecimal getZmDuchaLavaojosPts();

    /** Column name ZmFosaDescontaminacion */
    public static final String COLUMNNAME_ZmFosaDescontaminacion = "ZmFosaDescontaminacion";

	/** Set ZmFosaDescontaminacion	  */
	public void setZmFosaDescontaminacion (String ZmFosaDescontaminacion);

	/** Get ZmFosaDescontaminacion	  */
	public String getZmFosaDescontaminacion();

    /** Column name ZmFosaDescontaminacionPts */
    public static final String COLUMNNAME_ZmFosaDescontaminacionPts = "ZmFosaDescontaminacionPts";

	/** Set ZmFosaDescontaminacionPts	  */
	public void setZmFosaDescontaminacionPts (BigDecimal ZmFosaDescontaminacionPts);

	/** Get ZmFosaDescontaminacionPts	  */
	public BigDecimal getZmFosaDescontaminacionPts();
}
