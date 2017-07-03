import java.util.LinkedList;
import java.util.List;

public class EmailData {

    String encodingOptions = "text/html; charset=UTF-8";
    EmailAuth auth = new EmailAuth();
    String mailFrom = "email_nadawcy@emai.com";
    List<String> mailTo = new LinkedList<>();
    String mailSubject = "temat emaila";
    //String mailBody = "<html><head></head><body><h1>JSOS Premium!</h1>Problemy z zalogowaniem? Przeciążone serwery? Skorzystaj z usługi JSOS premium, tylko 5 ects / msc</body></html>";
    String mailBody = "ciało emaila";
    String personalName = "autor";

    public EmailData() {
        mailTo.add("228114@pwr.edu.pl");
    }

}
