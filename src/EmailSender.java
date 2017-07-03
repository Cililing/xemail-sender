import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class EmailSender {

    public static boolean sendMail(EmailData data) throws MessagingException, UnsupportedEncodingException {

        Properties props = new Properties();

        props.put("mail.smtp.host", data.auth.host);
        //props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");


        System.out.println("Props data:\n" +props);

        Session session = Session.getDefaultInstance(props, data.auth);
        MimeMessage message = new MimeMessage(session);
        message.setContent("EmailMessage", "text/plain");
        message.setSubject(data.mailSubject);
        message.setText(data.mailBody);
        message.setHeader("Content-Type", data.encodingOptions);
        message.setSentDate(new Date());


        Address fromAddress = new InternetAddress(data.mailFrom, data.personalName);
        message.setFrom(fromAddress);
        message.setSender(fromAddress);

        for (String s : data.mailTo) {
            message.addRecipients(Message.RecipientType.TO, s);
        }

        System.out.println("Message data: \n" + message);


        Transport.send(message);

        return true;
    }


    public static void main(String... args) {

        //prepare indeks
//        File f = new File("indeksy.txt");
//        List<String> mails = MailListCreator.createMailList(f, "@student.pwr.edu.pl");

        try {
            EmailData data = new EmailData();
            //data.mailTo = mails;

            EmailSender.sendMail(data);
        } catch (MessagingException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

