package domaci20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Tests {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeEachTest() {
        driver.get("https://vue-demo.daniel-avellaneda.com");
        driver.manage().window().maximize();
    }

    @Test
    public void verifySignUpPageUrl() {
        driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"), "ERROR: Page url doesn't contains /signup");
    }

    @DataProvider(name = "signUpFields")
    public Object[][] signUpFields() {
        return new Object[][]{
                {"email", "email"}, {"password", "password"}, {"confirmPassword", "password"}
        };
    }

    @Test(dataProvider = "signUpFields")
    public void verifySignUpPageAttributes(String field, String expectedType) {
        WebElement signUpButton = driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]"));
        signUpButton.click();
        WebElement signUpField = driver.findElement(By.id(field));
        Assert.assertEquals(expectedType, signUpField.getAttribute("type"), "ERROR: Invalid input type for " + field + " field.");
    }

    @DataProvider(name = "invalidEmails")
    public Object[][] invalidEmails() {
        return new Object[][]{
                {"@mail.com"}, {"invalid@mail.c"}, {"invalid.com"}, {"invalid@ma#il.com"}, {".invalid@mail.com"}, {"invalid@@mail.com"}
        };
    }

    @Test(dataProvider = "invalidEmails")
    public void testInvalidInputs(String email) {
        String validName = "Milos";
        String validPassword = "password123";

        WebElement signUpButton = driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]"));
        signUpButton.click();

        WebElement nameField = driver.findElement(By.id("name"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));

        nameField.sendKeys(validName);
        emailField.sendKeys(email);
        passwordField.sendKeys(validPassword);
        confirmPasswordField.sendKeys(validPassword);

        WebElement errorMessage = driver.findElement(By.className("v-messages__message"));
        Assert.assertEquals("Valid email is required", errorMessage.getText(), "ERROR: System accepts invalid email address '" + email + "'");
    }

    @DataProvider(name = "invalidPasswords")
    public Object[][] invalidPasswords() {
        return new Object[][]{
                {"a"}, {"aa"}, {"aaa"}, {"aaaa"}
        };
    }

    @Test(dataProvider = "invalidPasswords")
    public void testInvalidPasswords(String password) {
        WebElement signUpButton = driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]"));
        signUpButton.click();

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("v-messages__message"))));
        Assert.assertEquals(errorMessage.getText(), "This field must have no less than 5 characters");
    }

    @Test
    public void differentPasswords() {
        WebElement signUpButton = driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]"));
        signUpButton.click();

        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
        confirmPasswordField.sendKeys("password123");

        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("v-messages__message"))));
        Assert.assertEquals(errorMessage.getText(), "Passwords must match");
    }

    @Test
    public void testEmptyFields() {
        WebElement signUpButton = driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]"));
        signUpButton.click();

        WebElement signMeUpBtn = driver.findElement(By.xpath("//button[contains(@class, 'secondary')]"));
        signMeUpBtn.click();

        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("v-messages__message"))));
        Assert.assertEquals(errorMessage.getText(), "This field is required");
    }

    @AfterClass
    public void afterEachTest() {
        driver.close();
    }
}
