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
        Pattern pattern = Pattern.compile("[A-Z]{1}[A-Za-z]*[0-9]*");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.find()) {
            return lastName.equals(matcher.group());
        }
        return false;
    }

    public static boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("[a-zA-z0-9][a-zA-z0-9._]*@[a-zA-z]+([.][a-zA-z]+)+");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            return email.equals(matcher.group());
        }
        return false;
    }

    public static boolean checkContactNumber(String contactNumber) {
        Pattern pattern = Pattern.compile("[98765]{1}[0-9]{9}");
        Matcher matcher = pattern.matcher(contactNumber);
        if (matcher.find()) {
            return contactNumber.equals(matcher.group());
        }
        return false;
    }
}
