package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameExample2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe.php#");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        WebElement box = driver.findElement(By.xpath("//input[@name='Topic']"));
        box.sendKeys("this is the first topic");


        driver.switchTo().frame("checkboxIframe");
        WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
        check.click();

        driver.switchTo().defaultContent();
        WebElement box2 = driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
        driver.switchTo().frame(box2);


        WebElement inbox3 = driver.findElement(By.xpath("//iframe[@id='dropdownIframe']"));
        Select sel=new Select(inbox3);
        sel.selectByVisibleText("Big Baby Cat");



    }
}
