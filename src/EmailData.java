import java.util.LinkedList;
import java.util.List;

public class EmailData {

    String encodingOptions = "text/html; charset=UTF-8";
    EmailAuth auth = new EmailAuth();
    String mailFrom = "mariusz.fras@pwr.edu.pl";
    List<String> mailTo = new LinkedList<>();
    String mailSubject = "Kolokwium z wykładu";
    //String mailBody = "<html><head></head><body><h1>JSOS Premium!</h1>Problemy z zalogowaniem? Przeciążone serwery? Skorzystaj z usługi JSOS premium, tylko 5 ects / msc</body></html>";
    String mailBody = "" +
            "<p>Szanowny Panie</p>\n" +
            "<p>Otrzymałem informację, że jest Pan administratorem grupy \"OFFTOP PWr W8\", na kt&oacute;rej umieszczane są obrażające mnie obrazki (i nie są one przez Pana usuwane).</p>\n" +
            "<p>Chcę przypomnieć że jestem profesorem Politechniki Wrocławskiej i <span style=\"color: #ff0000;\"><strong>TAKIE ZACHOWANIE JEST NIEGODNE STUDENTA</strong></span>.</p>\n" +
            "<p>Tym samym nie musi Pan nawet jutro przychodzić na kolokwium, bo sprawdziłem Pana obecność na wykładzie i nie pojawiał się Pan na nim. <strong><span style=\"color: #ff0000;\">Sprawą znieważenie mnie zajmie się rektor oraz prokuratura.</span></strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Pozdrawiam</p>\n" +
            "<p>Mariusz Fraś</p>";
    String personalName = "edukacja@pwr.edu.pl";

    public EmailData() {
        mailTo.add("228114@pwr.edu.pl");
        //mailTo.add("227946@pwr.edu.pl");
    }

}
