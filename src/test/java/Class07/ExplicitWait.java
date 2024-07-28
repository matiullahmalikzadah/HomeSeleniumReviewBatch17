package Class07;

import Utiles.CommontMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait extends CommontMethods {
    public static void main(String[] args) {

        String url="https://syntaxprojects.com/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLunchApplication(url, browser);

        WebElement Click = driver.findElement(By.xpath("//button[@id='enable_button']"));
        Click.click();
        //as the button takes some time to be clickable
        //i will wait until it is clickable using explicit wait

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

        //wait is over then the following lines will be executed
        WebElement Clickenable = driver.findElement(By.xpath("//button[text()='Button']"));
        Clickenable.click();

        //click to alert button so alert appears
        WebElement Click2 = driver.findElement(By.xpath("//button[@id='show_alert']"));
        Click2.click();
        //i need a wait for alert to be present
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


    }
}
