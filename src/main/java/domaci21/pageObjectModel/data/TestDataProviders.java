package domaci21.pageObjectModel.data;

import org.testng.annotations.DataProvider;

public class TestDataProviders {
    @DataProvider(name = "invalidEmails")
    public static Object[][] invalidEmails() {
        return new Object[][]{
                {"@mail.com"}, {"invalid@mail.c"}, {"invalid.com"}, {"invalid@ma#il.com"},
                {".invalid@mail.com"}, {"invalid@@mail.com"}
        };
    }

    @DataProvider(name = "invalidPasswords")
    public static Object[][] invalidPasswords() {
        return new Object[][]{
                {"a"}, {"aa"}, {"aaa"}, {"aaaa"}
        };
    }
}
