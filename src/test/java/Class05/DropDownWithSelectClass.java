package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownWithSelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

//find the drop down or locate driop down
        WebElement dropDown = driver.findElement(By.xpath("//Select[@id='select-demo']"));

        //create object to select class and pass the add element
        Select sel=new Select(dropDown);

        //use any methode of inbox(), visibaleTex, byValue to select ur desired option
        sel.selectByVisibleText("Friday");
        Thread.sleep(3000);
        sel.selectByValue("Thursday");
        Thread.sleep(3000);
        sel.selectByIndex(2);

        //just an example to show how the get options will work is not including the class
        List<WebElement> options = sel.getOptions();
        for (WebElement option:options){
            System.out.println(option.getText());
            //i want click on all the option
            Thread.sleep(2000);
            option.click();
        }


    }
}
