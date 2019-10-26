package Lesson9Homework2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    private WebDriver driver = new ChromeDriver();
    private WebElement searchInput = driver.findElement(By.cssSelector("#search_query_top"));
    private WebElement searchButton = driver.findElement(By.cssSelector(".btn.btn-default.button-search"));
    private WebElement viewModeListButton = driver.findElement(By.cssSelector("i.icon-th-list"));
    private WebElement addToCartButton = driver.findElement(By.cssSelector("a.button.ajax_add_to_cart_button"));
    private WebElement proceedToCheckoutButton = driver.findElement(By.cssSelector("a.btn.btn-default.button.button-medium"));
    private WebElement increaseTheNumberButton = driver.findElement(By.cssSelector("#cart_quantity_up_2_7_0_0"));
    private WebElement totalForChooseProductsField = driver.findElement(By.cssSelector("#total_product_price_2_7_0"));
    private WebElement totalProductsField = driver.findElement(By.cssSelector("#total_product"));
    private WebElement totalShippingField = driver.findElement(By.cssSelector("#total_shipping"));
    private WebElement totalField = driver.findElement(By.cssSelector("#total_price_without_tax"));
    private WebElement taxField = driver.findElement(By.cssSelector("#total_tax"));
    private WebElement tOTALField = driver.findElement(By.cssSelector("#total_price_container"));

    final String SYSTEM_CHROME_DRIVER_VARIABLE = "webdriver.chrome.driver";

    public Homework2(String passToDriverNavigation) {
        System.setProperty(SYSTEM_CHROME_DRIVER_VARIABLE, passToDriverNavigation);

    }
    public void openMainPage() {
        driver.navigate().to("http://automationpractice.com/index.php");

    }
    public void enterSearch(String productName){
        searchInput.click();
        searchInput.sendKeys(productName);
    }
    public void pushSearch(){
        searchButton.click();
    }
    public void selectViewModeList(){
        viewModeListButton.click();
    }
    public void addToCart(){
        addToCartButton.click();
    }
    public void proceedToCheckout(){
        proceedToCheckoutButton.click();
    }
    public void increaseTheNumber(){
        increaseTheNumberButton.click();
    }
    public String getTotalForChooseProducts(){
        return totalForChooseProductsField.getText();
    }
    public String getTotalProducts(){
        return totalProductsField.getText();
    }
    public String getTotalShippingField(){
        return totalShippingField.getText();
    }
    public String getTotalField(){
        return totalField.getText();
    }
    public String getTaxField(){
        return taxField.getText();
    }
    public String getTOTALField(){
        return tOTALField.getText();
    }
//    public void compareTotalForChooseProducts(){
//        String actual = totalForChooseProductsField.getText();
//        String expected = "$54.00";
//        Assert.assertEquals(actual, expected);
//    }
//    public void compareTotalProducts(){
//        String actual = totalProductsField.getText();
//        String expected = "$54.00";
//        Assert.assertEquals(actual, expected);

//    }



}
