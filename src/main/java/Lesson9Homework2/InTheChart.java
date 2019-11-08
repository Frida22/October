package Lesson9Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InTheChart {

    private WebDriver driver;
    @FindBy(css = "#cart_quantity_up_2_7_0_0")
    private WebElement increaseTheNumberButton;
    @FindBy(css = "#total_product_price_2_7_0")
    private WebElement totalForChooseProductsField;
    @FindBy(css = "#total_product")
    private WebElement totalProductsField;
    @FindBy(css = "#total_shipping")
    private WebElement totalShippingField;
    @FindBy(css = "#total_price_without_tax")
    private WebElement totalPriceLowerLetterField;
    @FindBy(css = "#total_tax")
    private WebElement taxField;
    @FindBy(css = "#total_price_container")
    private WebElement totalPriceUpperLetterField;
    @FindBy(xpath = "//*[@id=\"product_2_7_0_0\"]/td[5]/input[2]")
    private WebElement quantityNumber;
    @FindBy(css = "#product_2_7_0_0 > td.cart_delete.text-center")
    private WebElement deleteFromChartButton;

    InTheChart(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void increaseTheNumber() {
        increaseTheNumberButton.click();
    }

    public String getTotalForChooseProducts() {
        int WEB_DRIVER_WAIT_SECOND = 5;
        final Wait<WebDriver> wait = new WebDriverWait(driver, WEB_DRIVER_WAIT_SECOND);
        wait.until(ExpectedConditions.textToBe(By.cssSelector("#cart_title > span"), "Your shopping cart contains: 2 Products"));
        return totalForChooseProductsField.getText();
    }

    public String getTotalProducts() {
        return totalProductsField.getText();
    }

    public String getTotalShippingField() {
        return totalShippingField.getText();
    }

    public String getTotalPriceLowerLetterField() {
        return totalPriceLowerLetterField.getText();
    }

    public String getTaxField() {
        return taxField.getText();
    }

    public String getTotalPriceUpperLetterField() {
        return totalPriceUpperLetterField.getText();
    }

    public AfterDelete deleteFromChart() {
        deleteFromChartButton.click();
        return new AfterDelete(driver);
    }
}
