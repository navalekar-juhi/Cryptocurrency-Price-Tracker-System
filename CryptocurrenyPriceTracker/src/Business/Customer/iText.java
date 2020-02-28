/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.EcoSystem;
import Business.Investment.InvestmentDirectory;
import Business.UserAccount.UserAccount;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mansigandhi
 */
public class iText {
    public static void generatePDF(UserAccount account,EcoSystem ecosystem) throws DocumentException {
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("ITextTest.pdf"));
            document.open();
            Paragraph paragraph1 = new Paragraph();
            paragraph1.setSpacingBefore(50);
            document.add(paragraph1);
            document.add(new Paragraph("Details of the Customer", FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 255, 0, 0))));
            PdfPTable t = new PdfPTable(3);
            t.setSpacingBefore(25);
            t.setSpacingAfter(25);
            PdfPCell c1 = new PdfPCell(new Phrase("Coin Type"));
            t.addCell(c1);
            PdfPCell c2 = new PdfPCell(new Phrase("Quantity"));
            t.addCell(c2);
            PdfPCell c3 = new PdfPCell(new Phrase("Type"));
            t.addCell(c3);
            
            Customer c = (Customer)ecosystem.getCustomerDirectory().searchCustomer(account.getUsername());
            for(InvestmentDirectory i: c.getCurrentInvestment()){
            t.addCell(i.getInvestmentList().getCoin().getSymbol());
            t.addCell(String.valueOf(i.getInvestmentList().getQuantity()));
            t.addCell(i.getType());
            
            }
            document.add(t);
            document.close();

        } catch (DocumentException ex) {
            Logger.getLogger(iText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(iText.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
