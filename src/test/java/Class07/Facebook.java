package Class07;

import Utiles.CommontMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Facebook extends CommontMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="https://www.facebook.com";
        String browser="chrome";
        openBrowserAndLunchApplication(url,browser);


        //find the button to create new account
        WebElement login = driver.findElement(By.xpath("//a[text()='Create new account']"));
        login.click();

        //find and add your first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Matiullah");



    }
}
