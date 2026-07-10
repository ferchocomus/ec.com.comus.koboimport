package com.comus.component;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

import com.comus.process.ImportKoboSubmissions;

public class ProcessFactory implements IProcessFactory {

	@Override
	public ProcessCall newProcessInstance(String className) {

		if (ImportKoboSubmissions.class.getName().equals(className))
			return new ImportKoboSubmissions();
		return null;
	}
}
