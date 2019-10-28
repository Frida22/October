package Homework2;

import Lesson9Homework2.InTheChart;
import Lesson9Homework2.MainPage;
import Lesson9Homework2.ProductSelectionPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertThat;

public class Homework2 {
    private WebDriver driver;

    @BeforeClass
    public static void initiateDriver() {
        String SYSTEM_CHROME_DRIVER_VARIABLE = "webdriver.chrome.driver";
        String PASS_TO_DRIVER_NAVIGATION = "C:\\Users\\Njuta\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty(SYSTEM_CHROME_DRIVER_VARIABLE, PASS_TO_DRIVER_NAVIGATION);
    }

    @After
    public void closeDriver() {
        driver.close();
    }

    @Before
    public void initWebDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        MainPage mainPage;
        InTheChart inTheChart;
        ProductSelectionPage productSelectionPage;
        driver.get("http://automationpractice.com/index.php");
        mainPage = new MainPage(driver);
        mainPage.enterSearch("Blouse");
        productSelectionPage = mainPage.pushSearch();
        productSelectionPage.selectViewModeList();
        productSelectionPage.addToCart();
        ProductSelectionPage.ProceedToCheckout proceedToCheckout = productSelectionPage.addToCart();
        proceedToCheckout.proceedToCheckout();
        inTheChart = proceedToCheckout.proceedToCheckout();
        inTheChart.increaseTheNumber();
        Assert.assertEquals(
                inTheChart.getTotalForChooseProducts(),
                "$54.00");
        Assert.assertEquals(
                inTheChart.getTotalForChooseProducts(),
                "$54.00");
        Assert.assertEquals(
                inTheChart.getTotalForChooseProducts(),
                "$54.00");
        Assert.assertEquals(
                inTheChart.getTotalForChooseProducts(),
                "$54.00");



    }
}
