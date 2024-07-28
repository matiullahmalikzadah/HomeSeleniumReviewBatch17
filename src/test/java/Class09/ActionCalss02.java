package Class09;

import Utiles.CommontMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionCalss02 extends CommontMethods {
    public static void main(String[] args) {
        String url="http://demo.guru99.com/test/simple_context_menu.html";
        String browser="chrome";
        openBrowserAndLunchApplication(url,browser);

        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClick).perform();


    }
}
