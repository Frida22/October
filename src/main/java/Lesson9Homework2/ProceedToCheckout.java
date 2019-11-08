package Lesson9Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProceedToCheckout {

    private WebDriver driver;
    @FindBy(css = "a.btn.btn-default.button.button-medium")
    private WebElement proceedToCheckoutButton;

    public ProceedToCheckout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public InTheChart proceedToCheckoutPush() {
        int WEB_DRIVER_WAIT_SECOND = 5;
        final Wait<WebDriver> wait = new WebDriverWait(driver, WEB_DRIVER_WAIT_SECOND);
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButton));
        proceedToCheckoutButton.click();
        return new InTheChart(driver);
    }
}
