package com.keeggo.core;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.keeggo.core.relatorio.CriaPDF;

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
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat formatter2 = new SimpleDateFormat("HH-mm-ss");
		
		File dir = new File(System.getProperty("user.dir") + "\\Evidencias\\" + formatter.format(date));
		dir.mkdirs();
		Document doc = CriaPDF.CriaPDFs(dir, scenario.getName() + " " + formatter2.format(date) + ".pdf");
		doc.open();
		CriaPDF.addCabecalhoPDF(doc, scenario.getName(), date);
		CriaPDF.insereImagens(doc, Utils.getEvidences());		
		doc.close();
		DriverMobile.close();
	}

}
