import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Day03 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee dd-MM-yy HH:mm:ss", Locale.forLanguageTag("id-ID"));
        System.out.println(formatter.format(today));
    }
}
