package Lesson9Homework2Test;

import Lesson9Homework2.InTheChart;
import Lesson9Homework2.MainPage;
import Lesson9Homework2.ProceedToCheckout;
import Lesson9Homework2.ProductSelectionPage;
import org.assertj.core.api.SoftAssertions;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Homework2Test {

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
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.enterSearch("Blouse");
        ProductSelectionPage productSelectionPage = mainPage.pushSearch();
        productSelectionPage.selectViewModeList();
        productSelectionPage.addToCart();
        ProceedToCheckout proceedToCheckout = productSelectionPage.addToCart();
        InTheChart inTheChart = proceedToCheckout.proceedToCheckoutPush();
        inTheChart.increaseTheNumber();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions
                .assertThat(inTheChart.getTotalForChooseProducts())
                .isEqualTo("$54.00");
        softAssertions
                .assertThat(inTheChart.getTotalProducts())
                .isEqualTo("$54.00");
        softAssertions
                .assertThat(inTheChart.getTotalShippingField())
                .isEqualTo("$2.00");
        softAssertions
                .assertThat(inTheChart.getTotalPriceLowerLetterField())
                .isEqualTo("$56.00");
        softAssertions
                .assertThat(inTheChart.getTaxField())
                .isEqualTo("$0.00");
        softAssertions
                .assertThat(inTheChart.getTotalPriceUpperLetterField())
                .isEqualTo("$56.00");
        softAssertions.assertAll();

    }
}
