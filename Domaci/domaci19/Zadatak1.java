package domaci19;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) {
        String driverPath = "chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();

        // go to page https://demoqa.com/text-box
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[contains(h5, 'Elements')]")).click();
        driver.findElement(By.id("item-0")).click();

        // faker input strings
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String currentAddress = faker.address().fullAddress();
        String permanentAddress = faker.address().fullAddress();

        // get and type into text box elements
        WebElement fieldFullName = driver.findElement(By.id("userName"));
        WebElement fieldEmail = driver.findElement(By.id("userEmail"));
        WebElement fieldCurrentAddress = driver.findElement(By.id("currentAddress"));
        WebElement fieldPermanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        fieldFullName.sendKeys(fullName);
        fieldEmail.sendKeys(email);
        fieldCurrentAddress.sendKeys(currentAddress);
        fieldPermanentAddress.sendKeys(permanentAddress);
        submitButton.click();

        // find submitted strings
        WebElement submittedFullName = driver.findElement(By.id("name"));
        WebElement submittedEmail = driver.findElement(By.id("email"));
        WebElement submittedCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        WebElement submittedPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));

        // assert if all fields print same result, if not check which fields are failing
        if (submittedFullName.getText().contains(fullName) && submittedEmail.getText().contains(email) &&
                submittedCurrentAddress.getText().contains(currentAddress) && submittedPermanentAddress.getText().contains(permanentAddress)) {
            System.out.println("Test passed. All fields prints same result.");
        } else {
            if (!submittedFullName.getText().contains(fullName)) {
                System.out.println("Test failed. Full name field is not working.");
            }
            if (!submittedEmail.getText().contains(email)) {
                System.out.println("Test failed. Email field is not working.");
            }
            if (!submittedCurrentAddress.getText().contains(currentAddress)) {
                System.out.println("Test failed. Current address field is not working.");
            }
            if (!submittedPermanentAddress.getText().contains(permanentAddress)) {
                System.out.println("Test failed. Permanent address field is not working.");
            }
        }
        driver.close();
    }
}
