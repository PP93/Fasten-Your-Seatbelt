package fys;

import java.awt.Color;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author breud
 */
public class PDFGenerator {

    PDDocument document;
    PDPageContentStream contentStream;

    public PDFGenerator() {
        try {
            // Create a document and add a page to it
            this.document = new PDDocument();
            PDPage page = new PDPage();
            this.document.addPage(page);

            // Start a new content stream which will "hold" the to be created content
            this.contentStream = new PDPageContentStream(document, page);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void generate(int date, String firstname, String lastname, String country, String city, String zipcode, String address, String phonenumber, String emailaddress,
            String shippingcountry, String shippingzipcode, String shippingaddress, String shippingcity, String flightnumber, String brand, String color, int weight, String description) {
        try {
            // Define a text content stream using the selected font, moving the cursor and drawing the text "Hello World"
            this.contentStream.beginText();

            System.out.println(date + firstname + lastname + country + city + zipcode + address + phonenumber + emailaddress + shippingcountry + shippingzipcode + shippingaddress + shippingcity + flightnumber + brand + color + weight);
            // Create a new font object selecting one of the PDF base fonts
            PDFont boldFont = PDType1Font.HELVETICA_BOLD;
            PDFont normalFont = PDType1Font.HELVETICA;
            PDFont italicFont = PDType1Font.HELVETICA_OBLIQUE;

            final int X_START = 30;
            final int Y_START = 700;
            final int X_START_NORMAL = 40;
            final int X_ANSWER = 200;
            final int Y_START_NORMAL = 600;
            int spacingbetweenlines = 12;
            // header
            int logoFontSize = 32;
            int headerFontSize = 16;
            int normalFontSize = 12;

            this.contentStream.setFont(boldFont, logoFontSize);
            this.contentStream.moveTextPositionByAmount(X_START, Y_START);
            this.contentStream.setNonStrokingColor(Color.RED);
            this.contentStream.drawString("Corendon");
            this.contentStream.endText();

            normaal(normalFont, normalFontSize);
            this.contentStream.drawString("The Item(s) has not been found within a month of searching. ");
            this.contentStream.endText();

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(40, 638);
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.drawString("Item(s) is now permanentley lost.");
            this.contentStream.endText();

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.setFont(boldFont, headerFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.drawString("Client Information ");
            this.contentStream.endText();
            spacingbetweenlines += 24;

            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Date: ");
            this.contentStream.endText();

            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("" + date);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("First name: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(firstname);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Last name: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(lastname);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Country: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(country);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("City: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(city);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Zip Code: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(zipcode);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Address: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(address);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Phone number: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(phonenumber);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("E-mail adress: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(emailaddress);
            this.contentStream.endText();
            spacingbetweenlines += 24;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.setFont(boldFont, headerFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.drawString("Bagage Information ");
            this.contentStream.endText();

            spacingbetweenlines += 32;

            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Flight number: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(flightnumber);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Brand: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(brand);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Color: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(color);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("weight: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("" + weight);
            this.contentStream.endText();
            spacingbetweenlines += 12;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Description: ");
            this.contentStream.endText();
            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString(description);
            this.contentStream.endText();
            spacingbetweenlines += 48;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Bagage has been found:  ");
            this.contentStream.endText();

            this.contentStream.beginText();
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.moveTextPositionByAmount(X_ANSWER, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("YES / NO");
            this.contentStream.endText();

            spacingbetweenlines += 200;

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(X_START_NORMAL, (Y_START_NORMAL - spacingbetweenlines));
            this.contentStream.drawString("Signature: ____________________ ");
            this.contentStream.endText();

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(400, 588);
            this.contentStream.setFont(boldFont, headerFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.drawString("Employee information");
            this.contentStream.endText();

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(400, 566);
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.drawString("Date : datum");
            this.contentStream.endText();

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(400, (566 - 12));
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.drawString("Employee : test");
            this.contentStream.endText();

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(400, (566 - 24));
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.drawString("Employee ID : test");
            this.contentStream.endText();

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(400, (566 - 36));
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.drawString("Locatie : nederland");
            this.contentStream.endText();

            this.contentStream.beginText();
            this.contentStream.moveTextPositionByAmount(400, (566 - 48));
            this.contentStream.setFont(normalFont, normalFontSize);
            this.contentStream.setNonStrokingColor(Color.black);
            this.contentStream.drawString("Office Location : schiphol");
            this.contentStream.endText();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void normaal(PDFont normalFont, int normalFontSize) throws IOException {
        this.contentStream.beginText();
        this.contentStream.moveTextPositionByAmount(40, 650);
        this.contentStream.setFont(normalFont, normalFontSize);
        this.contentStream.setNonStrokingColor(Color.black);
    }

    public void save(String filename) {
        try {
            // Make sure that the content stream is closed:
            this.contentStream.close();

            // Save the results and ensure that the document is properly closed:
            this.document.save(filename);
            this.document.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static int stringWidth(String s, PDFont font, double fontSize) {
        try {
            return (int) (font.getStringWidth(s) * fontSize / 1000) + 1;
        } catch (IOException ex) {
            // ignore, but return 0
            return 0;
        }
    }

}
