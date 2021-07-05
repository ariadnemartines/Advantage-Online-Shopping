package com.keeggo.relatorio;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CriaPDF {

	public static Document CriaPDFs(File dir2, String fileName) throws Throwable {
		Document doc = new Document(PageSize.A4);
		FileOutputStream os = new FileOutputStream(dir2 + File.separator + fileName);
		PdfWriter.getInstance(doc, os);
		return doc;
	}

	public static void addCabecalhoPDF(Document doc, String nomeCT) throws DocumentException, InterruptedException {
		Font bold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

		String usuarioLogado;
		usuarioLogado = System.getProperty("user.name");

		Font alteraFonte = new com.itextpdf.text.Font(FontFamily.COURIER, 12, Font.BOLD);
		alteraFonte.setColor(BaseColor.BLACK);

		PdfPTable tableheader = new PdfPTable(new float[] { 0.15f, 0.35f, 0.13f, 0.37f });

		PdfPCell header = new PdfPCell(new Paragraph("Evidências de Teste ", alteraFonte));
		header.setUseBorderPadding(true);
		header.setBorderColor(BaseColor.BLACK);
		header.setHorizontalAlignment(Element.ALIGN_CENTER);
		header.setColspan(4);
		tableheader.setSpacingBefore(20);

		tableheader.addCell(header);

		PdfPCell lblSistema = new PdfPCell(new Paragraph("Sistema"));
		PdfPCell txtSistema = new PdfPCell(new Paragraph("Advantage Online Shopping"));
		// PdfPCell lblVersao = new PdfPCell(new Paragraph("Versão"));
		// PdfPCell txtVersao = new PdfPCell(new Paragraph("V1"));
		PdfPCell lblCT = new PdfPCell(new Paragraph("CT"));
		PdfPCell txtCT = new PdfPCell(new Paragraph("Exemplo caso de teste"));
		PdfPCell lblExecutor = new PdfPCell(new Paragraph("Executor"));
		PdfPCell txtExecutor = new PdfPCell(new Paragraph(usuarioLogado));
		PdfPCell lblData = new PdfPCell(new Paragraph("Data"));

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		PdfPCell txtData = new PdfPCell(new Paragraph(formatter.format(date)));

		lblSistema.setBorderColor(BaseColor.BLACK);
		lblSistema.setHorizontalAlignment(Element.ALIGN_TOP);
		txtSistema.setBorderColor(BaseColor.BLACK);

		lblCT.setBorderColor(BaseColor.BLACK);
		lblCT.setHorizontalAlignment(Element.ALIGN_TOP);
		txtCT.setBorderColor(BaseColor.BLACK);

		lblExecutor.setBorderColor(BaseColor.BLACK);
		lblExecutor.setHorizontalAlignment(Element.ALIGN_TOP);
		txtExecutor.setBorderColor(BaseColor.BLACK);

		lblData.setBorderColor(BaseColor.BLACK);
		lblData.setHorizontalAlignment(Element.ALIGN_TOP);
		txtData.setBorderColor(BaseColor.BLACK);

		txtCT.setColspan(3);

		tableheader.addCell(lblSistema);
		tableheader.addCell(txtSistema);
		tableheader.addCell(lblCT);
		tableheader.addCell(txtCT);
		tableheader.addCell(lblExecutor);
		tableheader.addCell(txtExecutor);
		tableheader.addCell(lblData);
		tableheader.addCell(txtData);

		tableheader.setSpacingAfter(20);

		doc.add(tableheader);
	}
}
