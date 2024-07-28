package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        driver.manage().window().maximize();

        //locate webelement the First name
        WebElement firstname = driver.findElement(By.id("first_name"));
        //use send to send the data website
        firstname.sendKeys("Matiullah");

        //locate the elemenet the lsat name
       WebElement lastname = driver.findElement(By.name("last_name"));
        lastname.sendKeys("mahmood");
        //for observation
        Thread.sleep(2000);
        //if we want clear this massage and rewrite other one
        lastname.clear();
        lastname.sendKeys("Malikzadah");

        // locate the element Email
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("malikzadahmatiullah@gmail.com");

        /*/locate the button and click on it
        WebElement submitBtn = driver.findElement(By.tagName("button"));
        submitBtn.click();*/

        // locate the webelement LINK
        WebElement link = driver.findElement(By.linkText("Link"));
        link.click();

        // locate the element click here using partial link text
        WebElement clickHere = driver.findElement(By.partialLinkText("Click Here."));
        clickHere.click();



    }
}
