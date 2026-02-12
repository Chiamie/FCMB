public class RegexProcessor {

    public static boolean isPhoneNumberValid(String phoneNumber) {
        String pattern = "(\\+234-*|(080|070)\\d{8})|(\\+235-*[0-9]{8})";
        return phoneNumber.matches(pattern);

    }

    public static boolean isEmailValid(String email) {
        String pattern = "(\\w+@\\w+\\.\\w+)|([a-zA-z]\\.\\w+@semicolon\\.africa)";
        return email.matches(pattern);
    }



}
