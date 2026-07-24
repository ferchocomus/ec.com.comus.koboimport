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
/** Generated Model - DO NOT CHANGE */
package com.comus.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for COMUS_TechnicalVisit
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_COMUS_TechnicalVisit extends PO implements I_COMUS_TechnicalVisit, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260723L;

    /** Standard Constructor */
    public X_COMUS_TechnicalVisit (Properties ctx, int COMUS_TechnicalVisit_ID, String trxName)
    {
      super (ctx, COMUS_TechnicalVisit_ID, trxName);
      /** if (COMUS_TechnicalVisit_ID == 0)
        {
			setCOMUS_TechnicalVisit_ID (0);
			setKoboSubmissionID (null);
        } */
    }

    /** Load Constructor */
    public X_COMUS_TechnicalVisit (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_COMUS_TechnicalVisit[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AgCintaCorrecta.
		@param AgCintaCorrecta AgCintaCorrecta	  */
	public void setAgCintaCorrecta (String AgCintaCorrecta)
	{
		set_Value (COLUMNNAME_AgCintaCorrecta, AgCintaCorrecta);
	}

	/** Get AgCintaCorrecta.
		@return AgCintaCorrecta	  */
	public String getAgCintaCorrecta () 
	{
		return (String)get_Value(COLUMNNAME_AgCintaCorrecta);
	}

	/** Set AgCintaCorrectaPts.
		@param AgCintaCorrectaPts AgCintaCorrectaPts	  */
	public void setAgCintaCorrectaPts (BigDecimal AgCintaCorrectaPts)
	{
		set_Value (COLUMNNAME_AgCintaCorrectaPts, AgCintaCorrectaPts);
	}

	/** Get AgCintaCorrectaPts.
		@return AgCintaCorrectaPts	  */
	public BigDecimal getAgCintaCorrectaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgCintaCorrectaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgControlHormigas.
		@param AgControlHormigas AgControlHormigas	  */
	public void setAgControlHormigas (String AgControlHormigas)
	{
		set_Value (COLUMNNAME_AgControlHormigas, AgControlHormigas);
	}

	/** Get AgControlHormigas.
		@return AgControlHormigas	  */
	public String getAgControlHormigas () 
	{
		return (String)get_Value(COLUMNNAME_AgControlHormigas);
	}

	/** Set AgControlHormigasPts.
		@param AgControlHormigasPts AgControlHormigasPts	  */
	public void setAgControlHormigasPts (BigDecimal AgControlHormigasPts)
	{
		set_Value (COLUMNNAME_AgControlHormigasPts, AgControlHormigasPts);
	}

	/** Get AgControlHormigasPts.
		@return AgControlHormigasPts	  */
	public BigDecimal getAgControlHormigasPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgControlHormigasPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgControlMaleza.
		@param AgControlMaleza AgControlMaleza	  */
	public void setAgControlMaleza (String AgControlMaleza)
	{
		set_Value (COLUMNNAME_AgControlMaleza, AgControlMaleza);
	}

	/** Get AgControlMaleza.
		@return AgControlMaleza	  */
	public String getAgControlMaleza () 
	{
		return (String)get_Value(COLUMNNAME_AgControlMaleza);
	}

	/** Set AgControlMalezaPts.
		@param AgControlMalezaPts AgControlMalezaPts	  */
	public void setAgControlMalezaPts (BigDecimal AgControlMalezaPts)
	{
		set_Value (COLUMNNAME_AgControlMalezaPts, AgControlMalezaPts);
	}

	/** Get AgControlMalezaPts.
		@return AgControlMalezaPts	  */
	public BigDecimal getAgControlMalezaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgControlMalezaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgControlSigatoka.
		@param AgControlSigatoka AgControlSigatoka	  */
	public void setAgControlSigatoka (String AgControlSigatoka)
	{
		set_Value (COLUMNNAME_AgControlSigatoka, AgControlSigatoka);
	}

	/** Get AgControlSigatoka.
		@return AgControlSigatoka	  */
	public String getAgControlSigatoka () 
	{
		return (String)get_Value(COLUMNNAME_AgControlSigatoka);
	}

	/** Set AgControlSigatokaPts.
		@param AgControlSigatokaPts AgControlSigatokaPts	  */
	public void setAgControlSigatokaPts (BigDecimal AgControlSigatokaPts)
	{
		set_Value (COLUMNNAME_AgControlSigatokaPts, AgControlSigatokaPts);
	}

	/** Get AgControlSigatokaPts.
		@return AgControlSigatokaPts	  */
	public BigDecimal getAgControlSigatokaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgControlSigatokaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgDeschante.
		@param AgDeschante AgDeschante	  */
	public void setAgDeschante (String AgDeschante)
	{
		set_Value (COLUMNNAME_AgDeschante, AgDeschante);
	}

	/** Get AgDeschante.
		@return AgDeschante	  */
	public String getAgDeschante () 
	{
		return (String)get_Value(COLUMNNAME_AgDeschante);
	}

	/** Set AgDeschantePts.
		@param AgDeschantePts AgDeschantePts	  */
	public void setAgDeschantePts (BigDecimal AgDeschantePts)
	{
		set_Value (COLUMNNAME_AgDeschantePts, AgDeschantePts);
	}

	/** Get AgDeschantePts.
		@return AgDeschantePts	  */
	public BigDecimal getAgDeschantePts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgDeschantePts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgDeschiveDesflore.
		@param AgDeschiveDesflore AgDeschiveDesflore	  */
	public void setAgDeschiveDesflore (String AgDeschiveDesflore)
	{
		set_Value (COLUMNNAME_AgDeschiveDesflore, AgDeschiveDesflore);
	}

	/** Get AgDeschiveDesflore.
		@return AgDeschiveDesflore	  */
	public String getAgDeschiveDesflore () 
	{
		return (String)get_Value(COLUMNNAME_AgDeschiveDesflore);
	}

	/** Set AgDeschiveDesflorePts.
		@param AgDeschiveDesflorePts AgDeschiveDesflorePts	  */
	public void setAgDeschiveDesflorePts (BigDecimal AgDeschiveDesflorePts)
	{
		set_Value (COLUMNNAME_AgDeschiveDesflorePts, AgDeschiveDesflorePts);
	}

	/** Get AgDeschiveDesflorePts.
		@return AgDeschiveDesflorePts	  */
	public BigDecimal getAgDeschiveDesflorePts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgDeschiveDesflorePts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgDeshije.
		@param AgDeshije AgDeshije	  */
	public void setAgDeshije (String AgDeshije)
	{
		set_Value (COLUMNNAME_AgDeshije, AgDeshije);
	}

	/** Get AgDeshije.
		@return AgDeshije	  */
	public String getAgDeshije () 
	{
		return (String)get_Value(COLUMNNAME_AgDeshije);
	}

	/** Set AgDeshijePts.
		@param AgDeshijePts AgDeshijePts	  */
	public void setAgDeshijePts (BigDecimal AgDeshijePts)
	{
		set_Value (COLUMNNAME_AgDeshijePts, AgDeshijePts);
	}

	/** Get AgDeshijePts.
		@return AgDeshijePts	  */
	public BigDecimal getAgDeshijePts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgDeshijePts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgDeshoje.
		@param AgDeshoje AgDeshoje	  */
	public void setAgDeshoje (String AgDeshoje)
	{
		set_Value (COLUMNNAME_AgDeshoje, AgDeshoje);
	}

	/** Get AgDeshoje.
		@return AgDeshoje	  */
	public String getAgDeshoje () 
	{
		return (String)get_Value(COLUMNNAME_AgDeshoje);
	}

	/** Set AgDeshojePts.
		@param AgDeshojePts AgDeshojePts	  */
	public void setAgDeshojePts (BigDecimal AgDeshojePts)
	{
		set_Value (COLUMNNAME_AgDeshojePts, AgDeshojePts);
	}

	/** Get AgDeshojePts.
		@return AgDeshojePts	  */
	public BigDecimal getAgDeshojePts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgDeshojePts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgDestalle.
		@param AgDestalle AgDestalle	  */
	public void setAgDestalle (String AgDestalle)
	{
		set_Value (COLUMNNAME_AgDestalle, AgDestalle);
	}

	/** Get AgDestalle.
		@return AgDestalle	  */
	public String getAgDestalle () 
	{
		return (String)get_Value(COLUMNNAME_AgDestalle);
	}

	/** Set AgDestallePts.
		@param AgDestallePts AgDestallePts	  */
	public void setAgDestallePts (BigDecimal AgDestallePts)
	{
		set_Value (COLUMNNAME_AgDestallePts, AgDestallePts);
	}

	/** Get AgDestallePts.
		@return AgDestallePts	  */
	public BigDecimal getAgDestallePts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgDestallePts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgEnraizamiento.
		@param AgEnraizamiento AgEnraizamiento	  */
	public void setAgEnraizamiento (String AgEnraizamiento)
	{
		set_Value (COLUMNNAME_AgEnraizamiento, AgEnraizamiento);
	}

	/** Get AgEnraizamiento.
		@return AgEnraizamiento	  */
	public String getAgEnraizamiento () 
	{
		return (String)get_Value(COLUMNNAME_AgEnraizamiento);
	}

	/** Set AgEnraizamientoPts.
		@param AgEnraizamientoPts AgEnraizamientoPts	  */
	public void setAgEnraizamientoPts (BigDecimal AgEnraizamientoPts)
	{
		set_Value (COLUMNNAME_AgEnraizamientoPts, AgEnraizamientoPts);
	}

	/** Get AgEnraizamientoPts.
		@return AgEnraizamientoPts	  */
	public BigDecimal getAgEnraizamientoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgEnraizamientoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgFertilizacionEdafica.
		@param AgFertilizacionEdafica AgFertilizacionEdafica	  */
	public void setAgFertilizacionEdafica (String AgFertilizacionEdafica)
	{
		set_Value (COLUMNNAME_AgFertilizacionEdafica, AgFertilizacionEdafica);
	}

	/** Get AgFertilizacionEdafica.
		@return AgFertilizacionEdafica	  */
	public String getAgFertilizacionEdafica () 
	{
		return (String)get_Value(COLUMNNAME_AgFertilizacionEdafica);
	}

	/** Set AgFertilizacionEdaficaPts.
		@param AgFertilizacionEdaficaPts AgFertilizacionEdaficaPts	  */
	public void setAgFertilizacionEdaficaPts (BigDecimal AgFertilizacionEdaficaPts)
	{
		set_Value (COLUMNNAME_AgFertilizacionEdaficaPts, AgFertilizacionEdaficaPts);
	}

	/** Get AgFertilizacionEdaficaPts.
		@return AgFertilizacionEdaficaPts	  */
	public BigDecimal getAgFertilizacionEdaficaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgFertilizacionEdaficaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgFertilizo.
		@param AgFertilizo AgFertilizo	  */
	public void setAgFertilizo (String AgFertilizo)
	{
		set_Value (COLUMNNAME_AgFertilizo, AgFertilizo);
	}

	/** Get AgFertilizo.
		@return AgFertilizo	  */
	public String getAgFertilizo () 
	{
		return (String)get_Value(COLUMNNAME_AgFertilizo);
	}

	/** Set AgFertilizoFinca.
		@param AgFertilizoFinca AgFertilizoFinca	  */
	public void setAgFertilizoFinca (String AgFertilizoFinca)
	{
		set_Value (COLUMNNAME_AgFertilizoFinca, AgFertilizoFinca);
	}

	/** Get AgFertilizoFinca.
		@return AgFertilizoFinca	  */
	public String getAgFertilizoFinca () 
	{
		return (String)get_Value(COLUMNNAME_AgFertilizoFinca);
	}

	/** Set AgFertilizoFincaPts.
		@param AgFertilizoFincaPts AgFertilizoFincaPts	  */
	public void setAgFertilizoFincaPts (BigDecimal AgFertilizoFincaPts)
	{
		set_Value (COLUMNNAME_AgFertilizoFincaPts, AgFertilizoFincaPts);
	}

	/** Get AgFertilizoFincaPts.
		@return AgFertilizoFincaPts	  */
	public BigDecimal getAgFertilizoFincaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgFertilizoFincaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgFertilizoPts.
		@param AgFertilizoPts AgFertilizoPts	  */
	public void setAgFertilizoPts (BigDecimal AgFertilizoPts)
	{
		set_Value (COLUMNNAME_AgFertilizoPts, AgFertilizoPts);
	}

	/** Get AgFertilizoPts.
		@return AgFertilizoPts	  */
	public BigDecimal getAgFertilizoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgFertilizoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgPlanDefinido.
		@param AgPlanDefinido AgPlanDefinido	  */
	public void setAgPlanDefinido (String AgPlanDefinido)
	{
		set_Value (COLUMNNAME_AgPlanDefinido, AgPlanDefinido);
	}

	/** Get AgPlanDefinido.
		@return AgPlanDefinido	  */
	public String getAgPlanDefinido () 
	{
		return (String)get_Value(COLUMNNAME_AgPlanDefinido);
	}

	/** Set AgPlanDefinidoPts.
		@param AgPlanDefinidoPts AgPlanDefinidoPts	  */
	public void setAgPlanDefinidoPts (BigDecimal AgPlanDefinidoPts)
	{
		set_Value (COLUMNNAME_AgPlanDefinidoPts, AgPlanDefinidoPts);
	}

	/** Get AgPlanDefinidoPts.
		@return AgPlanDefinidoPts	  */
	public BigDecimal getAgPlanDefinidoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgPlanDefinidoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgRacimosDaypas.
		@param AgRacimosDaypas AgRacimosDaypas	  */
	public void setAgRacimosDaypas (String AgRacimosDaypas)
	{
		set_Value (COLUMNNAME_AgRacimosDaypas, AgRacimosDaypas);
	}

	/** Get AgRacimosDaypas.
		@return AgRacimosDaypas	  */
	public String getAgRacimosDaypas () 
	{
		return (String)get_Value(COLUMNNAME_AgRacimosDaypas);
	}

	/** Set AgRacimosDaypasPts.
		@param AgRacimosDaypasPts AgRacimosDaypasPts	  */
	public void setAgRacimosDaypasPts (BigDecimal AgRacimosDaypasPts)
	{
		set_Value (COLUMNNAME_AgRacimosDaypasPts, AgRacimosDaypasPts);
	}

	/** Get AgRacimosDaypasPts.
		@return AgRacimosDaypasPts	  */
	public BigDecimal getAgRacimosDaypasPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgRacimosDaypasPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgResiembra.
		@param AgResiembra AgResiembra	  */
	public void setAgResiembra (String AgResiembra)
	{
		set_Value (COLUMNNAME_AgResiembra, AgResiembra);
	}

	/** Get AgResiembra.
		@return AgResiembra	  */
	public String getAgResiembra () 
	{
		return (String)get_Value(COLUMNNAME_AgResiembra);
	}

	/** Set AgResiembraPts.
		@param AgResiembraPts AgResiembraPts	  */
	public void setAgResiembraPts (BigDecimal AgResiembraPts)
	{
		set_Value (COLUMNNAME_AgResiembraPts, AgResiembraPts);
	}

	/** Get AgResiembraPts.
		@return AgResiembraPts	  */
	public BigDecimal getAgResiembraPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgResiembraPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgSinCochinilla.
		@param AgSinCochinilla AgSinCochinilla	  */
	public void setAgSinCochinilla (String AgSinCochinilla)
	{
		set_Value (COLUMNNAME_AgSinCochinilla, AgSinCochinilla);
	}

	/** Get AgSinCochinilla.
		@return AgSinCochinilla	  */
	public String getAgSinCochinilla () 
	{
		return (String)get_Value(COLUMNNAME_AgSinCochinilla);
	}

	/** Set AgSinCochinillaPts.
		@param AgSinCochinillaPts AgSinCochinillaPts	  */
	public void setAgSinCochinillaPts (BigDecimal AgSinCochinillaPts)
	{
		set_Value (COLUMNNAME_AgSinCochinillaPts, AgSinCochinillaPts);
	}

	/** Get AgSinCochinillaPts.
		@return AgSinCochinillaPts	  */
	public BigDecimal getAgSinCochinillaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgSinCochinillaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgSinFusariumR4.
		@param AgSinFusariumR4 AgSinFusariumR4	  */
	public void setAgSinFusariumR4 (String AgSinFusariumR4)
	{
		set_Value (COLUMNNAME_AgSinFusariumR4, AgSinFusariumR4);
	}

	/** Get AgSinFusariumR4.
		@return AgSinFusariumR4	  */
	public String getAgSinFusariumR4 () 
	{
		return (String)get_Value(COLUMNNAME_AgSinFusariumR4);
	}

	/** Set AgSinFusariumR4Pts.
		@param AgSinFusariumR4Pts AgSinFusariumR4Pts	  */
	public void setAgSinFusariumR4Pts (BigDecimal AgSinFusariumR4Pts)
	{
		set_Value (COLUMNNAME_AgSinFusariumR4Pts, AgSinFusariumR4Pts);
	}

	/** Get AgSinFusariumR4Pts.
		@return AgSinFusariumR4Pts	  */
	public BigDecimal getAgSinFusariumR4Pts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgSinFusariumR4Pts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgSinHormigas.
		@param AgSinHormigas AgSinHormigas	  */
	public void setAgSinHormigas (String AgSinHormigas)
	{
		set_Value (COLUMNNAME_AgSinHormigas, AgSinHormigas);
	}

	/** Get AgSinHormigas.
		@return AgSinHormigas	  */
	public String getAgSinHormigas () 
	{
		return (String)get_Value(COLUMNNAME_AgSinHormigas);
	}

	/** Set AgSinHormigasPts.
		@param AgSinHormigasPts AgSinHormigasPts	  */
	public void setAgSinHormigasPts (BigDecimal AgSinHormigasPts)
	{
		set_Value (COLUMNNAME_AgSinHormigasPts, AgSinHormigasPts);
	}

	/** Get AgSinHormigasPts.
		@return AgSinHormigasPts	  */
	public BigDecimal getAgSinHormigasPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgSinHormigasPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgSinMoko.
		@param AgSinMoko AgSinMoko	  */
	public void setAgSinMoko (String AgSinMoko)
	{
		set_Value (COLUMNNAME_AgSinMoko, AgSinMoko);
	}

	/** Get AgSinMoko.
		@return AgSinMoko	  */
	public String getAgSinMoko () 
	{
		return (String)get_Value(COLUMNNAME_AgSinMoko);
	}

	/** Set AgSinMokoPts.
		@param AgSinMokoPts AgSinMokoPts	  */
	public void setAgSinMokoPts (BigDecimal AgSinMokoPts)
	{
		set_Value (COLUMNNAME_AgSinMokoPts, AgSinMokoPts);
	}

	/** Get AgSinMokoPts.
		@return AgSinMokoPts	  */
	public BigDecimal getAgSinMokoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgSinMokoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgSinPulgon.
		@param AgSinPulgon AgSinPulgon	  */
	public void setAgSinPulgon (String AgSinPulgon)
	{
		set_Value (COLUMNNAME_AgSinPulgon, AgSinPulgon);
	}

	/** Get AgSinPulgon.
		@return AgSinPulgon	  */
	public String getAgSinPulgon () 
	{
		return (String)get_Value(COLUMNNAME_AgSinPulgon);
	}

	/** Set AgSinPulgonPts.
		@param AgSinPulgonPts AgSinPulgonPts	  */
	public void setAgSinPulgonPts (BigDecimal AgSinPulgonPts)
	{
		set_Value (COLUMNNAME_AgSinPulgonPts, AgSinPulgonPts);
	}

	/** Get AgSinPulgonPts.
		@return AgSinPulgonPts	  */
	public BigDecimal getAgSinPulgonPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgSinPulgonPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgSinPuntaCigarro.
		@param AgSinPuntaCigarro AgSinPuntaCigarro	  */
	public void setAgSinPuntaCigarro (String AgSinPuntaCigarro)
	{
		set_Value (COLUMNNAME_AgSinPuntaCigarro, AgSinPuntaCigarro);
	}

	/** Get AgSinPuntaCigarro.
		@return AgSinPuntaCigarro	  */
	public String getAgSinPuntaCigarro () 
	{
		return (String)get_Value(COLUMNNAME_AgSinPuntaCigarro);
	}

	/** Set AgSinPuntaCigarroPts.
		@param AgSinPuntaCigarroPts AgSinPuntaCigarroPts	  */
	public void setAgSinPuntaCigarroPts (BigDecimal AgSinPuntaCigarroPts)
	{
		set_Value (COLUMNNAME_AgSinPuntaCigarroPts, AgSinPuntaCigarroPts);
	}

	/** Get AgSinPuntaCigarroPts.
		@return AgSinPuntaCigarroPts	  */
	public BigDecimal getAgSinPuntaCigarroPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgSinPuntaCigarroPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgSinSigatoka.
		@param AgSinSigatoka AgSinSigatoka	  */
	public void setAgSinSigatoka (String AgSinSigatoka)
	{
		set_Value (COLUMNNAME_AgSinSigatoka, AgSinSigatoka);
	}

	/** Get AgSinSigatoka.
		@return AgSinSigatoka	  */
	public String getAgSinSigatoka () 
	{
		return (String)get_Value(COLUMNNAME_AgSinSigatoka);
	}

	/** Set AgSinSigatokaPts.
		@param AgSinSigatokaPts AgSinSigatokaPts	  */
	public void setAgSinSigatokaPts (BigDecimal AgSinSigatokaPts)
	{
		set_Value (COLUMNNAME_AgSinSigatokaPts, AgSinSigatokaPts);
	}

	/** Get AgSinSigatokaPts.
		@return AgSinSigatokaPts	  */
	public BigDecimal getAgSinSigatokaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgSinSigatokaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set AgSinThrips.
		@param AgSinThrips AgSinThrips	  */
	public void setAgSinThrips (String AgSinThrips)
	{
		set_Value (COLUMNNAME_AgSinThrips, AgSinThrips);
	}

	/** Get AgSinThrips.
		@return AgSinThrips	  */
	public String getAgSinThrips () 
	{
		return (String)get_Value(COLUMNNAME_AgSinThrips);
	}

	/** Set AgSinThripsPts.
		@param AgSinThripsPts AgSinThripsPts	  */
	public void setAgSinThripsPts (BigDecimal AgSinThripsPts)
	{
		set_Value (COLUMNNAME_AgSinThripsPts, AgSinThripsPts);
	}

	/** Get AgSinThripsPts.
		@return AgSinThripsPts	  */
	public BigDecimal getAgSinThripsPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AgSinThripsPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set BanoAgua.
		@param BanoAgua BanoAgua	  */
	public void setBanoAgua (String BanoAgua)
	{
		set_Value (COLUMNNAME_BanoAgua, BanoAgua);
	}

	/** Get BanoAgua.
		@return BanoAgua	  */
	public String getBanoAgua () 
	{
		return (String)get_Value(COLUMNNAME_BanoAgua);
	}

	/** Set BanoAguaPts.
		@param BanoAguaPts BanoAguaPts	  */
	public void setBanoAguaPts (BigDecimal BanoAguaPts)
	{
		set_Value (COLUMNNAME_BanoAguaPts, BanoAguaPts);
	}

	/** Get BanoAguaPts.
		@return BanoAguaPts	  */
	public BigDecimal getBanoAguaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BanoAguaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set BanoBasurero.
		@param BanoBasurero BanoBasurero	  */
	public void setBanoBasurero (String BanoBasurero)
	{
		set_Value (COLUMNNAME_BanoBasurero, BanoBasurero);
	}

	/** Get BanoBasurero.
		@return BanoBasurero	  */
	public String getBanoBasurero () 
	{
		return (String)get_Value(COLUMNNAME_BanoBasurero);
	}

	/** Set BanoBasureroPts.
		@param BanoBasureroPts BanoBasureroPts	  */
	public void setBanoBasureroPts (BigDecimal BanoBasureroPts)
	{
		set_Value (COLUMNNAME_BanoBasureroPts, BanoBasureroPts);
	}

	/** Get BanoBasureroPts.
		@return BanoBasureroPts	  */
	public BigDecimal getBanoBasureroPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BanoBasureroPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set BanoPapel.
		@param BanoPapel BanoPapel	  */
	public void setBanoPapel (String BanoPapel)
	{
		set_Value (COLUMNNAME_BanoPapel, BanoPapel);
	}

	/** Get BanoPapel.
		@return BanoPapel	  */
	public String getBanoPapel () 
	{
		return (String)get_Value(COLUMNNAME_BanoPapel);
	}

	/** Set BanoPapelPts.
		@param BanoPapelPts BanoPapelPts	  */
	public void setBanoPapelPts (BigDecimal BanoPapelPts)
	{
		set_Value (COLUMNNAME_BanoPapelPts, BanoPapelPts);
	}

	/** Get BanoPapelPts.
		@return BanoPapelPts	  */
	public BigDecimal getBanoPapelPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BanoPapelPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set BcPuertaOrden.
		@param BcPuertaOrden BcPuertaOrden	  */
	public void setBcPuertaOrden (String BcPuertaOrden)
	{
		set_Value (COLUMNNAME_BcPuertaOrden, BcPuertaOrden);
	}

	/** Get BcPuertaOrden.
		@return BcPuertaOrden	  */
	public String getBcPuertaOrden () 
	{
		return (String)get_Value(COLUMNNAME_BcPuertaOrden);
	}

	/** Set BcPuertaOrdenPts.
		@param BcPuertaOrdenPts BcPuertaOrdenPts	  */
	public void setBcPuertaOrdenPts (BigDecimal BcPuertaOrdenPts)
	{
		set_Value (COLUMNNAME_BcPuertaOrdenPts, BcPuertaOrdenPts);
	}

	/** Get BcPuertaOrdenPts.
		@return BcPuertaOrdenPts	  */
	public BigDecimal getBcPuertaOrdenPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BcPuertaOrdenPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set BqBajoLlave.
		@param BqBajoLlave BqBajoLlave	  */
	public void setBqBajoLlave (String BqBajoLlave)
	{
		set_Value (COLUMNNAME_BqBajoLlave, BqBajoLlave);
	}

	/** Get BqBajoLlave.
		@return BqBajoLlave	  */
	public String getBqBajoLlave () 
	{
		return (String)get_Value(COLUMNNAME_BqBajoLlave);
	}

	/** Set BqBajoLlavePts.
		@param BqBajoLlavePts BqBajoLlavePts	  */
	public void setBqBajoLlavePts (BigDecimal BqBajoLlavePts)
	{
		set_Value (COLUMNNAME_BqBajoLlavePts, BqBajoLlavePts);
	}

	/** Get BqBajoLlavePts.
		@return BqBajoLlavePts	  */
	public BigDecimal getBqBajoLlavePts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BqBajoLlavePts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set BqRepisas.
		@param BqRepisas BqRepisas	  */
	public void setBqRepisas (String BqRepisas)
	{
		set_Value (COLUMNNAME_BqRepisas, BqRepisas);
	}

	/** Get BqRepisas.
		@return BqRepisas	  */
	public String getBqRepisas () 
	{
		return (String)get_Value(COLUMNNAME_BqRepisas);
	}

	/** Set BqRepisasPts.
		@param BqRepisasPts BqRepisasPts	  */
	public void setBqRepisasPts (BigDecimal BqRepisasPts)
	{
		set_Value (COLUMNNAME_BqRepisasPts, BqRepisasPts);
	}

	/** Get BqRepisasPts.
		@return BqRepisasPts	  */
	public BigDecimal getBqRepisasPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BqRepisasPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set BqVentilada.
		@param BqVentilada BqVentilada	  */
	public void setBqVentilada (String BqVentilada)
	{
		set_Value (COLUMNNAME_BqVentilada, BqVentilada);
	}

	/** Get BqVentilada.
		@return BqVentilada	  */
	public String getBqVentilada () 
	{
		return (String)get_Value(COLUMNNAME_BqVentilada);
	}

	/** Set BqVentiladaPts.
		@param BqVentiladaPts BqVentiladaPts	  */
	public void setBqVentiladaPts (BigDecimal BqVentiladaPts)
	{
		set_Value (COLUMNNAME_BqVentiladaPts, BqVentiladaPts);
	}

	/** Get BqVentiladaPts.
		@return BqVentiladaPts	  */
	public BigDecimal getBqVentiladaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BqVentiladaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CajasDanoHongos.
		@param CajasDanoHongos CajasDanoHongos	  */
	public void setCajasDanoHongos (int CajasDanoHongos)
	{
		set_Value (COLUMNNAME_CajasDanoHongos, Integer.valueOf(CajasDanoHongos));
	}

	/** Get CajasDanoHongos.
		@return CajasDanoHongos	  */
	public int getCajasDanoHongos () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CajasDanoHongos);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CajasDanoInsectos.
		@param CajasDanoInsectos CajasDanoInsectos	  */
	public void setCajasDanoInsectos (int CajasDanoInsectos)
	{
		set_Value (COLUMNNAME_CajasDanoInsectos, Integer.valueOf(CajasDanoInsectos));
	}

	/** Get CajasDanoInsectos.
		@return CajasDanoInsectos	  */
	public int getCajasDanoInsectos () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CajasDanoInsectos);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CajasDanoMecanico.
		@param CajasDanoMecanico CajasDanoMecanico	  */
	public void setCajasDanoMecanico (int CajasDanoMecanico)
	{
		set_Value (COLUMNNAME_CajasDanoMecanico, Integer.valueOf(CajasDanoMecanico));
	}

	/** Get CajasDanoMecanico.
		@return CajasDanoMecanico	  */
	public int getCajasDanoMecanico () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CajasDanoMecanico);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CajasEvaluadas.
		@param CajasEvaluadas CajasEvaluadas	  */
	public void setCajasEvaluadas (int CajasEvaluadas)
	{
		set_Value (COLUMNNAME_CajasEvaluadas, Integer.valueOf(CajasEvaluadas));
	}

	/** Get CajasEvaluadas.
		@return CajasEvaluadas	  */
	public int getCajasEvaluadas () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CajasEvaluadas);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CajasPresenciaInsectos.
		@param CajasPresenciaInsectos CajasPresenciaInsectos	  */
	public void setCajasPresenciaInsectos (int CajasPresenciaInsectos)
	{
		set_Value (COLUMNNAME_CajasPresenciaInsectos, Integer.valueOf(CajasPresenciaInsectos));
	}

	/** Get CajasPresenciaInsectos.
		@return CajasPresenciaInsectos	  */
	public int getCajasPresenciaInsectos () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CajasPresenciaInsectos);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CalificacionAgricola.
		@param CalificacionAgricola CalificacionAgricola	  */
	public void setCalificacionAgricola (String CalificacionAgricola)
	{
		set_Value (COLUMNNAME_CalificacionAgricola, CalificacionAgricola);
	}

	/** Get CalificacionAgricola.
		@return CalificacionAgricola	  */
	public String getCalificacionAgricola () 
	{
		return (String)get_Value(COLUMNNAME_CalificacionAgricola);
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ClaveUnica.
		@param ClaveUnica ClaveUnica	  */
	public void setClaveUnica (String ClaveUnica)
	{
		set_Value (COLUMNNAME_ClaveUnica, ClaveUnica);
	}

	/** Get ClaveUnica.
		@return ClaveUnica	  */
	public String getClaveUnica () 
	{
		return (String)get_Value(COLUMNNAME_ClaveUnica);
	}

	/** Set CodigoProductor.
		@param CodigoProductor CodigoProductor	  */
	public void setCodigoProductor (String CodigoProductor)
	{
		set_Value (COLUMNNAME_CodigoProductor, CodigoProductor);
	}

	/** Get CodigoProductor.
		@return CodigoProductor	  */
	public String getCodigoProductor () 
	{
		return (String)get_Value(COLUMNNAME_CodigoProductor);
	}

	/** Set COMUS_TechnicalVisit.
		@param COMUS_TechnicalVisit_ID COMUS_TechnicalVisit	  */
	public void setCOMUS_TechnicalVisit_ID (int COMUS_TechnicalVisit_ID)
	{
		if (COMUS_TechnicalVisit_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COMUS_TechnicalVisit_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COMUS_TechnicalVisit_ID, Integer.valueOf(COMUS_TechnicalVisit_ID));
	}

	/** Get COMUS_TechnicalVisit.
		@return COMUS_TechnicalVisit	  */
	public int getCOMUS_TechnicalVisit_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COMUS_TechnicalVisit_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set COMUS_TechnicalVisit_UU.
		@param COMUS_TechnicalVisit_UU COMUS_TechnicalVisit_UU	  */
	public void setCOMUS_TechnicalVisit_UU (String COMUS_TechnicalVisit_UU)
	{
		set_ValueNoCheck (COLUMNNAME_COMUS_TechnicalVisit_UU, COMUS_TechnicalVisit_UU);
	}

	/** Get COMUS_TechnicalVisit_UU.
		@return COMUS_TechnicalVisit_UU	  */
	public String getCOMUS_TechnicalVisit_UU () 
	{
		return (String)get_Value(COLUMNNAME_COMUS_TechnicalVisit_UU);
	}

	/** Set EBalanzaCalibrada.
		@param EBalanzaCalibrada EBalanzaCalibrada	  */
	public void setEBalanzaCalibrada (String EBalanzaCalibrada)
	{
		set_Value (COLUMNNAME_EBalanzaCalibrada, EBalanzaCalibrada);
	}

	/** Get EBalanzaCalibrada.
		@return EBalanzaCalibrada	  */
	public String getEBalanzaCalibrada () 
	{
		return (String)get_Value(COLUMNNAME_EBalanzaCalibrada);
	}

	/** Set EBalanzaCalibradaPts.
		@param EBalanzaCalibradaPts EBalanzaCalibradaPts	  */
	public void setEBalanzaCalibradaPts (BigDecimal EBalanzaCalibradaPts)
	{
		set_Value (COLUMNNAME_EBalanzaCalibradaPts, EBalanzaCalibradaPts);
	}

	/** Get EBalanzaCalibradaPts.
		@return EBalanzaCalibradaPts	  */
	public BigDecimal getEBalanzaCalibradaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EBalanzaCalibradaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EBalanzaEstado.
		@param EBalanzaEstado EBalanzaEstado	  */
	public void setEBalanzaEstado (String EBalanzaEstado)
	{
		set_Value (COLUMNNAME_EBalanzaEstado, EBalanzaEstado);
	}

	/** Get EBalanzaEstado.
		@return EBalanzaEstado	  */
	public String getEBalanzaEstado () 
	{
		return (String)get_Value(COLUMNNAME_EBalanzaEstado);
	}

	/** Set EBalanzaEstadoPts.
		@param EBalanzaEstadoPts EBalanzaEstadoPts	  */
	public void setEBalanzaEstadoPts (BigDecimal EBalanzaEstadoPts)
	{
		set_Value (COLUMNNAME_EBalanzaEstadoPts, EBalanzaEstadoPts);
	}

	/** Get EBalanzaEstadoPts.
		@return EBalanzaEstadoPts	  */
	public BigDecimal getEBalanzaEstadoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EBalanzaEstadoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ECalibrador.
		@param ECalibrador ECalibrador	  */
	public void setECalibrador (String ECalibrador)
	{
		set_Value (COLUMNNAME_ECalibrador, ECalibrador);
	}

	/** Get ECalibrador.
		@return ECalibrador	  */
	public String getECalibrador () 
	{
		return (String)get_Value(COLUMNNAME_ECalibrador);
	}

	/** Set ECalibradorPts.
		@param ECalibradorPts ECalibradorPts	  */
	public void setECalibradorPts (BigDecimal ECalibradorPts)
	{
		set_Value (COLUMNNAME_ECalibradorPts, ECalibradorPts);
	}

	/** Get ECalibradorPts.
		@return ECalibradorPts	  */
	public BigDecimal getECalibradorPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ECalibradorPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EDosificadores.
		@param EDosificadores EDosificadores	  */
	public void setEDosificadores (String EDosificadores)
	{
		set_Value (COLUMNNAME_EDosificadores, EDosificadores);
	}

	/** Get EDosificadores.
		@return EDosificadores	  */
	public String getEDosificadores () 
	{
		return (String)get_Value(COLUMNNAME_EDosificadores);
	}

	/** Set EDosificadoresPts.
		@param EDosificadoresPts EDosificadoresPts	  */
	public void setEDosificadoresPts (BigDecimal EDosificadoresPts)
	{
		set_Value (COLUMNNAME_EDosificadoresPts, EDosificadoresPts);
	}

	/** Get EDosificadoresPts.
		@return EDosificadoresPts	  */
	public BigDecimal getEDosificadoresPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EDosificadoresPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ELprTanque.
		@param ELprTanque ELprTanque	  */
	public void setELprTanque (String ELprTanque)
	{
		set_Value (COLUMNNAME_ELprTanque, ELprTanque);
	}

	/** Get ELprTanque.
		@return ELprTanque	  */
	public String getELprTanque () 
	{
		return (String)get_Value(COLUMNNAME_ELprTanque);
	}

	/** Set ELprTanquePts.
		@param ELprTanquePts ELprTanquePts	  */
	public void setELprTanquePts (BigDecimal ELprTanquePts)
	{
		set_Value (COLUMNNAME_ELprTanquePts, ELprTanquePts);
	}

	/** Get ELprTanquePts.
		@return ELprTanquePts	  */
	public BigDecimal getELprTanquePts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ELprTanquePts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ELprTendedero.
		@param ELprTendedero ELprTendedero	  */
	public void setELprTendedero (String ELprTendedero)
	{
		set_Value (COLUMNNAME_ELprTendedero, ELprTendedero);
	}

	/** Get ELprTendedero.
		@return ELprTendedero	  */
	public String getELprTendedero () 
	{
		return (String)get_Value(COLUMNNAME_ELprTendedero);
	}

	/** Set ELprTendederoPts.
		@param ELprTendederoPts ELprTendederoPts	  */
	public void setELprTendederoPts (BigDecimal ELprTendederoPts)
	{
		set_Value (COLUMNNAME_ELprTendederoPts, ELprTendederoPts);
	}

	/** Get ELprTendederoPts.
		@return ELprTendederoPts	  */
	public BigDecimal getELprTendederoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ELprTendederoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EMesaAcolchada.
		@param EMesaAcolchada EMesaAcolchada	  */
	public void setEMesaAcolchada (String EMesaAcolchada)
	{
		set_Value (COLUMNNAME_EMesaAcolchada, EMesaAcolchada);
	}

	/** Get EMesaAcolchada.
		@return EMesaAcolchada	  */
	public String getEMesaAcolchada () 
	{
		return (String)get_Value(COLUMNNAME_EMesaAcolchada);
	}

	/** Set EMesaAcolchadaPts.
		@param EMesaAcolchadaPts EMesaAcolchadaPts	  */
	public void setEMesaAcolchadaPts (BigDecimal EMesaAcolchadaPts)
	{
		set_Value (COLUMNNAME_EMesaAcolchadaPts, EMesaAcolchadaPts);
	}

	/** Get EMesaAcolchadaPts.
		@return EMesaAcolchadaPts	  */
	public BigDecimal getEMesaAcolchadaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EMesaAcolchadaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EMesaFacilLimpieza.
		@param EMesaFacilLimpieza EMesaFacilLimpieza	  */
	public void setEMesaFacilLimpieza (String EMesaFacilLimpieza)
	{
		set_Value (COLUMNNAME_EMesaFacilLimpieza, EMesaFacilLimpieza);
	}

	/** Get EMesaFacilLimpieza.
		@return EMesaFacilLimpieza	  */
	public String getEMesaFacilLimpieza () 
	{
		return (String)get_Value(COLUMNNAME_EMesaFacilLimpieza);
	}

	/** Set EMesaFacilLimpiezaPts.
		@param EMesaFacilLimpiezaPts EMesaFacilLimpiezaPts	  */
	public void setEMesaFacilLimpiezaPts (BigDecimal EMesaFacilLimpiezaPts)
	{
		set_Value (COLUMNNAME_EMesaFacilLimpiezaPts, EMesaFacilLimpiezaPts);
	}

	/** Get EMesaFacilLimpiezaPts.
		@return EMesaFacilLimpiezaPts	  */
	public BigDecimal getEMesaFacilLimpiezaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EMesaFacilLimpiezaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EmpEstructuraMetalica.
		@param EmpEstructuraMetalica EmpEstructuraMetalica	  */
	public void setEmpEstructuraMetalica (String EmpEstructuraMetalica)
	{
		set_Value (COLUMNNAME_EmpEstructuraMetalica, EmpEstructuraMetalica);
	}

	/** Get EmpEstructuraMetalica.
		@return EmpEstructuraMetalica	  */
	public String getEmpEstructuraMetalica () 
	{
		return (String)get_Value(COLUMNNAME_EmpEstructuraMetalica);
	}

	/** Set EmpEstructuraMetalicaPts.
		@param EmpEstructuraMetalicaPts EmpEstructuraMetalicaPts	  */
	public void setEmpEstructuraMetalicaPts (BigDecimal EmpEstructuraMetalicaPts)
	{
		set_Value (COLUMNNAME_EmpEstructuraMetalicaPts, EmpEstructuraMetalicaPts);
	}

	/** Get EmpEstructuraMetalicaPts.
		@return EmpEstructuraMetalicaPts	  */
	public BigDecimal getEmpEstructuraMetalicaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EmpEstructuraMetalicaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EmpFacilLimpieza.
		@param EmpFacilLimpieza EmpFacilLimpieza	  */
	public void setEmpFacilLimpieza (String EmpFacilLimpieza)
	{
		set_Value (COLUMNNAME_EmpFacilLimpieza, EmpFacilLimpieza);
	}

	/** Get EmpFacilLimpieza.
		@return EmpFacilLimpieza	  */
	public String getEmpFacilLimpieza () 
	{
		return (String)get_Value(COLUMNNAME_EmpFacilLimpieza);
	}

	/** Set EmpFacilLimpiezaPts.
		@param EmpFacilLimpiezaPts EmpFacilLimpiezaPts	  */
	public void setEmpFacilLimpiezaPts (BigDecimal EmpFacilLimpiezaPts)
	{
		set_Value (COLUMNNAME_EmpFacilLimpiezaPts, EmpFacilLimpiezaPts);
	}

	/** Get EmpFacilLimpiezaPts.
		@return EmpFacilLimpiezaPts	  */
	public BigDecimal getEmpFacilLimpiezaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EmpFacilLimpiezaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EmpMallaSaran.
		@param EmpMallaSaran EmpMallaSaran	  */
	public void setEmpMallaSaran (String EmpMallaSaran)
	{
		set_Value (COLUMNNAME_EmpMallaSaran, EmpMallaSaran);
	}

	/** Get EmpMallaSaran.
		@return EmpMallaSaran	  */
	public String getEmpMallaSaran () 
	{
		return (String)get_Value(COLUMNNAME_EmpMallaSaran);
	}

	/** Set EmpMallaSaranPts.
		@param EmpMallaSaranPts EmpMallaSaranPts	  */
	public void setEmpMallaSaranPts (BigDecimal EmpMallaSaranPts)
	{
		set_Value (COLUMNNAME_EmpMallaSaranPts, EmpMallaSaranPts);
	}

	/** Get EmpMallaSaranPts.
		@return EmpMallaSaranPts	  */
	public BigDecimal getEmpMallaSaranPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EmpMallaSaranPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EmpPerimetro.
		@param EmpPerimetro EmpPerimetro	  */
	public void setEmpPerimetro (String EmpPerimetro)
	{
		set_Value (COLUMNNAME_EmpPerimetro, EmpPerimetro);
	}

	/** Get EmpPerimetro.
		@return EmpPerimetro	  */
	public String getEmpPerimetro () 
	{
		return (String)get_Value(COLUMNNAME_EmpPerimetro);
	}

	/** Set EmpPerimetroPts.
		@param EmpPerimetroPts EmpPerimetroPts	  */
	public void setEmpPerimetroPts (BigDecimal EmpPerimetroPts)
	{
		set_Value (COLUMNNAME_EmpPerimetroPts, EmpPerimetroPts);
	}

	/** Get EmpPerimetroPts.
		@return EmpPerimetroPts	  */
	public BigDecimal getEmpPerimetroPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EmpPerimetroPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EmpPiso.
		@param EmpPiso EmpPiso	  */
	public void setEmpPiso (String EmpPiso)
	{
		set_Value (COLUMNNAME_EmpPiso, EmpPiso);
	}

	/** Get EmpPiso.
		@return EmpPiso	  */
	public String getEmpPiso () 
	{
		return (String)get_Value(COLUMNNAME_EmpPiso);
	}

	/** Set EmpPisoPts.
		@param EmpPisoPts EmpPisoPts	  */
	public void setEmpPisoPts (BigDecimal EmpPisoPts)
	{
		set_Value (COLUMNNAME_EmpPisoPts, EmpPisoPts);
	}

	/** Get EmpPisoPts.
		@return EmpPisoPts	  */
	public BigDecimal getEmpPisoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EmpPisoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EPlatosEstado.
		@param EPlatosEstado EPlatosEstado	  */
	public void setEPlatosEstado (String EPlatosEstado)
	{
		set_Value (COLUMNNAME_EPlatosEstado, EPlatosEstado);
	}

	/** Get EPlatosEstado.
		@return EPlatosEstado	  */
	public String getEPlatosEstado () 
	{
		return (String)get_Value(COLUMNNAME_EPlatosEstado);
	}

	/** Set EPlatosEstadoPts.
		@param EPlatosEstadoPts EPlatosEstadoPts	  */
	public void setEPlatosEstadoPts (BigDecimal EPlatosEstadoPts)
	{
		set_Value (COLUMNNAME_EPlatosEstadoPts, EPlatosEstadoPts);
	}

	/** Get EPlatosEstadoPts.
		@return EPlatosEstadoPts	  */
	public BigDecimal getEPlatosEstadoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EPlatosEstadoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set EPlatosProtectores.
		@param EPlatosProtectores EPlatosProtectores	  */
	public void setEPlatosProtectores (String EPlatosProtectores)
	{
		set_Value (COLUMNNAME_EPlatosProtectores, EPlatosProtectores);
	}

	/** Get EPlatosProtectores.
		@return EPlatosProtectores	  */
	public String getEPlatosProtectores () 
	{
		return (String)get_Value(COLUMNNAME_EPlatosProtectores);
	}

	/** Set EPlatosProtectoresPts.
		@param EPlatosProtectoresPts EPlatosProtectoresPts	  */
	public void setEPlatosProtectoresPts (BigDecimal EPlatosProtectoresPts)
	{
		set_Value (COLUMNNAME_EPlatosProtectoresPts, EPlatosProtectoresPts);
	}

	/** Get EPlatosProtectoresPts.
		@return EPlatosProtectoresPts	  */
	public BigDecimal getEPlatosProtectoresPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EPlatosProtectoresPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ETinasEstado.
		@param ETinasEstado ETinasEstado	  */
	public void setETinasEstado (String ETinasEstado)
	{
		set_Value (COLUMNNAME_ETinasEstado, ETinasEstado);
	}

	/** Get ETinasEstado.
		@return ETinasEstado	  */
	public String getETinasEstado () 
	{
		return (String)get_Value(COLUMNNAME_ETinasEstado);
	}

	/** Set ETinasEstadoPts.
		@param ETinasEstadoPts ETinasEstadoPts	  */
	public void setETinasEstadoPts (BigDecimal ETinasEstadoPts)
	{
		set_Value (COLUMNNAME_ETinasEstadoPts, ETinasEstadoPts);
	}

	/** Get ETinasEstadoPts.
		@return ETinasEstadoPts	  */
	public BigDecimal getETinasEstadoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ETinasEstadoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ETinasNumero.
		@param ETinasNumero ETinasNumero	  */
	public void setETinasNumero (String ETinasNumero)
	{
		set_Value (COLUMNNAME_ETinasNumero, ETinasNumero);
	}

	/** Get ETinasNumero.
		@return ETinasNumero	  */
	public String getETinasNumero () 
	{
		return (String)get_Value(COLUMNNAME_ETinasNumero);
	}

	/** Set ETinasNumeroPts.
		@param ETinasNumeroPts ETinasNumeroPts	  */
	public void setETinasNumeroPts (BigDecimal ETinasNumeroPts)
	{
		set_Value (COLUMNNAME_ETinasNumeroPts, ETinasNumeroPts);
	}

	/** Get ETinasNumeroPts.
		@return ETinasNumeroPts	  */
	public BigDecimal getETinasNumeroPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ETinasNumeroPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FdLimpia.
		@param FdLimpia FdLimpia	  */
	public void setFdLimpia (String FdLimpia)
	{
		set_Value (COLUMNNAME_FdLimpia, FdLimpia);
	}

	/** Get FdLimpia.
		@return FdLimpia	  */
	public String getFdLimpia () 
	{
		return (String)get_Value(COLUMNNAME_FdLimpia);
	}

	/** Set FdLimpiaPts.
		@param FdLimpiaPts FdLimpiaPts	  */
	public void setFdLimpiaPts (BigDecimal FdLimpiaPts)
	{
		set_Value (COLUMNNAME_FdLimpiaPts, FdLimpiaPts);
	}

	/** Get FdLimpiaPts.
		@return FdLimpiaPts	  */
	public BigDecimal getFdLimpiaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FdLimpiaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FdTapa.
		@param FdTapa FdTapa	  */
	public void setFdTapa (String FdTapa)
	{
		set_Value (COLUMNNAME_FdTapa, FdTapa);
	}

	/** Get FdTapa.
		@return FdTapa	  */
	public String getFdTapa () 
	{
		return (String)get_Value(COLUMNNAME_FdTapa);
	}

	/** Set FdTapaPts.
		@param FdTapaPts FdTapaPts	  */
	public void setFdTapaPts (BigDecimal FdTapaPts)
	{
		set_Value (COLUMNNAME_FdTapaPts, FdTapaPts);
	}

	/** Get FdTapaPts.
		@return FdTapaPts	  */
	public BigDecimal getFdTapaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FdTapaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FechaLimiteCumplimiento.
		@param FechaLimiteCumplimiento FechaLimiteCumplimiento	  */
	public void setFechaLimiteCumplimiento (Timestamp FechaLimiteCumplimiento)
	{
		set_Value (COLUMNNAME_FechaLimiteCumplimiento, FechaLimiteCumplimiento);
	}

	/** Get FechaLimiteCumplimiento.
		@return FechaLimiteCumplimiento	  */
	public Timestamp getFechaLimiteCumplimiento () 
	{
		return (Timestamp)get_Value(COLUMNNAME_FechaLimiteCumplimiento);
	}

	/** Set FechaSistema.
		@param FechaSistema FechaSistema	  */
	public void setFechaSistema (Timestamp FechaSistema)
	{
		set_Value (COLUMNNAME_FechaSistema, FechaSistema);
	}

	/** Get FechaSistema.
		@return FechaSistema	  */
	public Timestamp getFechaSistema () 
	{
		return (Timestamp)get_Value(COLUMNNAME_FechaSistema);
	}

	/** Set FechaVisita.
		@param FechaVisita FechaVisita	  */
	public void setFechaVisita (Timestamp FechaVisita)
	{
		set_Value (COLUMNNAME_FechaVisita, FechaVisita);
	}

	/** Get FechaVisita.
		@return FechaVisita	  */
	public Timestamp getFechaVisita () 
	{
		return (Timestamp)get_Value(COLUMNNAME_FechaVisita);
	}

	/** Set FirmaProductor.
		@param FirmaProductor FirmaProductor	  */
	public void setFirmaProductor (String FirmaProductor)
	{
		set_Value (COLUMNNAME_FirmaProductor, FirmaProductor);
	}

	/** Get FirmaProductor.
		@return FirmaProductor	  */
	public String getFirmaProductor () 
	{
		return (String)get_Value(COLUMNNAME_FirmaProductor);
	}

	/** Set FotoEvidencia.
		@param FotoEvidencia FotoEvidencia	  */
	public void setFotoEvidencia (String FotoEvidencia)
	{
		set_Value (COLUMNNAME_FotoEvidencia, FotoEvidencia);
	}

	/** Get FotoEvidencia.
		@return FotoEvidencia	  */
	public String getFotoEvidencia () 
	{
		return (String)get_Value(COLUMNNAME_FotoEvidencia);
	}

	/** Set GradoColorCorrecto.
		@param GradoColorCorrecto GradoColorCorrecto	  */
	public void setGradoColorCorrecto (String GradoColorCorrecto)
	{
		set_Value (COLUMNNAME_GradoColorCorrecto, GradoColorCorrecto);
	}

	/** Get GradoColorCorrecto.
		@return GradoColorCorrecto	  */
	public String getGradoColorCorrecto () 
	{
		return (String)get_Value(COLUMNNAME_GradoColorCorrecto);
	}

	/** Set HAreaAlimentos.
		@param HAreaAlimentos HAreaAlimentos	  */
	public void setHAreaAlimentos (String HAreaAlimentos)
	{
		set_Value (COLUMNNAME_HAreaAlimentos, HAreaAlimentos);
	}

	/** Get HAreaAlimentos.
		@return HAreaAlimentos	  */
	public String getHAreaAlimentos () 
	{
		return (String)get_Value(COLUMNNAME_HAreaAlimentos);
	}

	/** Set HAreaAlimentosPts.
		@param HAreaAlimentosPts HAreaAlimentosPts	  */
	public void setHAreaAlimentosPts (BigDecimal HAreaAlimentosPts)
	{
		set_Value (COLUMNNAME_HAreaAlimentosPts, HAreaAlimentosPts);
	}

	/** Get HAreaAlimentosPts.
		@return HAreaAlimentosPts	  */
	public BigDecimal getHAreaAlimentosPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HAreaAlimentosPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HBotiquinExtintor.
		@param HBotiquinExtintor HBotiquinExtintor	  */
	public void setHBotiquinExtintor (String HBotiquinExtintor)
	{
		set_Value (COLUMNNAME_HBotiquinExtintor, HBotiquinExtintor);
	}

	/** Get HBotiquinExtintor.
		@return HBotiquinExtintor	  */
	public String getHBotiquinExtintor () 
	{
		return (String)get_Value(COLUMNNAME_HBotiquinExtintor);
	}

	/** Set HBotiquinExtintorPts.
		@param HBotiquinExtintorPts HBotiquinExtintorPts	  */
	public void setHBotiquinExtintorPts (BigDecimal HBotiquinExtintorPts)
	{
		set_Value (COLUMNNAME_HBotiquinExtintorPts, HBotiquinExtintorPts);
	}

	/** Get HBotiquinExtintorPts.
		@return HBotiquinExtintorPts	  */
	public BigDecimal getHBotiquinExtintorPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HBotiquinExtintorPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HCarpetaActualizada.
		@param HCarpetaActualizada HCarpetaActualizada	  */
	public void setHCarpetaActualizada (String HCarpetaActualizada)
	{
		set_Value (COLUMNNAME_HCarpetaActualizada, HCarpetaActualizada);
	}

	/** Get HCarpetaActualizada.
		@return HCarpetaActualizada	  */
	public String getHCarpetaActualizada () 
	{
		return (String)get_Value(COLUMNNAME_HCarpetaActualizada);
	}

	/** Set HCarpetaActualizadaPts.
		@param HCarpetaActualizadaPts HCarpetaActualizadaPts	  */
	public void setHCarpetaActualizadaPts (BigDecimal HCarpetaActualizadaPts)
	{
		set_Value (COLUMNNAME_HCarpetaActualizadaPts, HCarpetaActualizadaPts);
	}

	/** Get HCarpetaActualizadaPts.
		@return HCarpetaActualizadaPts	  */
	public BigDecimal getHCarpetaActualizadaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HCarpetaActualizadaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HCloracionCorrecta.
		@param HCloracionCorrecta HCloracionCorrecta	  */
	public void setHCloracionCorrecta (String HCloracionCorrecta)
	{
		set_Value (COLUMNNAME_HCloracionCorrecta, HCloracionCorrecta);
	}

	/** Get HCloracionCorrecta.
		@return HCloracionCorrecta	  */
	public String getHCloracionCorrecta () 
	{
		return (String)get_Value(COLUMNNAME_HCloracionCorrecta);
	}

	/** Set HCloracionCorrectaPts.
		@param HCloracionCorrectaPts HCloracionCorrectaPts	  */
	public void setHCloracionCorrectaPts (BigDecimal HCloracionCorrectaPts)
	{
		set_Value (COLUMNNAME_HCloracionCorrectaPts, HCloracionCorrectaPts);
	}

	/** Get HCloracionCorrectaPts.
		@return HCloracionCorrectaPts	  */
	public BigDecimal getHCloracionCorrectaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HCloracionCorrectaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HCultivoSinAnimales.
		@param HCultivoSinAnimales HCultivoSinAnimales	  */
	public void setHCultivoSinAnimales (String HCultivoSinAnimales)
	{
		set_Value (COLUMNNAME_HCultivoSinAnimales, HCultivoSinAnimales);
	}

	/** Get HCultivoSinAnimales.
		@return HCultivoSinAnimales	  */
	public String getHCultivoSinAnimales () 
	{
		return (String)get_Value(COLUMNNAME_HCultivoSinAnimales);
	}

	/** Set HCultivoSinAnimalesPts.
		@param HCultivoSinAnimalesPts HCultivoSinAnimalesPts	  */
	public void setHCultivoSinAnimalesPts (BigDecimal HCultivoSinAnimalesPts)
	{
		set_Value (COLUMNNAME_HCultivoSinAnimalesPts, HCultivoSinAnimalesPts);
	}

	/** Get HCultivoSinAnimalesPts.
		@return HCultivoSinAnimalesPts	  */
	public BigDecimal getHCultivoSinAnimalesPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HCultivoSinAnimalesPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HCultivoSinBasura.
		@param HCultivoSinBasura HCultivoSinBasura	  */
	public void setHCultivoSinBasura (String HCultivoSinBasura)
	{
		set_Value (COLUMNNAME_HCultivoSinBasura, HCultivoSinBasura);
	}

	/** Get HCultivoSinBasura.
		@return HCultivoSinBasura	  */
	public String getHCultivoSinBasura () 
	{
		return (String)get_Value(COLUMNNAME_HCultivoSinBasura);
	}

	/** Set HCultivoSinBasuraPts.
		@param HCultivoSinBasuraPts HCultivoSinBasuraPts	  */
	public void setHCultivoSinBasuraPts (BigDecimal HCultivoSinBasuraPts)
	{
		set_Value (COLUMNNAME_HCultivoSinBasuraPts, HCultivoSinBasuraPts);
	}

	/** Get HCultivoSinBasuraPts.
		@return HCultivoSinBasuraPts	  */
	public BigDecimal getHCultivoSinBasuraPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HCultivoSinBasuraPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HCultivoSinVertidos.
		@param HCultivoSinVertidos HCultivoSinVertidos	  */
	public void setHCultivoSinVertidos (String HCultivoSinVertidos)
	{
		set_Value (COLUMNNAME_HCultivoSinVertidos, HCultivoSinVertidos);
	}

	/** Get HCultivoSinVertidos.
		@return HCultivoSinVertidos	  */
	public String getHCultivoSinVertidos () 
	{
		return (String)get_Value(COLUMNNAME_HCultivoSinVertidos);
	}

	/** Set HCultivoSinVertidosPts.
		@param HCultivoSinVertidosPts HCultivoSinVertidosPts	  */
	public void setHCultivoSinVertidosPts (BigDecimal HCultivoSinVertidosPts)
	{
		set_Value (COLUMNNAME_HCultivoSinVertidosPts, HCultivoSinVertidosPts);
	}

	/** Get HCultivoSinVertidosPts.
		@return HCultivoSinVertidosPts	  */
	public BigDecimal getHCultivoSinVertidosPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HCultivoSinVertidosPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HEmpacadoraLimpia.
		@param HEmpacadoraLimpia HEmpacadoraLimpia	  */
	public void setHEmpacadoraLimpia (String HEmpacadoraLimpia)
	{
		set_Value (COLUMNNAME_HEmpacadoraLimpia, HEmpacadoraLimpia);
	}

	/** Get HEmpacadoraLimpia.
		@return HEmpacadoraLimpia	  */
	public String getHEmpacadoraLimpia () 
	{
		return (String)get_Value(COLUMNNAME_HEmpacadoraLimpia);
	}

	/** Set HEmpacadoraLimpiaPts.
		@param HEmpacadoraLimpiaPts HEmpacadoraLimpiaPts	  */
	public void setHEmpacadoraLimpiaPts (BigDecimal HEmpacadoraLimpiaPts)
	{
		set_Value (COLUMNNAME_HEmpacadoraLimpiaPts, HEmpacadoraLimpiaPts);
	}

	/** Get HEmpacadoraLimpiaPts.
		@return HEmpacadoraLimpiaPts	  */
	public BigDecimal getHEmpacadoraLimpiaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HEmpacadoraLimpiaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HEmpacadoraSinAnimales.
		@param HEmpacadoraSinAnimales HEmpacadoraSinAnimales	  */
	public void setHEmpacadoraSinAnimales (String HEmpacadoraSinAnimales)
	{
		set_Value (COLUMNNAME_HEmpacadoraSinAnimales, HEmpacadoraSinAnimales);
	}

	/** Get HEmpacadoraSinAnimales.
		@return HEmpacadoraSinAnimales	  */
	public String getHEmpacadoraSinAnimales () 
	{
		return (String)get_Value(COLUMNNAME_HEmpacadoraSinAnimales);
	}

	/** Set HEmpacadoraSinAnimalesPts.
		@param HEmpacadoraSinAnimalesPts HEmpacadoraSinAnimalesPts	  */
	public void setHEmpacadoraSinAnimalesPts (BigDecimal HEmpacadoraSinAnimalesPts)
	{
		set_Value (COLUMNNAME_HEmpacadoraSinAnimalesPts, HEmpacadoraSinAnimalesPts);
	}

	/** Get HEmpacadoraSinAnimalesPts.
		@return HEmpacadoraSinAnimalesPts	  */
	public BigDecimal getHEmpacadoraSinAnimalesPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HEmpacadoraSinAnimalesPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HEnvasesTripleLavado.
		@param HEnvasesTripleLavado HEnvasesTripleLavado	  */
	public void setHEnvasesTripleLavado (String HEnvasesTripleLavado)
	{
		set_Value (COLUMNNAME_HEnvasesTripleLavado, HEnvasesTripleLavado);
	}

	/** Get HEnvasesTripleLavado.
		@return HEnvasesTripleLavado	  */
	public String getHEnvasesTripleLavado () 
	{
		return (String)get_Value(COLUMNNAME_HEnvasesTripleLavado);
	}

	/** Set HEnvasesTripleLavadoPts.
		@param HEnvasesTripleLavadoPts HEnvasesTripleLavadoPts	  */
	public void setHEnvasesTripleLavadoPts (BigDecimal HEnvasesTripleLavadoPts)
	{
		set_Value (COLUMNNAME_HEnvasesTripleLavadoPts, HEnvasesTripleLavadoPts);
	}

	/** Get HEnvasesTripleLavadoPts.
		@return HEnvasesTripleLavadoPts	  */
	public BigDecimal getHEnvasesTripleLavadoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HEnvasesTripleLavadoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HEppEnfunde.
		@param HEppEnfunde HEppEnfunde	  */
	public void setHEppEnfunde (String HEppEnfunde)
	{
		set_Value (COLUMNNAME_HEppEnfunde, HEppEnfunde);
	}

	/** Get HEppEnfunde.
		@return HEppEnfunde	  */
	public String getHEppEnfunde () 
	{
		return (String)get_Value(COLUMNNAME_HEppEnfunde);
	}

	/** Set HEppEnfundePts.
		@param HEppEnfundePts HEppEnfundePts	  */
	public void setHEppEnfundePts (BigDecimal HEppEnfundePts)
	{
		set_Value (COLUMNNAME_HEppEnfundePts, HEppEnfundePts);
	}

	/** Get HEppEnfundePts.
		@return HEppEnfundePts	  */
	public BigDecimal getHEppEnfundePts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HEppEnfundePts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HEppGeneral.
		@param HEppGeneral HEppGeneral	  */
	public void setHEppGeneral (String HEppGeneral)
	{
		set_Value (COLUMNNAME_HEppGeneral, HEppGeneral);
	}

	/** Get HEppGeneral.
		@return HEppGeneral	  */
	public String getHEppGeneral () 
	{
		return (String)get_Value(COLUMNNAME_HEppGeneral);
	}

	/** Set HEppGeneralPts.
		@param HEppGeneralPts HEppGeneralPts	  */
	public void setHEppGeneralPts (BigDecimal HEppGeneralPts)
	{
		set_Value (COLUMNNAME_HEppGeneralPts, HEppGeneralPts);
	}

	/** Get HEppGeneralPts.
		@return HEppGeneralPts	  */
	public BigDecimal getHEppGeneralPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HEppGeneralPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HEppTinas.
		@param HEppTinas HEppTinas	  */
	public void setHEppTinas (String HEppTinas)
	{
		set_Value (COLUMNNAME_HEppTinas, HEppTinas);
	}

	/** Get HEppTinas.
		@return HEppTinas	  */
	public String getHEppTinas () 
	{
		return (String)get_Value(COLUMNNAME_HEppTinas);
	}

	/** Set HEppTinasPts.
		@param HEppTinasPts HEppTinasPts	  */
	public void setHEppTinasPts (BigDecimal HEppTinasPts)
	{
		set_Value (COLUMNNAME_HEppTinasPts, HEppTinasPts);
	}

	/** Get HEppTinasPts.
		@return HEppTinasPts	  */
	public BigDecimal getHEppTinasPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HEppTinasPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HFrutaPalets.
		@param HFrutaPalets HFrutaPalets	  */
	public void setHFrutaPalets (String HFrutaPalets)
	{
		set_Value (COLUMNNAME_HFrutaPalets, HFrutaPalets);
	}

	/** Get HFrutaPalets.
		@return HFrutaPalets	  */
	public String getHFrutaPalets () 
	{
		return (String)get_Value(COLUMNNAME_HFrutaPalets);
	}

	/** Set HFrutaPaletsPts.
		@param HFrutaPaletsPts HFrutaPaletsPts	  */
	public void setHFrutaPaletsPts (BigDecimal HFrutaPaletsPts)
	{
		set_Value (COLUMNNAME_HFrutaPaletsPts, HFrutaPaletsPts);
	}

	/** Get HFrutaPaletsPts.
		@return HFrutaPaletsPts	  */
	public BigDecimal getHFrutaPaletsPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HFrutaPaletsPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HInmediacionesLimpias.
		@param HInmediacionesLimpias HInmediacionesLimpias	  */
	public void setHInmediacionesLimpias (String HInmediacionesLimpias)
	{
		set_Value (COLUMNNAME_HInmediacionesLimpias, HInmediacionesLimpias);
	}

	/** Get HInmediacionesLimpias.
		@return HInmediacionesLimpias	  */
	public String getHInmediacionesLimpias () 
	{
		return (String)get_Value(COLUMNNAME_HInmediacionesLimpias);
	}

	/** Set HInmediacionesLimpiasPts.
		@param HInmediacionesLimpiasPts HInmediacionesLimpiasPts	  */
	public void setHInmediacionesLimpiasPts (BigDecimal HInmediacionesLimpiasPts)
	{
		set_Value (COLUMNNAME_HInmediacionesLimpiasPts, HInmediacionesLimpiasPts);
	}

	/** Get HInmediacionesLimpiasPts.
		@return HInmediacionesLimpiasPts	  */
	public BigDecimal getHInmediacionesLimpiasPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HInmediacionesLimpiasPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HMaterialesPalets.
		@param HMaterialesPalets HMaterialesPalets	  */
	public void setHMaterialesPalets (String HMaterialesPalets)
	{
		set_Value (COLUMNNAME_HMaterialesPalets, HMaterialesPalets);
	}

	/** Get HMaterialesPalets.
		@return HMaterialesPalets	  */
	public String getHMaterialesPalets () 
	{
		return (String)get_Value(COLUMNNAME_HMaterialesPalets);
	}

	/** Set HMaterialesPaletsPts.
		@param HMaterialesPaletsPts HMaterialesPaletsPts	  */
	public void setHMaterialesPaletsPts (BigDecimal HMaterialesPaletsPts)
	{
		set_Value (COLUMNNAME_HMaterialesPaletsPts, HMaterialesPaletsPts);
	}

	/** Get HMaterialesPaletsPts.
		@return HMaterialesPaletsPts	  */
	public BigDecimal getHMaterialesPaletsPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HMaterialesPaletsPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HoraFin.
		@param HoraFin HoraFin	  */
	public void setHoraFin (Timestamp HoraFin)
	{
		set_Value (COLUMNNAME_HoraFin, HoraFin);
	}

	/** Get HoraFin.
		@return HoraFin	  */
	public Timestamp getHoraFin () 
	{
		return (Timestamp)get_Value(COLUMNNAME_HoraFin);
	}

	/** Set HoraInicio.
		@param HoraInicio HoraInicio	  */
	public void setHoraInicio (Timestamp HoraInicio)
	{
		set_Value (COLUMNNAME_HoraInicio, HoraInicio);
	}

	/** Get HoraInicio.
		@return HoraInicio	  */
	public Timestamp getHoraInicio () 
	{
		return (Timestamp)get_Value(COLUMNNAME_HoraInicio);
	}

	/** Set HRacimosColgadero.
		@param HRacimosColgadero HRacimosColgadero	  */
	public void setHRacimosColgadero (String HRacimosColgadero)
	{
		set_Value (COLUMNNAME_HRacimosColgadero, HRacimosColgadero);
	}

	/** Get HRacimosColgadero.
		@return HRacimosColgadero	  */
	public String getHRacimosColgadero () 
	{
		return (String)get_Value(COLUMNNAME_HRacimosColgadero);
	}

	/** Set HRacimosColgaderoPts.
		@param HRacimosColgaderoPts HRacimosColgaderoPts	  */
	public void setHRacimosColgaderoPts (BigDecimal HRacimosColgaderoPts)
	{
		set_Value (COLUMNNAME_HRacimosColgaderoPts, HRacimosColgaderoPts);
	}

	/** Get HRacimosColgaderoPts.
		@return HRacimosColgaderoPts	  */
	public BigDecimal getHRacimosColgaderoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HRacimosColgaderoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HRetiroRestos.
		@param HRetiroRestos HRetiroRestos	  */
	public void setHRetiroRestos (String HRetiroRestos)
	{
		set_Value (COLUMNNAME_HRetiroRestos, HRetiroRestos);
	}

	/** Get HRetiroRestos.
		@return HRetiroRestos	  */
	public String getHRetiroRestos () 
	{
		return (String)get_Value(COLUMNNAME_HRetiroRestos);
	}

	/** Set HRetiroRestosPts.
		@param HRetiroRestosPts HRetiroRestosPts	  */
	public void setHRetiroRestosPts (BigDecimal HRetiroRestosPts)
	{
		set_Value (COLUMNNAME_HRetiroRestosPts, HRetiroRestosPts);
	}

	/** Get HRetiroRestosPts.
		@return HRetiroRestosPts	  */
	public BigDecimal getHRetiroRestosPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HRetiroRestosPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HSinAccesorios.
		@param HSinAccesorios HSinAccesorios	  */
	public void setHSinAccesorios (String HSinAccesorios)
	{
		set_Value (COLUMNNAME_HSinAccesorios, HSinAccesorios);
	}

	/** Get HSinAccesorios.
		@return HSinAccesorios	  */
	public String getHSinAccesorios () 
	{
		return (String)get_Value(COLUMNNAME_HSinAccesorios);
	}

	/** Set HSinAccesoriosPts.
		@param HSinAccesoriosPts HSinAccesoriosPts	  */
	public void setHSinAccesoriosPts (BigDecimal HSinAccesoriosPts)
	{
		set_Value (COLUMNNAME_HSinAccesoriosPts, HSinAccesoriosPts);
	}

	/** Get HSinAccesoriosPts.
		@return HSinAccesoriosPts	  */
	public BigDecimal getHSinAccesoriosPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HSinAccesoriosPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HSinRaquis.
		@param HSinRaquis HSinRaquis	  */
	public void setHSinRaquis (String HSinRaquis)
	{
		set_Value (COLUMNNAME_HSinRaquis, HSinRaquis);
	}

	/** Get HSinRaquis.
		@return HSinRaquis	  */
	public String getHSinRaquis () 
	{
		return (String)get_Value(COLUMNNAME_HSinRaquis);
	}

	/** Set HSinRaquisPts.
		@param HSinRaquisPts HSinRaquisPts	  */
	public void setHSinRaquisPts (BigDecimal HSinRaquisPts)
	{
		set_Value (COLUMNNAME_HSinRaquisPts, HSinRaquisPts);
	}

	/** Get HSinRaquisPts.
		@return HSinRaquisPts	  */
	public BigDecimal getHSinRaquisPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HSinRaquisPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HUsanLavamanos.
		@param HUsanLavamanos HUsanLavamanos	  */
	public void setHUsanLavamanos (String HUsanLavamanos)
	{
		set_Value (COLUMNNAME_HUsanLavamanos, HUsanLavamanos);
	}

	/** Get HUsanLavamanos.
		@return HUsanLavamanos	  */
	public String getHUsanLavamanos () 
	{
		return (String)get_Value(COLUMNNAME_HUsanLavamanos);
	}

	/** Set HUsanLavamanosPts.
		@param HUsanLavamanosPts HUsanLavamanosPts	  */
	public void setHUsanLavamanosPts (BigDecimal HUsanLavamanosPts)
	{
		set_Value (COLUMNNAME_HUsanLavamanosPts, HUsanLavamanosPts);
	}

	/** Get HUsanLavamanosPts.
		@return HUsanLavamanosPts	  */
	public BigDecimal getHUsanLavamanosPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_HUsanLavamanosPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set IdDispositivo.
		@param IdDispositivo IdDispositivo	  */
	public void setIdDispositivo (String IdDispositivo)
	{
		set_Value (COLUMNNAME_IdDispositivo, IdDispositivo);
	}

	/** Get IdDispositivo.
		@return IdDispositivo	  */
	public String getIdDispositivo () 
	{
		return (String)get_Value(COLUMNNAME_IdDispositivo);
	}

	/** Set KoboSubmissionID.
		@param KoboSubmissionID KoboSubmissionID	  */
	public void setKoboSubmissionID (String KoboSubmissionID)
	{
		set_Value (COLUMNNAME_KoboSubmissionID, KoboSubmissionID);
	}

	/** Get KoboSubmissionID.
		@return KoboSubmissionID	  */
	public String getKoboSubmissionID () 
	{
		return (String)get_Value(COLUMNNAME_KoboSubmissionID);
	}

	/** Set KoboSubmissionTime.
		@param KoboSubmissionTime KoboSubmissionTime	  */
	public void setKoboSubmissionTime (Timestamp KoboSubmissionTime)
	{
		set_Value (COLUMNNAME_KoboSubmissionTime, KoboSubmissionTime);
	}

	/** Get KoboSubmissionTime.
		@return KoboSubmissionTime	  */
	public Timestamp getKoboSubmissionTime () 
	{
		return (Timestamp)get_Value(COLUMNNAME_KoboSubmissionTime);
	}

	/** Set LavAgua.
		@param LavAgua LavAgua	  */
	public void setLavAgua (String LavAgua)
	{
		set_Value (COLUMNNAME_LavAgua, LavAgua);
	}

	/** Get LavAgua.
		@return LavAgua	  */
	public String getLavAgua () 
	{
		return (String)get_Value(COLUMNNAME_LavAgua);
	}

	/** Set LavAguaPts.
		@param LavAguaPts LavAguaPts	  */
	public void setLavAguaPts (BigDecimal LavAguaPts)
	{
		set_Value (COLUMNNAME_LavAguaPts, LavAguaPts);
	}

	/** Get LavAguaPts.
		@return LavAguaPts	  */
	public BigDecimal getLavAguaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LavAguaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set LavDesague.
		@param LavDesague LavDesague	  */
	public void setLavDesague (String LavDesague)
	{
		set_Value (COLUMNNAME_LavDesague, LavDesague);
	}

	/** Get LavDesague.
		@return LavDesague	  */
	public String getLavDesague () 
	{
		return (String)get_Value(COLUMNNAME_LavDesague);
	}

	/** Set LavDesaguePts.
		@param LavDesaguePts LavDesaguePts	  */
	public void setLavDesaguePts (BigDecimal LavDesaguePts)
	{
		set_Value (COLUMNNAME_LavDesaguePts, LavDesaguePts);
	}

	/** Get LavDesaguePts.
		@return LavDesaguePts	  */
	public BigDecimal getLavDesaguePts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LavDesaguePts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set LavJabon.
		@param LavJabon LavJabon	  */
	public void setLavJabon (String LavJabon)
	{
		set_Value (COLUMNNAME_LavJabon, LavJabon);
	}

	/** Get LavJabon.
		@return LavJabon	  */
	public String getLavJabon () 
	{
		return (String)get_Value(COLUMNNAME_LavJabon);
	}

	/** Set LavJabonPts.
		@param LavJabonPts LavJabonPts	  */
	public void setLavJabonPts (BigDecimal LavJabonPts)
	{
		set_Value (COLUMNNAME_LavJabonPts, LavJabonPts);
	}

	/** Get LavJabonPts.
		@return LavJabonPts	  */
	public BigDecimal getLavJabonPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LavJabonPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set LavToalla.
		@param LavToalla LavToalla	  */
	public void setLavToalla (String LavToalla)
	{
		set_Value (COLUMNNAME_LavToalla, LavToalla);
	}

	/** Get LavToalla.
		@return LavToalla	  */
	public String getLavToalla () 
	{
		return (String)get_Value(COLUMNNAME_LavToalla);
	}

	/** Set LavToallaPts.
		@param LavToallaPts LavToallaPts	  */
	public void setLavToallaPts (BigDecimal LavToallaPts)
	{
		set_Value (COLUMNNAME_LavToallaPts, LavToallaPts);
	}

	/** Get LavToallaPts.
		@return LavToallaPts	  */
	public BigDecimal getLavToallaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LavToallaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MotivoSinFirma.
		@param MotivoSinFirma MotivoSinFirma	  */
	public void setMotivoSinFirma (String MotivoSinFirma)
	{
		set_Value (COLUMNNAME_MotivoSinFirma, MotivoSinFirma);
	}

	/** Get MotivoSinFirma.
		@return MotivoSinFirma	  */
	public String getMotivoSinFirma () 
	{
		return (String)get_Value(COLUMNNAME_MotivoSinFirma);
	}

	/** Set NombreFirmante.
		@param NombreFirmante NombreFirmante	  */
	public void setNombreFirmante (String NombreFirmante)
	{
		set_Value (COLUMNNAME_NombreFirmante, NombreFirmante);
	}

	/** Get NombreFirmante.
		@return NombreFirmante	  */
	public String getNombreFirmante () 
	{
		return (String)get_Value(COLUMNNAME_NombreFirmante);
	}

	/** Set NombreProductor.
		@param NombreProductor NombreProductor	  */
	public void setNombreProductor (String NombreProductor)
	{
		set_Value (COLUMNNAME_NombreProductor, NombreProductor);
	}

	/** Get NombreProductor.
		@return NombreProductor	  */
	public String getNombreProductor () 
	{
		return (String)get_Value(COLUMNNAME_NombreProductor);
	}

	/** Set NumeroFasesFertilizacion.
		@param NumeroFasesFertilizacion NumeroFasesFertilizacion	  */
	public void setNumeroFasesFertilizacion (int NumeroFasesFertilizacion)
	{
		set_Value (COLUMNNAME_NumeroFasesFertilizacion, Integer.valueOf(NumeroFasesFertilizacion));
	}

	/** Get NumeroFasesFertilizacion.
		@return NumeroFasesFertilizacion	  */
	public int getNumeroFasesFertilizacion () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NumeroFasesFertilizacion);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Observaciones.
		@param Observaciones Observaciones	  */
	public void setObservaciones (String Observaciones)
	{
		set_Value (COLUMNNAME_Observaciones, Observaciones);
	}

	/** Get Observaciones.
		@return Observaciones	  */
	public String getObservaciones () 
	{
		return (String)get_Value(COLUMNNAME_Observaciones);
	}

	/** Set PcAspersion.
		@param PcAspersion PcAspersion	  */
	public void setPcAspersion (String PcAspersion)
	{
		set_Value (COLUMNNAME_PcAspersion, PcAspersion);
	}

	/** Get PcAspersion.
		@return PcAspersion	  */
	public String getPcAspersion () 
	{
		return (String)get_Value(COLUMNNAME_PcAspersion);
	}

	/** Set PcAspersionPts.
		@param PcAspersionPts PcAspersionPts	  */
	public void setPcAspersionPts (BigDecimal PcAspersionPts)
	{
		set_Value (COLUMNNAME_PcAspersionPts, PcAspersionPts);
	}

	/** Get PcAspersionPts.
		@return PcAspersionPts	  */
	public BigDecimal getPcAspersionPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PcAspersionPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PcAspersor.
		@param PcAspersor PcAspersor	  */
	public void setPcAspersor (String PcAspersor)
	{
		set_Value (COLUMNNAME_PcAspersor, PcAspersor);
	}

	/** Get PcAspersor.
		@return PcAspersor	  */
	public String getPcAspersor () 
	{
		return (String)get_Value(COLUMNNAME_PcAspersor);
	}

	/** Set PcAspersorPts.
		@param PcAspersorPts PcAspersorPts	  */
	public void setPcAspersorPts (BigDecimal PcAspersorPts)
	{
		set_Value (COLUMNNAME_PcAspersorPts, PcAspersorPts);
	}

	/** Get PcAspersorPts.
		@return PcAspersorPts	  */
	public BigDecimal getPcAspersorPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PcAspersorPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PcCambioAgua.
		@param PcCambioAgua PcCambioAgua	  */
	public void setPcCambioAgua (String PcCambioAgua)
	{
		set_Value (COLUMNNAME_PcCambioAgua, PcCambioAgua);
	}

	/** Get PcCambioAgua.
		@return PcCambioAgua	  */
	public String getPcCambioAgua () 
	{
		return (String)get_Value(COLUMNNAME_PcCambioAgua);
	}

	/** Set PcCambioAguaPts.
		@param PcCambioAguaPts PcCambioAguaPts	  */
	public void setPcCambioAguaPts (BigDecimal PcCambioAguaPts)
	{
		set_Value (COLUMNNAME_PcCambioAguaPts, PcCambioAguaPts);
	}

	/** Get PcCambioAguaPts.
		@return PcCambioAguaPts	  */
	public BigDecimal getPcCambioAguaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PcCambioAguaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PcDosificacion.
		@param PcDosificacion PcDosificacion	  */
	public void setPcDosificacion (String PcDosificacion)
	{
		set_Value (COLUMNNAME_PcDosificacion, PcDosificacion);
	}

	/** Get PcDosificacion.
		@return PcDosificacion	  */
	public String getPcDosificacion () 
	{
		return (String)get_Value(COLUMNNAME_PcDosificacion);
	}

	/** Set PcDosificacionPts.
		@param PcDosificacionPts PcDosificacionPts	  */
	public void setPcDosificacionPts (BigDecimal PcDosificacionPts)
	{
		set_Value (COLUMNNAME_PcDosificacionPts, PcDosificacionPts);
	}

	/** Get PcDosificacionPts.
		@return PcDosificacionPts	  */
	public BigDecimal getPcDosificacionPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PcDosificacionPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PcEsquineros.
		@param PcEsquineros PcEsquineros	  */
	public void setPcEsquineros (String PcEsquineros)
	{
		set_Value (COLUMNNAME_PcEsquineros, PcEsquineros);
	}

	/** Get PcEsquineros.
		@return PcEsquineros	  */
	public String getPcEsquineros () 
	{
		return (String)get_Value(COLUMNNAME_PcEsquineros);
	}

	/** Set PcEsquinerosPts.
		@param PcEsquinerosPts PcEsquinerosPts	  */
	public void setPcEsquinerosPts (BigDecimal PcEsquinerosPts)
	{
		set_Value (COLUMNNAME_PcEsquinerosPts, PcEsquinerosPts);
	}

	/** Get PcEsquinerosPts.
		@return PcEsquinerosPts	  */
	public BigDecimal getPcEsquinerosPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PcEsquinerosPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PcInmersion.
		@param PcInmersion PcInmersion	  */
	public void setPcInmersion (String PcInmersion)
	{
		set_Value (COLUMNNAME_PcInmersion, PcInmersion);
	}

	/** Get PcInmersion.
		@return PcInmersion	  */
	public String getPcInmersion () 
	{
		return (String)get_Value(COLUMNNAME_PcInmersion);
	}

	/** Set PcInmersionPts.
		@param PcInmersionPts PcInmersionPts	  */
	public void setPcInmersionPts (BigDecimal PcInmersionPts)
	{
		set_Value (COLUMNNAME_PcInmersionPts, PcInmersionPts);
	}

	/** Get PcInmersionPts.
		@return PcInmersionPts	  */
	public BigDecimal getPcInmersionPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PcInmersionPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PcPhRango.
		@param PcPhRango PcPhRango	  */
	public void setPcPhRango (String PcPhRango)
	{
		set_Value (COLUMNNAME_PcPhRango, PcPhRango);
	}

	/** Get PcPhRango.
		@return PcPhRango	  */
	public String getPcPhRango () 
	{
		return (String)get_Value(COLUMNNAME_PcPhRango);
	}

	/** Set PcPhRangoPts.
		@param PcPhRangoPts PcPhRangoPts	  */
	public void setPcPhRangoPts (BigDecimal PcPhRangoPts)
	{
		set_Value (COLUMNNAME_PcPhRangoPts, PcPhRangoPts);
	}

	/** Get PcPhRangoPts.
		@return PcPhRangoPts	  */
	public BigDecimal getPcPhRangoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PcPhRangoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PcPlatos.
		@param PcPlatos PcPlatos	  */
	public void setPcPlatos (String PcPlatos)
	{
		set_Value (COLUMNNAME_PcPlatos, PcPlatos);
	}

	/** Get PcPlatos.
		@return PcPlatos	  */
	public String getPcPlatos () 
	{
		return (String)get_Value(COLUMNNAME_PcPlatos);
	}

	/** Set PcPlatosPts.
		@param PcPlatosPts PcPlatosPts	  */
	public void setPcPlatosPts (BigDecimal PcPlatosPts)
	{
		set_Value (COLUMNNAME_PcPlatosPts, PcPlatosPts);
	}

	/** Get PcPlatosPts.
		@return PcPlatosPts	  */
	public BigDecimal getPcPlatosPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PcPlatosPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PcSaneo.
		@param PcSaneo PcSaneo	  */
	public void setPcSaneo (String PcSaneo)
	{
		set_Value (COLUMNNAME_PcSaneo, PcSaneo);
	}

	/** Get PcSaneo.
		@return PcSaneo	  */
	public String getPcSaneo () 
	{
		return (String)get_Value(COLUMNNAME_PcSaneo);
	}

	/** Set PcSaneoPts.
		@param PcSaneoPts PcSaneoPts	  */
	public void setPcSaneoPts (BigDecimal PcSaneoPts)
	{
		set_Value (COLUMNNAME_PcSaneoPts, PcSaneoPts);
	}

	/** Get PcSaneoPts.
		@return PcSaneoPts	  */
	public BigDecimal getPcSaneoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PcSaneoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PcTinaFruta.
		@param PcTinaFruta PcTinaFruta	  */
	public void setPcTinaFruta (String PcTinaFruta)
	{
		set_Value (COLUMNNAME_PcTinaFruta, PcTinaFruta);
	}

	/** Get PcTinaFruta.
		@return PcTinaFruta	  */
	public String getPcTinaFruta () 
	{
		return (String)get_Value(COLUMNNAME_PcTinaFruta);
	}

	/** Set PcTinaFrutaPts.
		@param PcTinaFrutaPts PcTinaFrutaPts	  */
	public void setPcTinaFrutaPts (BigDecimal PcTinaFrutaPts)
	{
		set_Value (COLUMNNAME_PcTinaFrutaPts, PcTinaFrutaPts);
	}

	/** Get PcTinaFrutaPts.
		@return PcTinaFrutaPts	  */
	public BigDecimal getPcTinaFrutaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PcTinaFrutaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PedAguaClorada.
		@param PedAguaClorada PedAguaClorada	  */
	public void setPedAguaClorada (String PedAguaClorada)
	{
		set_Value (COLUMNNAME_PedAguaClorada, PedAguaClorada);
	}

	/** Get PedAguaClorada.
		@return PedAguaClorada	  */
	public String getPedAguaClorada () 
	{
		return (String)get_Value(COLUMNNAME_PedAguaClorada);
	}

	/** Set PedAguaCloradaPts.
		@param PedAguaCloradaPts PedAguaCloradaPts	  */
	public void setPedAguaCloradaPts (BigDecimal PedAguaCloradaPts)
	{
		set_Value (COLUMNNAME_PedAguaCloradaPts, PedAguaCloradaPts);
	}

	/** Get PedAguaCloradaPts.
		@return PedAguaCloradaPts	  */
	public BigDecimal getPedAguaCloradaPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PedAguaCloradaPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PedDesague.
		@param PedDesague PedDesague	  */
	public void setPedDesague (String PedDesague)
	{
		set_Value (COLUMNNAME_PedDesague, PedDesague);
	}

	/** Get PedDesague.
		@return PedDesague	  */
	public String getPedDesague () 
	{
		return (String)get_Value(COLUMNNAME_PedDesague);
	}

	/** Set PedDesaguePts.
		@param PedDesaguePts PedDesaguePts	  */
	public void setPedDesaguePts (BigDecimal PedDesaguePts)
	{
		set_Value (COLUMNNAME_PedDesaguePts, PedDesaguePts);
	}

	/** Get PedDesaguePts.
		@return PedDesaguePts	  */
	public BigDecimal getPedDesaguePts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PedDesaguePts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PedIngreso.
		@param PedIngreso PedIngreso	  */
	public void setPedIngreso (String PedIngreso)
	{
		set_Value (COLUMNNAME_PedIngreso, PedIngreso);
	}

	/** Get PedIngreso.
		@return PedIngreso	  */
	public String getPedIngreso () 
	{
		return (String)get_Value(COLUMNNAME_PedIngreso);
	}

	/** Set PedIngresoPts.
		@param PedIngresoPts PedIngresoPts	  */
	public void setPedIngresoPts (BigDecimal PedIngresoPts)
	{
		set_Value (COLUMNNAME_PedIngresoPts, PedIngresoPts);
	}

	/** Get PedIngresoPts.
		@return PedIngresoPts	  */
	public BigDecimal getPedIngresoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PedIngresoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PorcentajeGlobal.
		@param PorcentajeGlobal PorcentajeGlobal	  */
	public void setPorcentajeGlobal (BigDecimal PorcentajeGlobal)
	{
		set_Value (COLUMNNAME_PorcentajeGlobal, PorcentajeGlobal);
	}

	/** Get PorcentajeGlobal.
		@return PorcentajeGlobal	  */
	public BigDecimal getPorcentajeGlobal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PorcentajeGlobal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PrLimpio.
		@param PrLimpio PrLimpio	  */
	public void setPrLimpio (String PrLimpio)
	{
		set_Value (COLUMNNAME_PrLimpio, PrLimpio);
	}

	/** Get PrLimpio.
		@return PrLimpio	  */
	public String getPrLimpio () 
	{
		return (String)get_Value(COLUMNNAME_PrLimpio);
	}

	/** Set PrLimpioPts.
		@param PrLimpioPts PrLimpioPts	  */
	public void setPrLimpioPts (BigDecimal PrLimpioPts)
	{
		set_Value (COLUMNNAME_PrLimpioPts, PrLimpioPts);
	}

	/** Get PrLimpioPts.
		@return PrLimpioPts	  */
	public BigDecimal getPrLimpioPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PrLimpioPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ProductorPresente.
		@param ProductorPresente ProductorPresente	  */
	public void setProductorPresente (String ProductorPresente)
	{
		set_Value (COLUMNNAME_ProductorPresente, ProductorPresente);
	}

	/** Get ProductorPresente.
		@return ProductorPresente	  */
	public String getProductorPresente () 
	{
		return (String)get_Value(COLUMNNAME_ProductorPresente);
	}

	/** Set ProductosFertilizacion.
		@param ProductosFertilizacion ProductosFertilizacion	  */
	public void setProductosFertilizacion (String ProductosFertilizacion)
	{
		set_Value (COLUMNNAME_ProductosFertilizacion, ProductosFertilizacion);
	}

	/** Get ProductosFertilizacion.
		@return ProductosFertilizacion	  */
	public String getProductosFertilizacion () 
	{
		return (String)get_Value(COLUMNNAME_ProductosFertilizacion);
	}

	/** Set PrPiso.
		@param PrPiso PrPiso	  */
	public void setPrPiso (String PrPiso)
	{
		set_Value (COLUMNNAME_PrPiso, PrPiso);
	}

	/** Get PrPiso.
		@return PrPiso	  */
	public String getPrPiso () 
	{
		return (String)get_Value(COLUMNNAME_PrPiso);
	}

	/** Set PrPisoPts.
		@param PrPisoPts PrPisoPts	  */
	public void setPrPisoPts (BigDecimal PrPisoPts)
	{
		set_Value (COLUMNNAME_PrPisoPts, PrPisoPts);
	}

	/** Get PrPisoPts.
		@return PrPisoPts	  */
	public BigDecimal getPrPisoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PrPisoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PrTecho.
		@param PrTecho PrTecho	  */
	public void setPrTecho (String PrTecho)
	{
		set_Value (COLUMNNAME_PrTecho, PrTecho);
	}

	/** Get PrTecho.
		@return PrTecho	  */
	public String getPrTecho () 
	{
		return (String)get_Value(COLUMNNAME_PrTecho);
	}

	/** Set PrTechoPts.
		@param PrTechoPts PrTechoPts	  */
	public void setPrTechoPts (BigDecimal PrTechoPts)
	{
		set_Value (COLUMNNAME_PrTechoPts, PrTechoPts);
	}

	/** Get PrTechoPts.
		@return PrTechoPts	  */
	public BigDecimal getPrTechoPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PrTechoPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PuntajeAgricola.
		@param PuntajeAgricola PuntajeAgricola	  */
	public void setPuntajeAgricola (BigDecimal PuntajeAgricola)
	{
		set_Value (COLUMNNAME_PuntajeAgricola, PuntajeAgricola);
	}

	/** Get PuntajeAgricola.
		@return PuntajeAgricola	  */
	public BigDecimal getPuntajeAgricola () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PuntajeAgricola);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PuntajeEquipos.
		@param PuntajeEquipos PuntajeEquipos	  */
	public void setPuntajeEquipos (BigDecimal PuntajeEquipos)
	{
		set_Value (COLUMNNAME_PuntajeEquipos, PuntajeEquipos);
	}

	/** Get PuntajeEquipos.
		@return PuntajeEquipos	  */
	public BigDecimal getPuntajeEquipos () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PuntajeEquipos);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PuntajeGlobal.
		@param PuntajeGlobal PuntajeGlobal	  */
	public void setPuntajeGlobal (BigDecimal PuntajeGlobal)
	{
		set_Value (COLUMNNAME_PuntajeGlobal, PuntajeGlobal);
	}

	/** Get PuntajeGlobal.
		@return PuntajeGlobal	  */
	public BigDecimal getPuntajeGlobal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PuntajeGlobal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PuntajeHigiene.
		@param PuntajeHigiene PuntajeHigiene	  */
	public void setPuntajeHigiene (BigDecimal PuntajeHigiene)
	{
		set_Value (COLUMNNAME_PuntajeHigiene, PuntajeHigiene);
	}

	/** Get PuntajeHigiene.
		@return PuntajeHigiene	  */
	public BigDecimal getPuntajeHigiene () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PuntajeHigiene);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PuntajeInfraestructura.
		@param PuntajeInfraestructura PuntajeInfraestructura	  */
	public void setPuntajeInfraestructura (BigDecimal PuntajeInfraestructura)
	{
		set_Value (COLUMNNAME_PuntajeInfraestructura, PuntajeInfraestructura);
	}

	/** Get PuntajeInfraestructura.
		@return PuntajeInfraestructura	  */
	public BigDecimal getPuntajeInfraestructura () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PuntajeInfraestructura);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PuntajePostcosecha.
		@param PuntajePostcosecha PuntajePostcosecha	  */
	public void setPuntajePostcosecha (BigDecimal PuntajePostcosecha)
	{
		set_Value (COLUMNNAME_PuntajePostcosecha, PuntajePostcosecha);
	}

	/** Get PuntajePostcosecha.
		@return PuntajePostcosecha	  */
	public BigDecimal getPuntajePostcosecha () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PuntajePostcosecha);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set RawKoboJSON.
		@param RawKoboJSON RawKoboJSON	  */
	public void setRawKoboJSON (String RawKoboJSON)
	{
		set_Value (COLUMNNAME_RawKoboJSON, RawKoboJSON);
	}

	/** Get RawKoboJSON.
		@return RawKoboJSON	  */
	public String getRawKoboJSON () 
	{
		return (String)get_Value(COLUMNNAME_RawKoboJSON);
	}

	/** Set Recomendaciones.
		@param Recomendaciones Recomendaciones	  */
	public void setRecomendaciones (String Recomendaciones)
	{
		set_Value (COLUMNNAME_Recomendaciones, Recomendaciones);
	}

	/** Get Recomendaciones.
		@return Recomendaciones	  */
	public String getRecomendaciones () 
	{
		return (String)get_Value(COLUMNNAME_Recomendaciones);
	}

	/** Set Semana.
		@param Semana Semana	  */
	public void setSemana (int Semana)
	{
		set_Value (COLUMNNAME_Semana, Integer.valueOf(Semana));
	}

	/** Get Semana.
		@return Semana	  */
	public int getSemana () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Semana);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TecnicoResponsable.
		@param TecnicoResponsable TecnicoResponsable	  */
	public void setTecnicoResponsable (String TecnicoResponsable)
	{
		set_Value (COLUMNNAME_TecnicoResponsable, TecnicoResponsable);
	}

	/** Get TecnicoResponsable.
		@return TecnicoResponsable	  */
	public String getTecnicoResponsable () 
	{
		return (String)get_Value(COLUMNNAME_TecnicoResponsable);
	}

	/** Set TipoPlanFertilizacion.
		@param TipoPlanFertilizacion TipoPlanFertilizacion	  */
	public void setTipoPlanFertilizacion (String TipoPlanFertilizacion)
	{
		set_Value (COLUMNNAME_TipoPlanFertilizacion, TipoPlanFertilizacion);
	}

	/** Get TipoPlanFertilizacion.
		@return TipoPlanFertilizacion	  */
	public String getTipoPlanFertilizacion () 
	{
		return (String)get_Value(COLUMNNAME_TipoPlanFertilizacion);
	}

	/** Set TipoVisita.
		@param TipoVisita TipoVisita	  */
	public void setTipoVisita (String TipoVisita)
	{
		set_Value (COLUMNNAME_TipoVisita, TipoVisita);
	}

	/** Get TipoVisita.
		@return TipoVisita	  */
	public String getTipoVisita () 
	{
		return (String)get_Value(COLUMNNAME_TipoVisita);
	}

	/** Set TotalNoConformidades.
		@param TotalNoConformidades TotalNoConformidades	  */
	public void setTotalNoConformidades (BigDecimal TotalNoConformidades)
	{
		set_Value (COLUMNNAME_TotalNoConformidades, TotalNoConformidades);
	}

	/** Get TotalNoConformidades.
		@return TotalNoConformidades	  */
	public BigDecimal getTotalNoConformidades () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalNoConformidades);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set UbicacionAltitud.
		@param UbicacionAltitud UbicacionAltitud	  */
	public void setUbicacionAltitud (BigDecimal UbicacionAltitud)
	{
		set_Value (COLUMNNAME_UbicacionAltitud, UbicacionAltitud);
	}

	/** Get UbicacionAltitud.
		@return UbicacionAltitud	  */
	public BigDecimal getUbicacionAltitud () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_UbicacionAltitud);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set UbicacionLatitud.
		@param UbicacionLatitud UbicacionLatitud	  */
	public void setUbicacionLatitud (BigDecimal UbicacionLatitud)
	{
		set_Value (COLUMNNAME_UbicacionLatitud, UbicacionLatitud);
	}

	/** Get UbicacionLatitud.
		@return UbicacionLatitud	  */
	public BigDecimal getUbicacionLatitud () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_UbicacionLatitud);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set UbicacionLongitud.
		@param UbicacionLongitud UbicacionLongitud	  */
	public void setUbicacionLongitud (BigDecimal UbicacionLongitud)
	{
		set_Value (COLUMNNAME_UbicacionLongitud, UbicacionLongitud);
	}

	/** Get UbicacionLongitud.
		@return UbicacionLongitud	  */
	public BigDecimal getUbicacionLongitud () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_UbicacionLongitud);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set UbicacionPrecision.
		@param UbicacionPrecision UbicacionPrecision	  */
	public void setUbicacionPrecision (BigDecimal UbicacionPrecision)
	{
		set_Value (COLUMNNAME_UbicacionPrecision, UbicacionPrecision);
	}

	/** Get UbicacionPrecision.
		@return UbicacionPrecision	  */
	public BigDecimal getUbicacionPrecision () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_UbicacionPrecision);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set UsuarioApp.
		@param UsuarioApp UsuarioApp	  */
	public void setUsuarioApp (String UsuarioApp)
	{
		set_Value (COLUMNNAME_UsuarioApp, UsuarioApp);
	}

	/** Get UsuarioApp.
		@return UsuarioApp	  */
	public String getUsuarioApp () 
	{
		return (String)get_Value(COLUMNNAME_UsuarioApp);
	}

	/** Set ZmBordeRetencion.
		@param ZmBordeRetencion ZmBordeRetencion	  */
	public void setZmBordeRetencion (String ZmBordeRetencion)
	{
		set_Value (COLUMNNAME_ZmBordeRetencion, ZmBordeRetencion);
	}

	/** Get ZmBordeRetencion.
		@return ZmBordeRetencion	  */
	public String getZmBordeRetencion () 
	{
		return (String)get_Value(COLUMNNAME_ZmBordeRetencion);
	}

	/** Set ZmBordeRetencionPts.
		@param ZmBordeRetencionPts ZmBordeRetencionPts	  */
	public void setZmBordeRetencionPts (BigDecimal ZmBordeRetencionPts)
	{
		set_Value (COLUMNNAME_ZmBordeRetencionPts, ZmBordeRetencionPts);
	}

	/** Get ZmBordeRetencionPts.
		@return ZmBordeRetencionPts	  */
	public BigDecimal getZmBordeRetencionPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ZmBordeRetencionPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ZmDuchaLavaojos.
		@param ZmDuchaLavaojos ZmDuchaLavaojos	  */
	public void setZmDuchaLavaojos (String ZmDuchaLavaojos)
	{
		set_Value (COLUMNNAME_ZmDuchaLavaojos, ZmDuchaLavaojos);
	}

	/** Get ZmDuchaLavaojos.
		@return ZmDuchaLavaojos	  */
	public String getZmDuchaLavaojos () 
	{
		return (String)get_Value(COLUMNNAME_ZmDuchaLavaojos);
	}

	/** Set ZmDuchaLavaojosPts.
		@param ZmDuchaLavaojosPts ZmDuchaLavaojosPts	  */
	public void setZmDuchaLavaojosPts (BigDecimal ZmDuchaLavaojosPts)
	{
		set_Value (COLUMNNAME_ZmDuchaLavaojosPts, ZmDuchaLavaojosPts);
	}

	/** Get ZmDuchaLavaojosPts.
		@return ZmDuchaLavaojosPts	  */
	public BigDecimal getZmDuchaLavaojosPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ZmDuchaLavaojosPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ZmFosaDescontaminacion.
		@param ZmFosaDescontaminacion ZmFosaDescontaminacion	  */
	public void setZmFosaDescontaminacion (String ZmFosaDescontaminacion)
	{
		set_Value (COLUMNNAME_ZmFosaDescontaminacion, ZmFosaDescontaminacion);
	}

	/** Get ZmFosaDescontaminacion.
		@return ZmFosaDescontaminacion	  */
	public String getZmFosaDescontaminacion () 
	{
		return (String)get_Value(COLUMNNAME_ZmFosaDescontaminacion);
	}

	/** Set ZmFosaDescontaminacionPts.
		@param ZmFosaDescontaminacionPts ZmFosaDescontaminacionPts	  */
	public void setZmFosaDescontaminacionPts (BigDecimal ZmFosaDescontaminacionPts)
	{
		set_Value (COLUMNNAME_ZmFosaDescontaminacionPts, ZmFosaDescontaminacionPts);
	}

	/** Get ZmFosaDescontaminacionPts.
		@return ZmFosaDescontaminacionPts	  */
	public BigDecimal getZmFosaDescontaminacionPts () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ZmFosaDescontaminacionPts);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}