package Lesson9Homework1Test;

import Lesson9Homework1.BrowserNavigation.BrowserNavigation;
import Lesson9Homework1.Servis.Generator;
import Lesson9Homework1.Servis.WebDriverFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserNavigationTest {

    private Generator generator = new Generator();

    @Test
    public void openRegistrationWindow() {
//        WebDriver driver = WebDriverFactory.CHROME.create();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Njuta\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        BrowserNavigation browserNavigation = new BrowserNavigation();
        browserNavigation.openMainPage()
                .openTheRegistrationWindow()
                .enterEmail(generator.generateRandomMail())
                .enterFirstName(generator.generateRandomString())
                .enterLastName(generator.generateRandomString())
                .enterPassword(generator.generateRandomPassword())
                .enterPostalCode(generator.generateRandomPostalCode())
                .enterMobilePhone(generator.generateRandomPhone())
                .enterRegister()
                .waitToAssert()
                .findActualResult();
        Assert.assertEquals(browserNavigation.findActualResult(),
                "There are 3 errors");
        driver.close();

    }
}
