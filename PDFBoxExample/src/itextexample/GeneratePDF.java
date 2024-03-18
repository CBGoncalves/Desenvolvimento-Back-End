package itextexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDF {

	public static void main(String[] args) {
		Document doc = new Document();
		try {

			PdfWriter writer = PdfWriter.getInstance(doc,
					new FileOutputStream("C:\\Users\\carlo\\OneDrive\\Documentos\\Test.pdf"));
			System.out.println("PDF criado!");

			doc.open();

			doc.add(new Paragraph("If you're offered a seat on a rocket ship, don't ask what seat! Just get on."));
			doc.addAuthor("Carlos");  
			doc.addCreationDate();  
			doc.addCreator("skymaster.com");  
			doc.addTitle("Setting Attribute");  
			doc.addSubject("Setting attributes to the PDF files.");

			doc.close();

			writer.close();

		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
