package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        // find the email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("feraj feraji");

        //inter password
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("12357wt");

        //find the login button
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();


    }
}
