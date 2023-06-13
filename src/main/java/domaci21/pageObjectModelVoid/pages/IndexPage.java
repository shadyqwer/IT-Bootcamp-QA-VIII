package domaci21.pageObjectModelVoid.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage {
    private WebElement nameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement confirmPasswordField;
    private WebElement signUpButton;
    private WebElement errorMessageField;
    private WebElement signMeUpButton;


    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getNameField() {
        nameField = getDriver().findElement(By.id("name"));
        return nameField;
    }

    public WebElement getEmailField() {
        emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }

    public WebElement getPasswordField() {
        passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }

    public WebElement getConfirmPasswordField() {
        confirmPasswordField = getDriver().findElement(By.id("confirmPassword"));
        return confirmPasswordField;
    }

    public WebElement getSignUpButton() {
        signUpButton = getDriver().findElement(By.xpath("//span[contains(text(),'Sign Up')]"));
        return signUpButton;
    }

    public WebElement getErrorMessageField() {
        errorMessageField = getDriver().findElement(By.className("v-messages__message"));
        return errorMessageField;
    }

    public WebElement getSignMeUpButton() {
        signMeUpButton = getDriver().findElement(By.xpath("//button[contains(@class, 'secondary')]"));
        return signMeUpButton;
    }

    public void open() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com");
    }

    public void enterDataToNameField(String name) {
        getNameField().sendKeys(name);
    }

    public void enterDataToEmailField(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterDataToPasswordField(String password) {
        getPasswordField().sendKeys(password);
    }

    public void enterDataToConfirmPasswordField(String password) {
        getConfirmPasswordField().sendKeys(password);
    }
}
