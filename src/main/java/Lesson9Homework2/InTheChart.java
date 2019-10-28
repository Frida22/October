package Lesson9Homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InTheChart {

    public InTheChart(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(css="#cart_quantity_up_2_7_0_0")
    private WebElement increaseTheNumberButton;
    @FindBy(css="#total_product_price_2_7_0")
    private WebElement totalForChooseProductsField;
    @FindBy(css="#total_product")
    private WebElement totalProductsField;
    @FindBy(css="#total_shipping")
    private WebElement totalShippingField;
    @FindBy(css="#total_price_without_tax")
    private WebElement totalPriceLowerField;
    @FindBy(css="#total_tax")
    private WebElement taxField;
    @FindBy(css="#total_price_container")
    private WebElement totalPriceUpperField;

    public void increaseTheNumber() {
        increaseTheNumberButton.click();
    }

    public String getTotalForChooseProducts() {
        return totalForChooseProductsField.getText();
    }

    public String getTotalProducts() {
        return totalProductsField.getText();
    }

    public String getTotalShippingField() {
        return totalShippingField.getText();
    }

    public String getTotalPriceLowerField() {
        return totalPriceLowerField.getText();
    }

    public String getTaxField() {
        return taxField.getText();
    }

    public String getTotalPriceUpperField() {
        return totalPriceUpperField.getText();
    }

}
