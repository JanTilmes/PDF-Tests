package data;

import java.awt.Color;
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
			
			
			
			/*
			 * 
			 * Seite 1
			 * 
			 */
			
			
			PDPage page1 = document.getPage(0);

			// Branchenscheinnummer Seite 1
			PDPageContentStream billNr = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			billNr.setFont(PDType1Font.HELVETICA, 9);
			billNr.setNonStrokingColor(Color.RED);
			billNr.beginText();
			billNr.newLineAtOffset(476, 666);
			billNr.showText("123456");
			billNr.endText();
			billNr.close();
			
			//Verischerungsnehmer Firma 
			PDPageContentStream policyHolderFirm = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			policyHolderFirm.setFont(PDType1Font.HELVETICA, 9);
			policyHolderFirm.setNonStrokingColor(Color.RED);
			policyHolderFirm.beginText();
			policyHolderFirm.newLineAtOffset(60, 615);
			policyHolderFirm.showText("Firma");
			policyHolderFirm.endText();
			policyHolderFirm.close();
			
			//Verischerungsnehmer Straße
			PDPageContentStream policyHolderStreet = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			policyHolderStreet.setFont(PDType1Font.HELVETICA, 9);
			policyHolderStreet.setNonStrokingColor(Color.RED);
			policyHolderStreet.beginText();
			policyHolderStreet.newLineAtOffset(60, 600);
			policyHolderStreet.showText("Straße 1");
			policyHolderStreet.endText();
			policyHolderStreet.close();
			
			//Verischerungsnehmer PLZ
			PDPageContentStream policyHolderZIP = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			policyHolderZIP.setFont(PDType1Font.HELVETICA, 9);
			policyHolderZIP.setNonStrokingColor(Color.RED);
			policyHolderZIP.beginText();
			policyHolderZIP.newLineAtOffset(60, 585);
			policyHolderZIP.showText("55555");
			policyHolderZIP.endText();
			policyHolderZIP.close();
			
			//Verischerungsnehmer Stadt
			PDPageContentStream policyHolderCity = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			policyHolderCity.setFont(PDType1Font.HELVETICA, 9);
			policyHolderCity.setNonStrokingColor(Color.RED);
			policyHolderCity.beginText();
			policyHolderCity.newLineAtOffset(94, 585);
			policyHolderCity.showText("PDF-Hausen");
			policyHolderCity.endText();
			policyHolderCity.close();
			
			//Risikoadresse Straße
			PDPageContentStream riskAdressStreet = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			riskAdressStreet.setFont(PDType1Font.HELVETICA, 9);
			riskAdressStreet.setNonStrokingColor(Color.RED);
			riskAdressStreet.beginText();
			riskAdressStreet.newLineAtOffset(405, 643);
			riskAdressStreet.showText("Risikoadresse Straße");
			riskAdressStreet.endText();
			riskAdressStreet.close();
			
			//Risikoadresse Stadt
			PDPageContentStream riskAdressCity = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			riskAdressCity.setFont(PDType1Font.HELVETICA, 9);
			riskAdressCity.setNonStrokingColor(Color.RED);
			riskAdressCity.beginText();
			riskAdressCity.newLineAtOffset(405, 630);
			riskAdressCity.showText("Risikoadresse Stadt");
			riskAdressCity.endText();
			riskAdressCity.close();
			
			
			//Risikoadresse Begleiter
			PDPageContentStream riskAdressCompanion = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			riskAdressCompanion.setFont(PDType1Font.HELVETICA, 9);
			riskAdressCompanion.setNonStrokingColor(Color.RED);
			riskAdressCompanion.beginText();
			riskAdressCompanion.newLineAtOffset(405, 601);
			riskAdressCompanion.showText("Risikoadresse Begleiter");
			riskAdressCompanion.endText();
			riskAdressCompanion.close();
			
			//Risikoadresse Straße
			PDPageContentStream riskAdressExpert = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			riskAdressExpert.setFont(PDType1Font.HELVETICA, 9);
			riskAdressExpert.setNonStrokingColor(Color.RED);
			riskAdressExpert.beginText();
			riskAdressExpert.newLineAtOffset(405, 585);
			riskAdressExpert.showText("Risikoadresse Sachverstädndiger");
			riskAdressExpert.endText();
			riskAdressExpert.close();
			
			//Risikoadresse VdS-Nr.
			PDPageContentStream riskAdressNr = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			riskAdressNr.setFont(PDType1Font.HELVETICA, 9);
			riskAdressNr.setNonStrokingColor(Color.RED);
			riskAdressNr.beginText();
			riskAdressNr.newLineAtOffset(405, 571);
			riskAdressNr.showText("Risikoadresse VdS-Nr.");
			riskAdressNr.endText();
			riskAdressNr.close();
			
			//Risikoadresse VdS-Nr.
			PDPageContentStream riskAdressDate = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			riskAdressDate.setFont(PDType1Font.HELVETICA, 9);
			riskAdressDate.setNonStrokingColor(Color.RED);
			riskAdressDate.beginText();
			riskAdressDate.newLineAtOffset(405, 556);
			riskAdressDate.showText("Risikoadresse Datum");
			riskAdressDate.endText();
			riskAdressDate.close();
			
			//Risikoadresse Dauer
			PDPageContentStream riskAdressDuration = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			riskAdressDuration.setFont(PDType1Font.HELVETICA, 9);
			riskAdressDuration.setNonStrokingColor(Color.RED);
			riskAdressDuration.beginText();
			riskAdressDuration.newLineAtOffset(405, 541);
			riskAdressDuration.showText("Dauer");
			riskAdressDuration.endText();
			riskAdressDuration.close();
			
			
			/*
			 * Frequenzgesteuerte JA
			 */
			PDPageContentStream frequenzgesteuerteBetriebsmittelJA = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			frequenzgesteuerteBetriebsmittelJA.setFont(PDType1Font.HELVETICA, 9);
			frequenzgesteuerteBetriebsmittelJA.setNonStrokingColor(Color.RED);
			frequenzgesteuerteBetriebsmittelJA.beginText();
			frequenzgesteuerteBetriebsmittelJA.newLineAtOffset(452.5f, 491.2f);
			frequenzgesteuerteBetriebsmittelJA.showText("X");
			frequenzgesteuerteBetriebsmittelJA.endText();
			frequenzgesteuerteBetriebsmittelJA.close();
			
			/*
			 * Frequenzgesteuerte Nein
			 */
			PDPageContentStream frequenzgesteuerteBetriebsmittelNEIN = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			frequenzgesteuerteBetriebsmittelNEIN.setFont(PDType1Font.HELVETICA, 9);
			frequenzgesteuerteBetriebsmittelNEIN.setNonStrokingColor(Color.RED);
			frequenzgesteuerteBetriebsmittelNEIN.beginText();
			frequenzgesteuerteBetriebsmittelNEIN.newLineAtOffset(495f, 491.2f);
			frequenzgesteuerteBetriebsmittelNEIN.showText("X");
			frequenzgesteuerteBetriebsmittelNEIN.endText();
			frequenzgesteuerteBetriebsmittelNEIN.close();
			
			
			/*
			 * Besondere Schutzmaßnahmen JA
			 */
			PDPageContentStream besondereSchutzmaßnahmenJA = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			besondereSchutzmaßnahmenJA.setFont(PDType1Font.HELVETICA, 9);
			besondereSchutzmaßnahmenJA.setNonStrokingColor(Color.RED);
			besondereSchutzmaßnahmenJA.beginText();
			besondereSchutzmaßnahmenJA.newLineAtOffset(452.5f, 475.8f);
			besondereSchutzmaßnahmenJA.showText("X");
			besondereSchutzmaßnahmenJA.endText();
			besondereSchutzmaßnahmenJA.close();

			/*
			 * Besondere Schutzmaßnahmen NEIN
			 */
			PDPageContentStream besondereSchutzmaßnahmenNEIN = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			besondereSchutzmaßnahmenNEIN.setFont(PDType1Font.HELVETICA, 9);
			besondereSchutzmaßnahmenNEIN.setNonStrokingColor(Color.RED);
			besondereSchutzmaßnahmenNEIN.beginText();
			besondereSchutzmaßnahmenNEIN.newLineAtOffset(495f, 475.8f);
			besondereSchutzmaßnahmenNEIN.showText("X");
			besondereSchutzmaßnahmenNEIN.endText();
			besondereSchutzmaßnahmenNEIN.close();
			
			/*
			 * Besondere Schutzmaßnahmen Text
			 */
			PDPageContentStream besondereSchutzmaßnahmenText = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			besondereSchutzmaßnahmenText.setFont(PDType1Font.HELVETICA, 9);
			besondereSchutzmaßnahmenText.setNonStrokingColor(Color.RED);
			besondereSchutzmaßnahmenText.beginText();
			besondereSchutzmaßnahmenText.newLineAtOffset(128, 462);
			besondereSchutzmaßnahmenText.showText("Besondere Schutzmaßnahmen Text");
			besondereSchutzmaßnahmenText.endText();
			besondereSchutzmaßnahmenText.close();
			
			
			/*
			 * Alle Bereiche geprüft JA
			 */
			PDPageContentStream alleBereicheGeprüftJA = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			alleBereicheGeprüftJA.setFont(PDType1Font.HELVETICA, 9);
			alleBereicheGeprüftJA.setNonStrokingColor(Color.RED);
			alleBereicheGeprüftJA.beginText();
			alleBereicheGeprüftJA.newLineAtOffset(197.38f, 422.25f);
			alleBereicheGeprüftJA.showText("X");
			alleBereicheGeprüftJA.endText();
			alleBereicheGeprüftJA.close();
			
			/*
			 * Alle Bereiche geprüft NEIN
			 */
			PDPageContentStream alleBereicheGeprüftNEIN = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			alleBereicheGeprüftNEIN.setFont(PDType1Font.HELVETICA, 9);
			alleBereicheGeprüftNEIN.setNonStrokingColor(Color.RED);
			alleBereicheGeprüftNEIN.beginText();
			alleBereicheGeprüftNEIN.newLineAtOffset(232.9f, 422.25f);
			alleBereicheGeprüftNEIN.showText("X");
			alleBereicheGeprüftNEIN.endText();
			alleBereicheGeprüftNEIN.close();
			
			/*
			 * Alle Bereiche geprüft Datum
			 */
			PDPageContentStream alleBereicheGeprüftDatum = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			alleBereicheGeprüftDatum.setFont(PDType1Font.HELVETICA, 6);
			alleBereicheGeprüftDatum.setNonStrokingColor(Color.RED);
			alleBereicheGeprüftDatum.beginText();
			alleBereicheGeprüftDatum.newLineAtOffset(458, 422.25f);
			alleBereicheGeprüftDatum.showText("01.01.2000");
			alleBereicheGeprüftDatum.endText();
			alleBereicheGeprüftDatum.close();
			
			
			/*
			 * Begründung nicht geprüfte Bereiche
			 */
			PDPageContentStream begrüdnungNichtGeprüft = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			begrüdnungNichtGeprüft.setFont(PDType1Font.HELVETICA, 9);
			begrüdnungNichtGeprüft.setNonStrokingColor(Color.RED);
			begrüdnungNichtGeprüft.beginText();
			begrüdnungNichtGeprüft.newLineAtOffset(220, 409);
			begrüdnungNichtGeprüft.showText("Begründung für nicht geprüfte Bereiche");
			begrüdnungNichtGeprüft.endText();
			begrüdnungNichtGeprüft.close();
			
			
			/*
			 * Teilbereiche erneuert Erstprüfung
			 */
			PDPageContentStream teilbereicheErneuertErstprüfung= new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			teilbereicheErneuertErstprüfung.setFont(PDType1Font.HELVETICA, 9);
			teilbereicheErneuertErstprüfung.setNonStrokingColor(Color.RED);
			teilbereicheErneuertErstprüfung.beginText();
			teilbereicheErneuertErstprüfung.newLineAtOffset(335.7f, 370.9f);
			teilbereicheErneuertErstprüfung.showText("X");
			teilbereicheErneuertErstprüfung.endText();
			teilbereicheErneuertErstprüfung.close();
			
			/*
			 * Teilbereiche erneuert Ja
			 */
			PDPageContentStream teilbereicheErneuertJA= new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			teilbereicheErneuertJA.setFont(PDType1Font.HELVETICA, 9);
			teilbereicheErneuertJA.setNonStrokingColor(Color.RED);
			teilbereicheErneuertJA.beginText();
			teilbereicheErneuertJA.newLineAtOffset(424.2f, 370.9f);
			teilbereicheErneuertJA.showText("X");
			teilbereicheErneuertJA.endText();
			teilbereicheErneuertJA.close();
			
			/*
			 * Teilbereiche erneuert Nein
			 */
			PDPageContentStream teilbereicheErneuertNEIN = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			teilbereicheErneuertNEIN.setFont(PDType1Font.HELVETICA, 9);
			teilbereicheErneuertNEIN.setNonStrokingColor(Color.RED);
			teilbereicheErneuertNEIN.beginText();
			teilbereicheErneuertNEIN.newLineAtOffset(473.8f, 370.9f);
			teilbereicheErneuertNEIN.showText("X");
			teilbereicheErneuertNEIN.endText();
			teilbereicheErneuertNEIN.close();
			
			
			/*
			 * Alle Mängel beseitigt Bericht fehlt
			 */
			PDPageContentStream mängelBeseitigtBericht = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			mängelBeseitigtBericht.setFont(PDType1Font.HELVETICA, 9);
			mängelBeseitigtBericht.setNonStrokingColor(Color.RED);
			mängelBeseitigtBericht.beginText();
			mängelBeseitigtBericht.newLineAtOffset(335.7f, 358.47f);
			mängelBeseitigtBericht.showText("X");
			mängelBeseitigtBericht.endText();
			mängelBeseitigtBericht.close();
			
			/*
			 * Alle Mängel beseitigt Ja
			 */
			PDPageContentStream mängelBeseitigtJA = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			mängelBeseitigtJA.setFont(PDType1Font.HELVETICA, 9);
			mängelBeseitigtJA.setNonStrokingColor(Color.RED);
			mängelBeseitigtJA.beginText();
			mängelBeseitigtJA.newLineAtOffset(424.2f, 358.47f);
			mängelBeseitigtJA.showText("X");
			mängelBeseitigtJA.endText();
			mängelBeseitigtJA.close();
			
			/*
			 * Alle Mängel beseitigt Nein
			 */
			PDPageContentStream mängelBeseitigtNEIN = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			mängelBeseitigtNEIN.setFont(PDType1Font.HELVETICA, 9);
			mängelBeseitigtNEIN.setNonStrokingColor(Color.RED);
			mängelBeseitigtNEIN.beginText();
			mängelBeseitigtNEIN.newLineAtOffset(473.8f, 358.47f);
			mängelBeseitigtNEIN.showText("X");
			mängelBeseitigtNEIN.endText();
			mängelBeseitigtNEIN.close();
			
			
			/*
			 * Gefährdungskategorie A
			 */
			PDPageContentStream gefährdungskategorieA = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			gefährdungskategorieA.setFont(PDType1Font.HELVETICA, 9);
			gefährdungskategorieA.setNonStrokingColor(Color.RED);
			gefährdungskategorieA.beginText();
			gefährdungskategorieA.newLineAtOffset(310f, 322f);
			gefährdungskategorieA.showText("X");
			gefährdungskategorieA.endText();
			gefährdungskategorieA.close();
			
			/*
			 * Gefährdungskategorie B
			 */
			PDPageContentStream gefährdungskategorieB = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			gefährdungskategorieB.setFont(PDType1Font.HELVETICA, 9);
			gefährdungskategorieB.setNonStrokingColor(Color.RED);
			gefährdungskategorieB.beginText();
			gefährdungskategorieB.newLineAtOffset(370.7f, 322f);
			gefährdungskategorieB.showText("X");
			gefährdungskategorieB.endText();
			gefährdungskategorieB.close();;
			
			/*
			 * Gefährdungskategorie C
			 */
			PDPageContentStream gefährdungskategorieC = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			gefährdungskategorieC.setFont(PDType1Font.HELVETICA, 9);
			gefährdungskategorieC.setNonStrokingColor(Color.RED);
			gefährdungskategorieC.beginText();
			gefährdungskategorieC.newLineAtOffset(435.7f, 322f);
			gefährdungskategorieC.showText("X");
			gefährdungskategorieC.endText();
			gefährdungskategorieC.close();
			
			/*
			 * Gefährdungskategorie D
			 */
			PDPageContentStream gefährdungskategorieD = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			gefährdungskategorieD.setFont(PDType1Font.HELVETICA, 9);
			gefährdungskategorieD.setNonStrokingColor(Color.RED);
			gefährdungskategorieD.beginText();
			gefährdungskategorieD.newLineAtOffset(501.5f, 322f);
			gefährdungskategorieD.showText("X");
			gefährdungskategorieD.endText();
			gefährdungskategorieD.close();
			
			
			/*
			 * Ergänzende Erläuterungen
			 */
			PDPageContentStream ergänzendeErläuterungen = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			ergänzendeErläuterungen.setFont(PDType1Font.HELVETICA, 9);
			ergänzendeErläuterungen.setNonStrokingColor(Color.RED);
			ergänzendeErläuterungen.beginText();
			ergänzendeErläuterungen.newLineAtOffset(169.5f, 307.8f);
			ergänzendeErläuterungen.showText("Ergänzende Erläuterungen");
			ergänzendeErläuterungen.endText();
			ergänzendeErläuterungen.close();
			
			
			
			/*
			 * Ergebnis Kein Mangel
			 */
			PDPageContentStream ergebnisKeinMangel = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			ergebnisKeinMangel.setFont(PDType1Font.HELVETICA, 9);
			ergebnisKeinMangel.setNonStrokingColor(Color.RED);
			ergebnisKeinMangel.beginText();
			ergebnisKeinMangel.newLineAtOffset(59.2f, 256.7f);
			ergebnisKeinMangel.showText("X");
			ergebnisKeinMangel.endText();
			ergebnisKeinMangel.close();
			
			
			/*
			 * Ergebnis Mangel
			 */
			PDPageContentStream ergebnisMangel = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			ergebnisMangel.setFont(PDType1Font.HELVETICA, 9);
			ergebnisMangel.setNonStrokingColor(Color.RED);
			ergebnisMangel.beginText();
			ergebnisMangel.newLineAtOffset(59.2f, 243.25f);
			ergebnisMangel.showText("X");
			ergebnisMangel.endText();
			ergebnisMangel.close();
			
			/*
			 * Ergebnis Mangel Brandgefahr
			 */
			PDPageContentStream ergebnisMangelBrandgefahr = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			ergebnisMangelBrandgefahr.setFont(PDType1Font.HELVETICA, 9);
			ergebnisMangelBrandgefahr.setNonStrokingColor(Color.RED);
			ergebnisMangelBrandgefahr.beginText();
			ergebnisMangelBrandgefahr.newLineAtOffset(59.2f, 228.2f);
			ergebnisMangelBrandgefahr.showText("X");
			ergebnisMangelBrandgefahr.endText();
			ergebnisMangelBrandgefahr.close();
			
			
			/*
			 * PDF Seiten Anzahl
			 */
			PDPageContentStream seitenAnzahl = new PDPageContentStream(document, page1,
					PDPageContentStream.AppendMode.APPEND, false);
			seitenAnzahl.setFont(PDType1Font.HELVETICA, 9);
			seitenAnzahl.setNonStrokingColor(Color.RED);
			seitenAnzahl.beginText();
			seitenAnzahl.newLineAtOffset(369, 180.65f);
			seitenAnzahl.showText("83");
			seitenAnzahl.endText();
			seitenAnzahl.close();
			
			
			
			
			/*
			 * 
			 * Seite 2
			 * 
			 */
			
			PDPage page2 = document.getPage(1);

			// Branchenscheinnr. schreiben Seite 2
			PDPageContentStream billNrPageTwo = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			billNrPageTwo.setFont(PDType1Font.HELVETICA, 9);
			billNrPageTwo.setNonStrokingColor(Color.RED);
			billNrPageTwo.beginText();
			billNrPageTwo.newLineAtOffset(462, 783.4f);
			billNrPageTwo.showText("123456");
			billNrPageTwo.endText();
			billNrPageTwo.close();
			
			
			// Isolationswiderstand Mindestens 50% Ja
			PDPageContentStream isolationswiderstandMindJA = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			isolationswiderstandMindJA.setFont(PDType1Font.HELVETICA, 9);
			isolationswiderstandMindJA.setNonStrokingColor(Color.RED);
			isolationswiderstandMindJA.beginText();
			isolationswiderstandMindJA.newLineAtOffset(354.2f, 749.7f);
			isolationswiderstandMindJA.showText("X");
			isolationswiderstandMindJA.endText();
			isolationswiderstandMindJA.close();
			
			// Isolationswiderstand Mindestens 50% Nein
			PDPageContentStream isolationswiderstandMindNEIN = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			isolationswiderstandMindNEIN.setFont(PDType1Font.HELVETICA, 9);
			isolationswiderstandMindNEIN.setNonStrokingColor(Color.RED);
			isolationswiderstandMindNEIN.beginText();
			isolationswiderstandMindNEIN.newLineAtOffset(461.5f, 749.7f);
			isolationswiderstandMindNEIN.showText("X");
			isolationswiderstandMindNEIN.endText();
			isolationswiderstandMindNEIN.close();
			
			
			/*
			 * Isolationswiderstand Messprotokolle
			 */
			PDPageContentStream isolationswiderstandMessprotokolleJA = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			isolationswiderstandMessprotokolleJA.setFont(PDType1Font.HELVETICA, 9);
			isolationswiderstandMessprotokolleJA.setNonStrokingColor(Color.RED);
			isolationswiderstandMessprotokolleJA.beginText();
			isolationswiderstandMessprotokolleJA.newLineAtOffset(354.2f, 735.4f);
			isolationswiderstandMessprotokolleJA.showText("X");
			isolationswiderstandMessprotokolleJA.endText();
			isolationswiderstandMessprotokolleJA.close();
			
			/*
			 * Isolationswiderstand Ersatz
			 */
			PDPageContentStream isolationswiderstandMessprotokolleNEIN = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			isolationswiderstandMessprotokolleNEIN.setFont(PDType1Font.HELVETICA, 9);
			isolationswiderstandMessprotokolleNEIN.setNonStrokingColor(Color.RED);
			isolationswiderstandMessprotokolleNEIN.beginText();
			isolationswiderstandMessprotokolleNEIN.newLineAtOffset(461.5f, 735.4f);
			isolationswiderstandMessprotokolleNEIN.showText("X");
			isolationswiderstandMessprotokolleNEIN.endText();
			isolationswiderstandMessprotokolleNEIN.close();
			
			
			/*
			 * Isolationswiderstand Ersatzmessungen
			 */
			PDPageContentStream isolationswiderstandErsatzmessungenJA = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			isolationswiderstandErsatzmessungenJA.setFont(PDType1Font.HELVETICA, 9);
			isolationswiderstandErsatzmessungenJA.setNonStrokingColor(Color.RED);
			isolationswiderstandErsatzmessungenJA.beginText();
			isolationswiderstandErsatzmessungenJA.newLineAtOffset(354.3f, 711.5f);
			isolationswiderstandErsatzmessungenJA.showText("X");
			isolationswiderstandErsatzmessungenJA.endText();
			isolationswiderstandErsatzmessungenJA.close();
			
			/*
			 * Isolationswiderstand Ersatzmessungen
			 */
			PDPageContentStream isolationswiderstandErsatzmessungenNEIN = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			isolationswiderstandErsatzmessungenNEIN.setFont(PDType1Font.HELVETICA, 9);
			isolationswiderstandErsatzmessungenNEIN.setNonStrokingColor(Color.RED);
			isolationswiderstandErsatzmessungenNEIN.beginText();
			isolationswiderstandErsatzmessungenNEIN.newLineAtOffset(461.5f, 711.5f);
			isolationswiderstandErsatzmessungenNEIN.showText("X");
			isolationswiderstandErsatzmessungenNEIN.endText();
			isolationswiderstandErsatzmessungenNEIN.close();
			
			/*
			 * Isolationswiderstand Bemerkungen
			 */
			PDPageContentStream isolationswiderstandBemerkungen = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			isolationswiderstandBemerkungen.setFont(PDType1Font.HELVETICA, 7);
			isolationswiderstandBemerkungen.setNonStrokingColor(Color.RED);
			isolationswiderstandBemerkungen.beginText();
			isolationswiderstandBemerkungen.newLineAtOffset(142f, 688.4f);
			isolationswiderstandBemerkungen.showText("Isolationswiderstand Bemerkungen");
			isolationswiderstandBemerkungen.endText();
			isolationswiderstandBemerkungen.close();
			
			
			
			/*
			 * Fehlerstrom
			 */
			PDPageContentStream fehlerstromJA = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			fehlerstromJA.setFont(PDType1Font.HELVETICA, 9);
			fehlerstromJA.setNonStrokingColor(Color.RED);
			fehlerstromJA.beginText();
			fehlerstromJA.newLineAtOffset(354.2f, 674.1f);
			fehlerstromJA.showText("X");
			fehlerstromJA.endText();
			fehlerstromJA.close();
			
			/*
			 * Fehlerstrom
			 */
			PDPageContentStream fehlerstromProzent = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			fehlerstromProzent.setFont(PDType1Font.HELVETICA, 8);
			fehlerstromProzent.setNonStrokingColor(Color.RED);
			fehlerstromProzent.beginText();
			fehlerstromProzent.newLineAtOffset(425f, 674.1f);
			fehlerstromProzent.showText("78.15");
			fehlerstromProzent.endText();
			fehlerstromProzent.close();
			
			/*
			 * Fehlerstrom
			 */
			PDPageContentStream fehlerstromNEIN = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			fehlerstromNEIN.setFont(PDType1Font.HELVETICA, 9);
			fehlerstromNEIN.setNonStrokingColor(Color.RED);
			fehlerstromNEIN.beginText();
			fehlerstromNEIN.newLineAtOffset(467.4f, 674.1f);
			fehlerstromNEIN.showText("X");
			fehlerstromNEIN.endText();
			fehlerstromNEIN.close();
			
			/*
			 * Fehlerstrom Bemerkungen
			 */
			PDPageContentStream fehlerstromBemerkungen = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			fehlerstromBemerkungen.setFont(PDType1Font.HELVETICA, 7);
			fehlerstromBemerkungen.setNonStrokingColor(Color.RED);
			fehlerstromBemerkungen.beginText();
			fehlerstromBemerkungen.newLineAtOffset(142f, 660f);
			fehlerstromBemerkungen.showText("Fehlerstrom Bemerkungen");
			fehlerstromBemerkungen.endText();
			fehlerstromBemerkungen.close();
			
			
			/*
			 * Schleifenwiderstand Ja
			 */
			PDPageContentStream schleifenwiderstandJA = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			schleifenwiderstandJA.setFont(PDType1Font.HELVETICA, 9);
			schleifenwiderstandJA.setNonStrokingColor(Color.RED);
			schleifenwiderstandJA.beginText();
			schleifenwiderstandJA.newLineAtOffset(354.4f, 645.8f);
			schleifenwiderstandJA.showText("X");
			schleifenwiderstandJA.endText();
			schleifenwiderstandJA.close();
			
			/*
			 * Schleifenwiderstand Prozent
			 */
			PDPageContentStream schleifenwiderstandProzent = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			schleifenwiderstandProzent.setFont(PDType1Font.HELVETICA, 8);
			schleifenwiderstandProzent.setNonStrokingColor(Color.RED);
			schleifenwiderstandProzent.beginText();
			schleifenwiderstandProzent.newLineAtOffset(425f, 645.8f);
			schleifenwiderstandProzent.showText("54,78");
			schleifenwiderstandProzent.endText();
			schleifenwiderstandProzent.close();
			
			/*
			 * Schleifenwiderstand Nein
			 */
			PDPageContentStream schleifenwiderstandNEIN = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			schleifenwiderstandNEIN.setFont(PDType1Font.HELVETICA, 9);
			schleifenwiderstandNEIN.setNonStrokingColor(Color.RED);
			schleifenwiderstandNEIN.beginText();
			schleifenwiderstandNEIN.newLineAtOffset(467.4f, 645.8f);
			schleifenwiderstandNEIN.showText("X");
			schleifenwiderstandNEIN.endText();
			schleifenwiderstandNEIN.close();
			
			/*
			 * Schleifenwiderstand Bemerkung
			 */
			PDPageContentStream schleifenwiderstandBemerkung = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			schleifenwiderstandBemerkung.setFont(PDType1Font.HELVETICA, 7);
			schleifenwiderstandBemerkung.setNonStrokingColor(Color.RED);
			schleifenwiderstandBemerkung.beginText();
			schleifenwiderstandBemerkung.newLineAtOffset(142f, 631.7f);
			schleifenwiderstandBemerkung.showText("Schleifenwiderstand Bemerkung");
			schleifenwiderstandBemerkung.endText();
			schleifenwiderstandBemerkung.close();
			
			
			/*
			 * Thermische Auffälligkeiten Ja
			 */
			PDPageContentStream thermischeAuffälligkeitenJA = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			thermischeAuffälligkeitenJA.setFont(PDType1Font.HELVETICA, 9);
			thermischeAuffälligkeitenJA.setNonStrokingColor(Color.RED);
			thermischeAuffälligkeitenJA.beginText();
			thermischeAuffälligkeitenJA.newLineAtOffset(354.3f, 617.7f);
			thermischeAuffälligkeitenJA.showText("X");
			thermischeAuffälligkeitenJA.endText();
			thermischeAuffälligkeitenJA.close();
			
			/*
			 * Thermische Auffälligkeiten Ja
			 */
			PDPageContentStream thermischeAuffälligkeitenNEIN = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			thermischeAuffälligkeitenNEIN.setFont(PDType1Font.HELVETICA, 9);
			thermischeAuffälligkeitenNEIN.setNonStrokingColor(Color.RED);
			thermischeAuffälligkeitenNEIN.beginText();
			thermischeAuffälligkeitenNEIN.newLineAtOffset(467.4f, 617.7f);
			thermischeAuffälligkeitenNEIN.showText("X");
			thermischeAuffälligkeitenNEIN.endText();
			thermischeAuffälligkeitenNEIN.close();
			
			/*
			 * Thermische Auffälligkeiten Bemerkungen
			 */
			PDPageContentStream thermischeAuffälligkeitenBemerkungen = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			thermischeAuffälligkeitenBemerkungen.setFont(PDType1Font.HELVETICA, 7);
			thermischeAuffälligkeitenBemerkungen.setNonStrokingColor(Color.RED);
			thermischeAuffälligkeitenBemerkungen.beginText();
			thermischeAuffälligkeitenBemerkungen.newLineAtOffset(142f, 603.7f);
			thermischeAuffälligkeitenBemerkungen.showText("Thermische Auffälligkeiten Bemerkungen");
			thermischeAuffälligkeitenBemerkungen.endText();
			thermischeAuffälligkeitenBemerkungen.close();
			
			
			
			/*
			 * Ortsveränderliche Betriebsmittel Ja
			 */
			PDPageContentStream betriebsmittelJA = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			betriebsmittelJA.setFont(PDType1Font.HELVETICA, 9);
			betriebsmittelJA.setNonStrokingColor(Color.RED);
			betriebsmittelJA.beginText();
			betriebsmittelJA.newLineAtOffset(354.4f, 562.5f);
			betriebsmittelJA.showText("X");
			betriebsmittelJA.endText();
			betriebsmittelJA.close();
			
			/*
			 * Ortsveränderliche Betriebsmittel Nein
			 */
			PDPageContentStream betriebsmittelNEIN = new PDPageContentStream(document, page2,
					PDPageContentStream.AppendMode.APPEND, false);
			betriebsmittelNEIN.setFont(PDType1Font.HELVETICA, 9);
			betriebsmittelNEIN.setNonStrokingColor(Color.RED);
			betriebsmittelNEIN.beginText();
			betriebsmittelNEIN.newLineAtOffset(461.4f, 562.5f);
			betriebsmittelNEIN.showText("X");
			betriebsmittelNEIN.endText();
			betriebsmittelNEIN.close();
			
			
			
			
			
			document.save("src/pdfs/befundschein_written.pdf");
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