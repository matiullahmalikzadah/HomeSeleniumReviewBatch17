package Utiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class CommontMethods {
    public static WebDriver driver;

    public static void openBrowserAndLunchApplication(String url, String browser) {

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
    public static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);

    }

    public static WebDriverWait getWait(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        return wait;
    }

    public static void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(WebElement element){
        waitForClickability(element);
        element.click();
    }

}
