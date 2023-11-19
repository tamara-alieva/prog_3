import java.util.regex.Pattern;

public class Checking {
    static public boolean nameCheck(String name) {
        boolean f;
        f = !name.isEmpty();
        if (f) {
            String namePattern = "[A-Za-z]+";
            Pattern pattern = Pattern.compile(namePattern);
            f = pattern.matcher(name).matches();
        }
        return f;
    }

    static public boolean intCheck(String balance) {
        boolean f;
        f = !balance.isEmpty();
        if (f) {
            String intPattern = "[0-9]+";
            Pattern pattern = Pattern.compile(intPattern);
            f = pattern.matcher(balance).matches();
        }
        return f;
    }
}
