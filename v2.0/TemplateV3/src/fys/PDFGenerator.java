package fys;

import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.util.PDFMergerUtility;

/**
 *
 * @author Lars
 */
public class PDFGenerator {

    PDDocument document;
    PDPageContentStream contentStream;

    public PDFGenerator() {
        try {
            // Create a document and add a page to it

            this.document = PDDocument.load("C:\\Users\\Alternate\\Documents\\GitHub\\Fasten-Your-Seatbelt\\v2.0\\TemplateV3\\Template.pdf");
//            PDPage page = new PDPage();
//            this.document.addPage(page);
            //(URL C:\Users\Alternate\Documents\GitHub\Fasten-Your-Seatbelt\v2.0\TemplateV3\Florisvan Lent1337 WC.pdf)
            // Start a new content stream which will "hold" the to be created content
//            this.document = new PDDocument();
            PDPage page = (PDPage) document.getDocumentCatalog().getAllPages().get(0);
            this.document.addPage(page);

            this.contentStream = new PDPageContentStream(document, page, true, true);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void generate(int date, String firstname, String lastname, String country, String city, String zipcode, String address, String phonenumber, String emailaddress,
            String shippingcountry, String shippingzipcode, String shippingaddress, String shippingcity, String flightnumber, String brand, String color, String weight, String description) {
        try {
            // Define a text content stream using the selected font, moving the cursor and drawing the text "Hello World"

            System.out.println(date + firstname + lastname + country + city + zipcode + address + phonenumber + emailaddress + shippingcountry + shippingzipcode + shippingaddress + shippingcity + flightnumber + brand + color + weight);
            // Create a new font object selecting one of the PDF base fonts
            PDFont boldFont = PDType1Font.HELVETICA_BOLD;
            PDFont normalFont = PDType1Font.HELVETICA;
            PDFont italicFont = PDType1Font.HELVETICA_OBLIQUE;

            int spacingbetweenlineslogoFontSize = 32;
            int spacingbetweenlinesheaderFontSize = 16;
            int spacingbetweenlinesnormalFontSize = 12;
            // header
            int logoFontSize = 32;
            int headerFontSize = 16;
            int normalFontSize = 12;
            String corendon = "Corendon";
            String text = "text";
            int setXStart = 30;
            int setXstartLogo = 20;
            int setystartLogo = 720;
            int setXAnswer = 200;
            int setXemployee = 30;
            int setXemployeeanswer = 200;
            int setYemployeeanswer = 276;
            int setYStart = 670;
            String dateTimeString = dateTime() + "";

            Employee currentEmployee = new Employee(Employee.getCurrentUser());
//           Label_WelcomeText.setText("Welcome " + currentEmployee.getFullName() + ".");

            String currentEmployeeIDString = currentEmployee.getCurrentEmployeeID() + "";
            String currentEmployeeString = currentEmployee + "";
            String locationEmployeeString = currentEmployee.getCurrentLocation() + "";

            String locationEmail = locationEmployeeString + "@corendon.com";

            

            String[] allvariableemployeeinfoanswers = {dateTimeString, currentEmployeeString,
                "+31 23 75 10 600",
                locationEmail, locationEmployeeString};

            String[] allvariablesanswers = {firstname, lastname, country, city,
                zipcode, address, phonenumber, emailaddress, shippingcountry,
                shippingzipcode, shippingaddress, shippingcity, flightnumber,
                brand, color, weight, description};
            

            
            
            for (int i = 0; i < allvariablesanswers.length; i++) {
                pdfSetText(setXAnswer, setYStart, normalFont, normalFontSize,
                        allvariablesanswers[i],
                        spacingbetweenlinesnormalFontSize, i);
            }
            
            
            for (int i = 0; i < allvariableemployeeinfoanswers.length; i++) {
                pdfSetText(setXemployeeanswer, setYemployeeanswer, normalFont,
                        normalFontSize, allvariableemployeeinfoanswers[i],
                        spacingbetweenlinesnormalFontSize, i);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void pdfSetText(int XBegin, int YBegin, PDFont fontType,
            int fontSize, String allVariables,
            int spacingbetweenlinesnormalFontSize, int i) throws IOException {
        this.contentStream.beginText();
        this.contentStream.setFont(fontType, fontSize);
        this.contentStream.moveTextPositionByAmount(XBegin,
                (YBegin - (spacingbetweenlinesnormalFontSize * i)));
        this.contentStream.setNonStrokingColor(Color.black);
        this.contentStream.drawString(allVariables);
        this.contentStream.endText();
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

    public Date dateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
//	   System.out.println(dateFormat.format(date));
// 
//	   get current date time with Calendar()
//	   Calendar cal = Calendar.getInstance();
//	   System.out.println(dateFormat.format(cal.getTime()));
        return date;
    }

}
