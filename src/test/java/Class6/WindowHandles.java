package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {


    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=AS5LTARxqFvh0SlArEyltPxP2i_C9d2sJSZwGuvCI9MFsaJxtmSZIhTjBL3t08piolm-U9wOfflxOA&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S2097723293%3A1719514361485429&ddm=0");
        driver.manage().window().maximize();

        //click on help
        WebElement helpbox = driver.findElement(By.xpath("//a[text()='Help']"));
        //click on privacy
        WebElement privacybox = driver.findElement(By.xpath("//a[text()='Privacy']"));
        helpbox.click();
        privacybox.click();

        // Task1
        // get the window handle of the mainpage i.e gamil.com and print it out on console
        String gamilHandle = driver.getWindowHandle();
        System.out.println(gamilHandle);

        //Task2
        //switch the focus of your webdriver to thr privacy wndow

        //get all the handles and find the desired one
        Set<String> allHandles = driver.getWindowHandles();

        //loop through all the handles and find the one that is desired
        for (String handle:allHandles){
            //switch to the first handle in list
            driver.switchTo().window(handle);
            //get the title of the window on wich the fosuce is
            String title = driver.getTitle();

            //checkif the title matches ur desired title, if yes break the loop, if no repeat the process
            if (title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
