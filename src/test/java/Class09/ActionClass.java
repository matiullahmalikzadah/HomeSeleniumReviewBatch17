package Class09;

import Utiles.CommontMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionClass extends CommontMethods {
    public static void main(String[] args) {
        String url="https://syntaxprojects.com/simple_context_menu.php";
        String browser="chrome";
        openBrowserAndLunchApplication(url,browser);

        WebElement hover = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action=new Actions(driver);
        action.moveToElement(hover).perform();

    }
}
