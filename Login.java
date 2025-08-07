// File: Login.java
package LoginSystem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Login {

    private static final Set<String> offensiveWords = new HashSet<>(Arrays.asList(
        "hoe", "slut", "nigga", "bitch", "fuck", "shit", "ass", "whore"
    ));

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.endsWith("@gmail.com");
    }

    public static boolean isOffensiveUsername(String username) {
        String lowercase = username.toLowerCase();
        for (String word : offensiveWords) {
            if (lowercase.contains(word)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isStrongPassword(String password) {
        if (password.length() < 6) return false;

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSymbol = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSymbol = true;
        }
        return hasUpper && hasLower && hasDigit && hasSymbol;
    }
}
