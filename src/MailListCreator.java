import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MailListCreator {

    //file with usernames
    public static List<String> createMailList(File file, String domain) {

        List<String> list = new LinkedList<>();

        try (Scanner scanner = new Scanner(file)) {

            if (scanner.hasNext()) scanner.nextLine();
            while (scanner.hasNext()) {
                list.add(scanner.nextLine() + domain);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }

}
