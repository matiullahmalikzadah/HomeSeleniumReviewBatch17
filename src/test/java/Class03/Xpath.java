package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.List;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/Xpath.php");
        driver.manage().window().maximize();
        
        //find the 
        WebElement textBox1 = driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("batch17");

        WebElement inbox3=driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        inbox3.sendKeys("Batch18");

        WebElement inbox4=driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(inbox4.getText());

        WebElement inbox5=driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        inbox5.sendKeys("Batch21");

        WebElement inbox6=driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        inbox6.sendKeys("Batch22");

        WebElement inbox7=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        inbox7.sendKeys("Batch23");

        WebElement inbox8=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        inbox8.sendKeys("Batch24");

        WebElement inbox9=driver.findElement(By.xpath("(//input[@name='customField'])[1]"));
        inbox9.sendKeys("Batch25");

        WebElement INBOX26=driver.findElement(By.xpath("(//input[@name='customField'])[2]"));
        INBOX26.sendKeys("Batch27");

        WebElement inbox11=driver.findElement(By.xpath("(//input[@name='customField1'])[1]"));
        inbox11.sendKeys("Batch22");

        WebElement inbox12=driver.findElement(By.xpath("(//input[@name='customField1'])[2]"));
        inbox12.sendKeys("Batch23");






    }
}
