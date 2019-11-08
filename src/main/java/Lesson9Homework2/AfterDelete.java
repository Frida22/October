package Lesson9Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AfterDelete {

    private WebDriver driver;

    public AfterDelete(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String isChartEmpty(){
        int WEB_DRIVER_WAIT_SECOND = 5;
        final Wait<WebDriver> wait = new WebDriverWait(driver, WEB_DRIVER_WAIT_SECOND);
        wait.until(ExpectedConditions.textToBe(By.cssSelector("#center_column > p"),"Your shopping cart is empty."));
        return driver.findElement(By.cssSelector("#center_column > p")).getText();
    }
}
