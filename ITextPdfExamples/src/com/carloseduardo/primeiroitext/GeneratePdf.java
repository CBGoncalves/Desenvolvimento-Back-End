package com.carloseduardo.primeiroitext;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePdf {
	
	public static void main(String[] args) throws IOException{
		
		String file_name = "C:\\Users\\carlo\\OneDrive\\Documentos\\Test.pdf";
		Document doc = new Document();
		
		try {
			PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(file_name));
			
			doc.open();
			
			Image logo = Image.getInstance("C:\\Users\\carlo\\OneDrive\\Imagens\\logo_sky2.jpg");
			logo.scalePercent(20);
			
			doc.add(logo);
			
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			
			doc.add(new Paragraph("Testando biblioteca ITextPDF em Java"));
			
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			
			PdfPTable table = new PdfPTable(3);
			
			PdfPCell c1 = new PdfPCell(new Phrase("Coluna 1"));
			table.addCell(c1);
			
			c1 = new PdfPCell(new Phrase("Coluna 2"));
			table.addCell(c1);
			
			c1 = new PdfPCell(new Phrase("Coluna 3"));
			table.addCell(c1);
			
			table.setHeaderRows(1);
			
			table.addCell("1.0");
			table.addCell("1.1");
			table.addCell("1.2");
			table.addCell("2.1");
			table.addCell("2.2");
			table.addCell("2.3");
			
			doc.add(table);
			
			doc.close();
			writer.close();
			
			System.out.println("PDF criado!");
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
