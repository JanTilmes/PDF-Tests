package data;

import java.io.File;
import java.net.URL;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class TestPDF {

	public static void main(String[] args) {
		File file = new File("src/pdfs/BEFUNDSCHEIN.pdf");
		PDDocument document = null;
		try {
			document = PDDocument.load(file);
			PDPage page1 = document.getPage(0);
			
			PDPageContentStream contentStream = new PDPageContentStream(document, page1, PDPageContentStream.AppendMode.APPEND, false);
			
			contentStream.setFont(PDType1Font.HELVETICA, 11);
			
			//Branchenscheinnr. schreiben
			 contentStream.beginText();
			  contentStream.newLineAtOffset(483,664);
			  contentStream.showText("123456");
			  contentStream.endText();
			  contentStream.close();

			document.save("../test.pdf");
			System.out.println("PDF erstellt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				document.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}