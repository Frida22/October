package Lesson9;

import Lesson9.Servis.Generator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson9Homework1 {
    WebDriver driver = new ChromeDriver();
    Generator generator = new Generator();

    public void openMainPage() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Njuta\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver.navigate().to("http://automationpractice.com/index.php");

    }
    public void openTheRegistrationWindow(){
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.cssSelector("a.login")).click();
    }
    public void enterEmail(){
        driver.findElement(By.cssSelector("#email_create")).click();
        driver.findElement(By.cssSelector("#email_create")).sendKeys(generator.generateRandomMail());
        driver.findElement(By.cssSelector("#SubmitCreate")).click();

    }
    public void enterFirstName(){
        driver.findElement(By.cssSelector("#customer_firstname")).click();
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(generator.generateRandomString(6));
    }
    public void enterLastName(){
        driver.findElement(By.cssSelector("#customer_lastname")).click();
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys(generator.generateRandomString(7));
    }
    public void enterPassword(){
        driver.findElement(By.cssSelector("#passwd")).click();
        driver.findElement(By.cssSelector("#passwd")).sendKeys(generator.generateRandomPassword());
    }
    public void enterMobilePhone(){
        driver.findElement(By.cssSelector("#phone_mobile")).click();
        driver.findElement(By.cssSelector("#phone_mobile")).sendKeys(generator.generateRandomPhone());

    }
    public void enterRegister(){
        driver.findElement(By.cssSelector("#submitAccount")).click();
    }
    @Test
    public void test(){
        openMainPage();



    }

}
