package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeMap;

public class navagitionCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        //go to google.com
        driver.get("https://www.google.com");

        // maximize the window
        driver.manage().window().maximize();

        //slow down to observe the process
        Thread.sleep(2000);

        //go to facebook.com
        driver.navigate().to("https://www.facebook.com");

        //slow down to observe
        //note: it means when the facebook page open then go back it need time to wait
        //then go back
        Thread.sleep(2000);

        // go back
        driver.navigate().back();

        //slow down to observe
        Thread.sleep(2000);

        // go forward
        driver.navigate().forward();

        //slow down to observe
        Thread.sleep(2000);

        // refresh the app
        driver.navigate().refresh();

        // close the app
        driver.close();




    }
}
