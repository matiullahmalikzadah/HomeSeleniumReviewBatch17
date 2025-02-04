package Class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        //click on the first alert button and handle the alert
        WebElement alert1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(2000);

        //switch the focus of the driver to alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);

        //task2
        //click on the third alert, send some text there and press ok
        WebElement alert3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();

        alert.sendKeys("i am human");
        alert.accept();
        Thread.sleep(3000);

        //click on button 2 and handle the alert
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(2000);
        alert.dismiss();








    }
}
