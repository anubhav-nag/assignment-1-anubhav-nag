package contact_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact_Validation {

    public static boolean checkFirstName(String firstName) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[A-Za-z]*");
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.find()) {
            return firstName.equals(matcher.group());
        }
        return false;
    }

    public static boolean checkLastName(String lastName) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[A-Za-z]*[1-9]*");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.find()) {
            return lastName.equals(matcher.group());
        }
        return false;
    }

    public static boolean checkEamil() {
        return true;
    }

    public static boolean checkContactNumber() {
        return true;
    }
}
