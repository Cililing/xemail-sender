import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class EmailAuth extends Authenticator {

    String username = "emailsender2@2.pl";
    String password = "emailsender123";
    String host = "t.pl";



    public EmailAuth() {

    }

    public EmailAuth(String host, String username, String password) {
        super();
        this.host = host;
        this.username = username;
        this.password = password;
    }


    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }
}
