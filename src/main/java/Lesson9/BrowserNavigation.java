package Lesson9;

import Lesson9.Servis.Generator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

    //todo make fields private
    private WebDriver driver = new ChromeDriver();
    private Generator generator = new Generator();
    private WebElement emailInput = driver.findElement(By.cssSelector("#email_create"));
    private WebElement submitButton = driver.findElement(By.cssSelector("#SubmitCreate"));
    private WebElement registrationWindow = driver.findElement(By.cssSelector("a.login"));
    private WebElement firstNameInput = driver.findElement(By.cssSelector("#customer_firstname"));
    private WebElement lastNameInput = driver.findElement(By.cssSelector("#customer_lastname"));
    private WebElement passwordInput = driver.findElement(By.cssSelector("#passwd"));
    private WebElement mobilePhoneInput = driver.findElement(By.cssSelector("#phone_mobile"));
    private WebElement registerButton = driver.findElement(By.cssSelector("#submitAccount"));

    final String SYSTEM_CHROME_DRIVER_VARIABLE = "webdriver.chrome.driver";

    public BrowserNavigation(String passToDriverNavigation) {
        System.setProperty(SYSTEM_CHROME_DRIVER_VARIABLE, passToDriverNavigation);

    }

    public void openMainPage() {
        driver.navigate().to("http://automationpractice.com/index.php");

    }

    public void openTheRegistrationWindow() {
        registrationWindow.click();
    }

    public void enterEmail(String generateMail) {
        emailInput.click();
        emailInput.sendKeys(generateMail);
        submitButton.click();
    }

    public void enterFirstName(String generateString) {
        firstNameInput.click();
        firstNameInput.sendKeys(generateString);
    }

    public void enterLastName(String generateString) {
        lastNameInput.click();
        lastNameInput.sendKeys(generateString);
    }

    public void enterPassword(String generatePassword) {
        passwordInput.click();
        passwordInput.sendKeys(generatePassword);
    }

    public void enterMobilePhone(String generatePhone) {
        mobilePhoneInput.click();
        mobilePhoneInput.sendKeys(generator.generateRandomPhone());
    }

    public void enterRegister() {
        registerButton.click();
    }
}
