package com.keeggo.relatorio;

import java.io.File;
import com.itextpdf.text.Document;

public class Principal {

	public static void main(String[] args) throws Throwable {
		File dir = new File("C:\\Users\\ariadne.santos\\Desktop\\Evidencias");
		dir.mkdirs();
		
		Document doc = CriaPDF.CriaPDFs(dir, "teste.pdf");
		doc.open();
		CriaPDF.addCabecalhoPDF(doc, "");
		
		doc.close();
		
		System.exit(0);
		
	}
	
	
	
}
