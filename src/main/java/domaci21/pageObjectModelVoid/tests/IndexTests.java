package domaci21.pageObjectModelVoid.tests;

import domaci21.pageObjectModelVoid.data.TestDataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IndexTests extends BaseTest {

    @BeforeMethod
    public void beforeEachTest() {
        getIndexPage().open();
        getIndexPage().getSignUpButton().click();
    }

    @Test
    public void verifySignUpPageUrl() {
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"),
                "ERROR: Page url doesn't contains /signup");
    }

    @Test
    public void verifyEmailFieldType() {
        Assert.assertEquals(getIndexPage().getEmailField().getAttribute("type"), "email",
                "ERROR: Email type is not email.");
    }

    @Test
    public void verifyPasswordFieldType() {
        Assert.assertEquals(getIndexPage().getPasswordField().getAttribute("type"), "password",
                "ERROR: Password type is not password.");
    }

    @Test
    public void verifyConfirmPasswordFieldType() {
        Assert.assertEquals(getIndexPage().getConfirmPasswordField().getAttribute("type"), "password",
                "ERROR: Confirm password type is not password.");
    }

    @Test(dataProvider = "invalidPasswords", dataProviderClass = TestDataProviders.class)
    public void testInvalidPasswords(String password) {
        getIndexPage().enterDataToPasswordField(password);
        assertVisibilityOfElement(getIndexPage().getErrorMessageField());
        Assert.assertEquals(getIndexPage().getErrorMessageField().getText(),
                "This field must have no less than 5 characters");
    }

    @Test(dataProvider = "invalidEmails", dataProviderClass = TestDataProviders.class)
    public void testInvalidInputs(String email) {
        getIndexPage().enterDataToEmailField(email);
        assertVisibilityOfElement(getIndexPage().getErrorMessageField());
        Assert.assertEquals(getIndexPage().getErrorMessageField().getText(), "Valid email is required",
                "ERROR: System accepts invalid email address '" + email + "'");
    }

    @Test
    public void differentPasswords() {
        getIndexPage().enterDataToConfirmPasswordField("password123");
        assertVisibilityOfElement(getIndexPage().getErrorMessageField());
        Assert.assertEquals(getIndexPage().getErrorMessageField().getText(), "Passwords must match");
    }

    @Test
    public void testEmptyFields() {
        getIndexPage().getSignMeUpButton().click();
        assertVisibilityOfElement(getIndexPage().getErrorMessageField());
        Assert.assertEquals(getIndexPage().getErrorMessageField().getText(), "This field is required");
    }
}
