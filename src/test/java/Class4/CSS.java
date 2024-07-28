package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

    public static void main(String[] args) {
        WebDriver driver  =new ChromeDriver();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        driver.manage().window().maximize();

        WebElement inbox1=driver.findElement(By.cssSelector("input[id='profileID']"));
        inbox1.sendKeys("Matiullah");

        WebElement inbox2= driver.findElement(By.cssSelector("input#profileBox"));
        inbox2.sendKeys("Halal");

        WebElement inbox3=driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        inbox3.sendKeys("Jan");

        WebElement inbox4=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        inbox4.sendKeys("Khan");

        WebElement inbox5=driver.findElement(By.cssSelector("input[name*='contentInput']"));
        inbox5.sendKeys("Shaaaan");

        WebElement inbox6=driver.findElement(By.cssSelector("input[name^='Int']"));
        inbox6.sendKeys("Syntax");

        WebElement inbox7=driver.findElement(By.cssSelector("input[name$='put']"));
        inbox7.sendKeys("Boot camp");




    }
}
