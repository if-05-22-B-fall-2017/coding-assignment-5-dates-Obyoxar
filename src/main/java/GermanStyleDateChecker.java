import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        Pattern p = Pattern.compile("^(([12]?\\d)|(3[01]))[- .]((0?\\d)|(1[12]))[- .](((19)|(2\\d))?\\d\\d)$");
        return p.matcher(dateString);
    }
}
