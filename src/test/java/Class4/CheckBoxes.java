package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver  =new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        //select the check box
        WebElement inbox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        inbox1.click();

        //if it is selected after click
        boolean selectStatus = inbox1.isSelected();
        if (selectStatus){
            System.out.println("the checkbox is selected");
        }else {
            System.out.println("the checkbox is not selected");
        }

        //select all option
        List<WebElement> inbox2 = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement hh:inbox2){
            //click on it
            hh.click();
        }
        // deselect option 3
        for (WebElement box3:inbox2){

            //to verify what is the option
            String option = box3.getAttribute("value");
            if (option.equalsIgnoreCase("Option-3")){
                box3.click();
            }

        }





    }
}
