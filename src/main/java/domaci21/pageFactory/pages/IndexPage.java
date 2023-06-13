package domaci21.pageFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage {

    @FindBy (id = "name")
    WebElement nameField;

    @FindBy (id = "email")
    WebElement emailField;

    @FindBy (id = "password")
    WebElement passwordField;

    @FindBy (id = "confirmPassword")
    WebElement confirmPasswordField;

    @FindBy (xpath = "//span[contains(text(),'Sign Up')]")
    WebElement signUpButton;

    @FindBy (className = "v-messages__message")
    WebElement errorMessageField;

    @FindBy (xpath = "//button[contains(@class, 'secondary')]")
    WebElement signMeUpButton;

    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public WebElement getSignUpButton() {
        return signUpButton;
    }

    public WebElement getErrorMessageField() {
        return errorMessageField;
    }

    public WebElement getSignMeUpButton() {
        return signMeUpButton;
    }

    public void open() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com");
    }

    public void enterDataToNameField(String name) {
        nameField.sendKeys(name);
    }

    public void enterDataToEmailField(String email) {
        emailField.sendKeys(email);
    }

    public void enterDataToPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void enterDataToConfirmPasswordField(String password) {
        confirmPasswordField.sendKeys(password);
    }
}
