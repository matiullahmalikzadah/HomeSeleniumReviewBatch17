package Class07;

import Utiles.CommontMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Implicitwait extends CommontMethods {
    public static void main(String[] args) {

        String url="https://syntaxprojects.com/synchronization-waits.php";
        String browser="chrome";
        openBrowserAndLunchApplication(url,browser);

        //find the button and click on it
        WebElement click = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        click.click();

        //get the text
        WebElement text = driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
        String hh = text.getText();
        System.out.println(hh);

        WebElement click1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        click1.click();
        WebElement clickMan = driver.findElement(By.xpath("//input[@value='Male']"));
        clickMan.click();



    }
}
