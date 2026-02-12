import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegexProcessorTest {

    @Test
    public void testNumberStartingWith070() {
        String phoneNumber = "07031235568";
        Assertions.assertTrue(RegexProcessor.isPhoneNumberValid(phoneNumber));

    }

    @Test
    public void testNumberStartingWith080() {
        String phoneNumber = "08031235568";
        Assertions.assertTrue(RegexProcessor.isPhoneNumberValid(phoneNumber));
    }

    @Test
    public void testNumberStartingWith234() {
        String phoneNumber = "+234-8031235568";
        Assertions.assertTrue(RegexProcessor.isPhoneNumberValid(phoneNumber));
    }

    @Test
    public void testPersonalEmailIsValid() {
        String email = "chiedoziegochiamaka98@gmail.com";
        Assertions.assertTrue(RegexProcessor.isEmailValid(email));

    }

    @Test
    public void testPersonalEmailIsValid2() {
        String email = "chiedoziegochiamaka@gmail.com";
        Assertions.assertTrue(RegexProcessor.isEmailValid(email));

    }

    @Test
    public void testCompanyEmailIsValid() {
        String email = "o.chiamaka@semicolon.africa";
        Assertions.assertTrue(RegexProcessor.isEmailValid(email));

    }

    @Test
    public void testCompanyEmailIsValid2() {
        String email = "        @semicolon.africa";
        Assertions.assertFalse(RegexProcessor.isEmailValid(email));

    }
}