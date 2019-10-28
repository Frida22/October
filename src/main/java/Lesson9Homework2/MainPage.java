package Lesson9Homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(css = "#search_query_top")
    private WebElement searchInput;
    @FindBy(css=".btn.btn-default.button-search")
    private WebElement searchButton;

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openMainPage() {
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    public void enterSearch(String productName) {
        searchInput.sendKeys(productName);
    }

    public ProductSelectionPage pushSearch() {
        searchButton.click();
        return new ProductSelectionPage(driver);
    }

}
