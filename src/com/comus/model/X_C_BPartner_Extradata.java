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
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for C_BPartner_Extradata
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_C_BPartner_Extradata extends PO implements I_C_BPartner_Extradata, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260711L;

    /** Standard Constructor */
    public X_C_BPartner_Extradata (Properties ctx, int C_BPartner_Extradata_ID, String trxName)
    {
      super (ctx, C_BPartner_Extradata_ID, trxName);
      /** if (C_BPartner_Extradata_ID == 0)
        {
			setC_BPartner_Extradata_ID (0);
			setC_BPartner_ID (0);
			setGender (null);
			setIsAsistenciaCertificacion (false);
// N
			setIsAsistenciaFinanciera (false);
// N
			setIsAsistenciaTecnica (false);
// N
			setIsCertificadoAmbiental (false);
// N
			setIsCertificadoSostenible (false);
// N
			setIsMateriaPrimaCertificada (false);
// N
			setIsNationalVendor (true);
// Y
			setIsNaturalPerson (true);
// Y
			setIsVulnerable (false);
// N
			setKmToEnterprise (Env.ZERO);
// 0
        } */
    }

    /** Load Constructor */
    public X_C_BPartner_Extradata (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_BPartner_Extradata[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Grande (Mayor 5 ha) = G */
	public static final String BPARTNERSIZE_GrandeMayor5Ha = "G";
	/** Medio (3,5 - 4,99 ha) = M */
	public static final String BPARTNERSIZE_Medio35_499Ha = "M";
	/** Pequeño (menor 3 ha) = P */
	public static final String BPARTNERSIZE_PequeñoMenor3Ha = "P";
	/** Set BPartner Size.
		@param BPartnerSize BPartner Size	  */
	public void setBPartnerSize (String BPartnerSize)
	{

		set_Value (COLUMNNAME_BPartnerSize, BPartnerSize);
	}

	/** Get BPartner Size.
		@return BPartner Size	  */
	public String getBPartnerSize () 
	{
		return (String)get_Value(COLUMNNAME_BPartnerSize);
	}

	/** Set Partner Extradata.
		@param C_BPartner_Extradata_ID Partner Extradata	  */
	public void setC_BPartner_Extradata_ID (int C_BPartner_Extradata_ID)
	{
		if (C_BPartner_Extradata_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_Extradata_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_Extradata_ID, Integer.valueOf(C_BPartner_Extradata_ID));
	}

	/** Get Partner Extradata.
		@return Partner Extradata	  */
	public int getC_BPartner_Extradata_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Extradata_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_BPartner_Extradata_UU.
		@param C_BPartner_Extradata_UU C_BPartner_Extradata_UU	  */
	public void setC_BPartner_Extradata_UU (String C_BPartner_Extradata_UU)
	{
		set_ValueNoCheck (COLUMNNAME_C_BPartner_Extradata_UU, C_BPartner_Extradata_UU);
	}

	/** Get C_BPartner_Extradata_UU.
		@return C_BPartner_Extradata_UU	  */
	public String getC_BPartner_Extradata_UU () 
	{
		return (String)get_Value(COLUMNNAME_C_BPartner_Extradata_UU);
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
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
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

	/** Femenino = FE */
	public static final String GENDER_Femenino = "FE";
	/** Masculino = MA */
	public static final String GENDER_Masculino = "MA";
	/** Subrepresentado = SU */
	public static final String GENDER_Subrepresentado = "SU";
	/** Set Gender.
		@param Gender Gender	  */
	public void setGender (String Gender)
	{

		set_Value (COLUMNNAME_Gender, Gender);
	}

	/** Get Gender.
		@return Gender	  */
	public String getGender () 
	{
		return (String)get_Value(COLUMNNAME_Gender);
	}

	/** Set Asistencia Certificacion.
		@param IsAsistenciaCertificacion Asistencia Certificacion	  */
	public void setIsAsistenciaCertificacion (boolean IsAsistenciaCertificacion)
	{
		set_Value (COLUMNNAME_IsAsistenciaCertificacion, Boolean.valueOf(IsAsistenciaCertificacion));
	}

	/** Get Asistencia Certificacion.
		@return Asistencia Certificacion	  */
	public boolean isAsistenciaCertificacion () 
	{
		Object oo = get_Value(COLUMNNAME_IsAsistenciaCertificacion);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Asistencia Financiera.
		@param IsAsistenciaFinanciera Asistencia Financiera	  */
	public void setIsAsistenciaFinanciera (boolean IsAsistenciaFinanciera)
	{
		set_Value (COLUMNNAME_IsAsistenciaFinanciera, Boolean.valueOf(IsAsistenciaFinanciera));
	}

	/** Get Asistencia Financiera.
		@return Asistencia Financiera	  */
	public boolean isAsistenciaFinanciera () 
	{
		Object oo = get_Value(COLUMNNAME_IsAsistenciaFinanciera);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Asistencia Tecnica.
		@param IsAsistenciaTecnica Asistencia Tecnica	  */
	public void setIsAsistenciaTecnica (boolean IsAsistenciaTecnica)
	{
		set_Value (COLUMNNAME_IsAsistenciaTecnica, Boolean.valueOf(IsAsistenciaTecnica));
	}

	/** Get Asistencia Tecnica.
		@return Asistencia Tecnica	  */
	public boolean isAsistenciaTecnica () 
	{
		Object oo = get_Value(COLUMNNAME_IsAsistenciaTecnica);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Certificado Ambiental.
		@param IsCertificadoAmbiental Certificado Ambiental	  */
	public void setIsCertificadoAmbiental (boolean IsCertificadoAmbiental)
	{
		set_Value (COLUMNNAME_IsCertificadoAmbiental, Boolean.valueOf(IsCertificadoAmbiental));
	}

	/** Get Certificado Ambiental.
		@return Certificado Ambiental	  */
	public boolean isCertificadoAmbiental () 
	{
		Object oo = get_Value(COLUMNNAME_IsCertificadoAmbiental);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Certificado Sostenible.
		@param IsCertificadoSostenible Certificado Sostenible	  */
	public void setIsCertificadoSostenible (boolean IsCertificadoSostenible)
	{
		set_Value (COLUMNNAME_IsCertificadoSostenible, Boolean.valueOf(IsCertificadoSostenible));
	}

	/** Get Certificado Sostenible.
		@return Certificado Sostenible	  */
	public boolean isCertificadoSostenible () 
	{
		Object oo = get_Value(COLUMNNAME_IsCertificadoSostenible);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Materia Prima Certificada.
		@param IsMateriaPrimaCertificada Materia Prima Certificada	  */
	public void setIsMateriaPrimaCertificada (boolean IsMateriaPrimaCertificada)
	{
		set_Value (COLUMNNAME_IsMateriaPrimaCertificada, Boolean.valueOf(IsMateriaPrimaCertificada));
	}

	/** Get Materia Prima Certificada.
		@return Materia Prima Certificada	  */
	public boolean isMateriaPrimaCertificada () 
	{
		Object oo = get_Value(COLUMNNAME_IsMateriaPrimaCertificada);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set National Vendor.
		@param IsNationalVendor National Vendor	  */
	public void setIsNationalVendor (boolean IsNationalVendor)
	{
		set_Value (COLUMNNAME_IsNationalVendor, Boolean.valueOf(IsNationalVendor));
	}

	/** Get National Vendor.
		@return National Vendor	  */
	public boolean isNationalVendor () 
	{
		Object oo = get_Value(COLUMNNAME_IsNationalVendor);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Natural Person.
		@param IsNaturalPerson Natural Person	  */
	public void setIsNaturalPerson (boolean IsNaturalPerson)
	{
		set_Value (COLUMNNAME_IsNaturalPerson, Boolean.valueOf(IsNaturalPerson));
	}

	/** Get Natural Person.
		@return Natural Person	  */
	public boolean isNaturalPerson () 
	{
		Object oo = get_Value(COLUMNNAME_IsNaturalPerson);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Prepayment.
		@param IsPrepayment 
		The Payment/Receipt is a Prepayment
	  */
	public void setIsPrepayment (boolean IsPrepayment)
	{
		set_Value (COLUMNNAME_IsPrepayment, Boolean.valueOf(IsPrepayment));
	}

	/** Get Prepayment.
		@return The Payment/Receipt is a Prepayment
	  */
	public boolean isPrepayment () 
	{
		Object oo = get_Value(COLUMNNAME_IsPrepayment);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Vulnerable.
		@param IsVulnerable Vulnerable	  */
	public void setIsVulnerable (boolean IsVulnerable)
	{
		set_Value (COLUMNNAME_IsVulnerable, Boolean.valueOf(IsVulnerable));
	}

	/** Get Vulnerable.
		@return Vulnerable	  */
	public boolean isVulnerable () 
	{
		Object oo = get_Value(COLUMNNAME_IsVulnerable);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Km To Enterprise.
		@param KmToEnterprise Km To Enterprise	  */
	public void setKmToEnterprise (BigDecimal KmToEnterprise)
	{
		set_Value (COLUMNNAME_KmToEnterprise, KmToEnterprise);
	}

	/** Get Km To Enterprise.
		@return Km To Enterprise	  */
	public BigDecimal getKmToEnterprise () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KmToEnterprise);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Kobo Submission ID.
		@param KoboSubmissionID Kobo Submission ID	  */
	public void setKoboSubmissionID (String KoboSubmissionID)
	{
		set_Value (COLUMNNAME_KoboSubmissionID, KoboSubmissionID);
	}

	/** Get Kobo Submission ID.
		@return Kobo Submission ID	  */
	public String getKoboSubmissionID ()
	{
		return (String)get_Value(COLUMNNAME_KoboSubmissionID);
	}

	public org.compiere.model.I_M_PartType getM_PartType() throws RuntimeException
    {
		return (org.compiere.model.I_M_PartType)MTable.get(getCtx(), org.compiere.model.I_M_PartType.Table_Name)
			.getPO(getM_PartType_ID(), get_TrxName());	}

	/** Set Part Type.
		@param M_PartType_ID Part Type	  */
	public void setM_PartType_ID (int M_PartType_ID)
	{
		if (M_PartType_ID < 1) 
			set_Value (COLUMNNAME_M_PartType_ID, null);
		else 
			set_Value (COLUMNNAME_M_PartType_ID, Integer.valueOf(M_PartType_ID));
	}

	/** Get Part Type.
		@return Part Type	  */
	public int getM_PartType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_PartType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Bananito = BA */
	public static final String PRODUCTTYPEAGR_Bananito = "BA";
	/** Exotica = EX */
	public static final String PRODUCTTYPEAGR_Exotica = "EX";
	/** No Aplica = NA */
	public static final String PRODUCTTYPEAGR_NoAplica = "NA";
	/** Pitahaya Palora = PP */
	public static final String PRODUCTTYPEAGR_PitahayaPalora = "PP";
	/** Set Product Type Agricultural.
		@param ProductTypeAgr Product Type Agricultural	  */
	public void setProductTypeAgr (String ProductTypeAgr)
	{

		set_Value (COLUMNNAME_ProductTypeAgr, ProductTypeAgr);
	}

	/** Get Product Type Agricultural.
		@return Product Type Agricultural	  */
	public String getProductTypeAgr () 
	{
		return (String)get_Value(COLUMNNAME_ProductTypeAgr);
	}

	/** Set Qty Ha Size.
		@param QtyHaSize Qty Ha Size	  */
	public void setQtyHaSize (BigDecimal QtyHaSize)
	{
		set_Value (COLUMNNAME_QtyHaSize, QtyHaSize);
	}

	/** Get Qty Ha Size.
		@return Qty Ha Size	  */
	public BigDecimal getQtyHaSize () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyHaSize);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}