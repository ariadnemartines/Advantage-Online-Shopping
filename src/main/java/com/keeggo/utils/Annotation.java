package com.keeggo.utils;

import java.io.File;
import com.itextpdf.text.Document;
import com.keeggo.relatorio.CriaPDF;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Annotation {

	@Before
	public void before(Scenario scenario) throws Exception {
		DriverMobile.configAndroidDriverObject();
	}

	@After
	public void after(Scenario scenario) throws Exception {
		File dir = new File(System.getProperty("user.dir") + "\\Evidencias");
		dir.mkdirs();
		Document doc = CriaPDF.CriaPDFs(dir, scenario.getName() + ".pdf");
		doc.open();
		CriaPDF.addCabecalhoPDF(doc, scenario.getName());
		doc.close();
		DriverMobile.close();
	}

}
