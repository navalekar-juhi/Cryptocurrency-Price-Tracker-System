/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author mansigandhi
 */
public class Mail {
    //String from = "einstein.passage@gmail.com";
	//String pass = "3inst3in?";
	public static boolean sendMail(String from,String password,String message,String to) throws MessagingException
        {
        try{
	String host = "smtp.gmail.com";
	
	Properties props = System.getProperties();
	props.put("mail.smtp.starttls.enable","true"); // added this line
	props.put("mail.smtp.host", host);
	props.put("mail.smtp.user", from);
	props.put("mail.smtp.password", password);
	props.put("mail.smtp.port", "587");
	props.put("mail.smtp.auth", "true");
      //  props.put("mail.smtp.ssl.trust","smtp.gmail.com");

	Session session = Session.getInstance(props,null);
	MimeMessage mimeMessage = new MimeMessage(session);
        
        
	mimeMessage.setFrom(new InternetAddress(from));

	InternetAddress toAddress = new InternetAddress(to);
	
	//System.out.println(Message.RecipientType.TO);

        mimeMessage.setRecipient(Message.RecipientType.TO, toAddress);
	mimeMessage.setSubject("Price Alert Notification");
	mimeMessage.setText(message);
	Transport transport = session.getTransport("smtp");
	transport.connect(host, from, password);
	transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
	transport.close();
        return true;
        }
        catch(MessagingException me){
                me.printStackTrace();
            }
        return false;

}
}
    
