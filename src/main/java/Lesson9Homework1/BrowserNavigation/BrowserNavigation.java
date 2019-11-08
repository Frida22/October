package Lesson9Homework1.BrowserNavigation;

import Lesson9Homework1.Servis.Generator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserNavigation {

    private WebDriver driver = new ChromeDriver();
    private Generator generator = new Generator();
    private final int WEB_DRIVER_WAIT_SECOND = 5;
    private final Wait<WebDriver> wait = new WebDriverWait(driver, WEB_DRIVER_WAIT_SECOND);


    public BrowserNavigation openMainPage() {
        driver.navigate().to("http://automationpractice.com/index.php");
        return this;
    }

    public BrowserNavigation openTheRegistrationWindow() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.login")));
        driver.findElement(By.cssSelector("a.login")).click();
        return this;
    }

    public BrowserNavigation enterEmail(String generateMail) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email_create")));
        driver.findElement(By.cssSelector("#email_create")).click();
        driver.findElement(By.cssSelector("#email_create")).sendKeys(generateMail);
        driver.findElement(By.cssSelector("#SubmitCreate")).click();
        return this;
    }

    public BrowserNavigation enterFirstName(String generateString) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer_firstname")));
        driver.findElement(By.cssSelector("#customer_firstname")).click();
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(generateString);
        return this;
    }

    public BrowserNavigation enterLastName(String generateString) {
        driver.findElement(By.cssSelector("#customer_lastname")).click();
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys(generateString);
        return this;
    }

    public BrowserNavigation enterPassword(String generatePassword) {
        driver.findElement(By.cssSelector("#passwd")).click();
        driver.findElement(By.cssSelector("#passwd")).sendKeys(generatePassword);
        return this;
    }

    public BrowserNavigation enterPostalCode(String generatePostalCode) {
        driver.findElement(By.cssSelector("#postcode")).click();
        driver.findElement(By.cssSelector("#postcode")).sendKeys(generatePostalCode);
        return this;
    }

    public BrowserNavigation enterMobilePhone(String generatePhone) {
        driver.findElement(By.cssSelector("#phone_mobile")).click();
        driver.findElement(By.cssSelector("#phone_mobile")).sendKeys(generator.generateRandomPhone());
        return this;
    }

    public BrowserNavigation enterRegister() {
        driver.findElement(By.cssSelector("#submitAccount")).click();
        return this;
    }

    public String findActualResult() {
        return driver.findElement(By.cssSelector("#center_column > div > p")).getText();
    }

    public BrowserNavigation waitToAssert(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#center_column > div")));
        return this;
    }
}