package Class09;

import Utiles.CommontMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;
import java.util.Date;
import java.util.List;

public class KEYS extends CommontMethods {

    public static void main(String[] args) throws InterruptedException {

        String url="https://syntaxprojects.com/keypress.php";
        String browser="chrome";
        openBrowserAndLunchApplication(url,browser);


        WebElement input = driver.findElement(By.xpath("//input[@class='form-control']"));
        input.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        input.sendKeys(Keys.TAB);

    }
}
