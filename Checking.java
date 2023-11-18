public class Checking {
    static private boolean nameCheck(String name) {
        boolean f = true;
        for (int i = 0; i < name.length(); i++) {
            if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'А' && name.charAt(i) <= 'Я') || (name.charAt(i) >= 'а' && name.charAt(i) <= 'я')) {
                f = true;
            } else {
                f = false;
                break;
            }
        }
        return f;
    }
}
