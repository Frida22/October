package Lesson9Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSelectionPage {

    private WebDriver driver;
    private final int WEB_DRIVER_WAIT_SECOND = 5;
    @FindBy(css = "#list")
    private WebElement viewModeListButton;
    @FindBy(css = "a.button.ajax_add_to_cart_button")
    private WebElement addToCartButton;
    private final Wait<WebDriver> wait;

    ProductSelectionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait  = new WebDriverWait(driver, WEB_DRIVER_WAIT_SECOND);
    }

    public void selectViewModeList() {
        wait.until(ExpectedConditions.elementToBeClickable(viewModeListButton));
        viewModeListButton.click();
    }

    public ProceedToCheckout addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
        return new ProceedToCheckout(this.driver);
    }
}

