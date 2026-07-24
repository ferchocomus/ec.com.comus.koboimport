package com.comus.component;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

import com.comus.model.I_C_BPartner_Extradata;
import com.comus.model.X_C_BPartner_Extradata;
import com.comus.model.I_COMUS_TechnicalVisit;
import com.comus.model.X_COMUS_TechnicalVisit;

public class ModelFactory implements IModelFactory {

	@Override
	public Class<?> getClass(String tableName) {

		if (I_C_BPartner_Extradata.Table_Name.equals(tableName))
			return X_C_BPartner_Extradata.class;
		if (I_COMUS_TechnicalVisit.Table_Name.equals(tableName))
			return X_COMUS_TechnicalVisit.class;
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {

		if (I_C_BPartner_Extradata.Table_Name.equals(tableName))
			return new X_C_BPartner_Extradata(Env.getCtx(), Record_ID, trxName);
		if (I_COMUS_TechnicalVisit.Table_Name.equals(tableName))
			return new X_COMUS_TechnicalVisit(Env.getCtx(), Record_ID, trxName);
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {

		if (I_C_BPartner_Extradata.Table_Name.equals(tableName))
			return new X_C_BPartner_Extradata(Env.getCtx(), rs, trxName);
		if (I_COMUS_TechnicalVisit.Table_Name.equals(tableName))
			return new X_COMUS_TechnicalVisit(Env.getCtx(), rs, trxName);
		return null;
	}
}
