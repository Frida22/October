package Lesson9Homework1.Servis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public enum WebDriverFactory {
    CHROME {
        public WebDriver create() {
            return new ChromeDriver();
        }
    },
    EXPLORER {
        public WebDriver create() {
            return new InternetExplorerDriver();
        }
    },
    FIREFOX {
        public WebDriver create() {
            return new FirefoxDriver();
        }
    };

    public WebDriver create() {
        return null;
    }
}