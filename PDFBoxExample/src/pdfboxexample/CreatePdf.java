package pdfboxexample;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class CreatePdf {
	
	public static void main(String[] args) throws IOException{
		PDDocument pdfdoc = new PDDocument();
		pdfdoc.addPage(new PDPage());
		
		pdfdoc.save("C:\\Users\\carlo\\OneDrive\\Documentos\\Sample.pdf");
		
		System.out.println("PDF criado!");
		
		pdfdoc.close();
	}

}
