package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeMap;

public class LunchBrowser {

    public static void main(String[] args) throws InterruptedException {
// declare the instance of WebDriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        // use the driver.get method
        // note: in this level we have to write the complete URL like blew
        driver.get("https://www.google.com");
        //driver.get("https://www.fb.com");

        //maximize ur window
        driver.manage().window().maximize();

        //get th eURL of the    Website
        String currentUrl= driver.getCurrentUrl();
        System.out.println("the current url is: "+currentUrl);

        // get the title
        String title= driver.getTitle();
        System.out.println("the title of the page is : "+title);

        //added a wait for 2 seconds to slow the closing of window
        // delete the sleep after u are done with the script
        Thread.sleep(5000);
        // close the browser
        driver.quit();


    }
}
