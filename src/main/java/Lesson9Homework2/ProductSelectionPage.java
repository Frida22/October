package Lesson9Homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSelectionPage{
    private WebDriver driver;
    @FindBy(css="i.icon-th-list")
    private WebElement viewModeListButton;
    @FindBy(css="a.button.ajax_add_to_cart_button")
    private WebElement addToCartButton;

    public ProductSelectionPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void selectViewModeList() {
        viewModeListButton.click();
    }

    public ProceedToCheckout addToCart() {
        addToCartButton.click();
        return new ProceedToCheckout(driver);
    }


    public class ProceedToCheckout{
        private WebDriver driver;
        public ProceedToCheckout(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(css="a.btn.btn-default.button.button-medium")
        private WebElement proceedToCheckoutButton;

        public InTheChart proceedToCheckout() {
            proceedToCheckoutButton.click();
            return new InTheChart(driver);
        }

    }
}
