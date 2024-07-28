package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe.php");
        driver.manage().window().maximize();

        //write down the topic
        //switch the iframe
        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("Hello every one");

        //click on the check box
        //using the name or id method
        driver.switchTo().frame("checkboxIframe");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        //switch to default
        //locate the frame u want to switch to
        driver.switchTo().defaultContent();
        WebElement framex = driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
        //switch to the frame
        driver.switchTo().frame(framex);


        WebElement animals = driver.findElement(By.xpath("//Select[@id='animals']"));
        //create an object of select class
        Select sel=new Select(animals);
        sel.selectByVisibleText("Baby Cat");


    }
}
