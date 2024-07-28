package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriver driver  =new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //select the radio button male
        WebElement radioBtMale=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        radioBtMale.click();
        //check if you were able to select the option or not
        boolean status = radioBtMale.isSelected();
        if (status){
            System.out.println("the radio button male was selected");
        }
        else {
            System.out.println("the radio button was not selected");

        }
            //check if the male radio button is enabled
            boolean btnEnabled = radioBtMale.isEnabled();
            System.out.println("the male radio button is enabled" +btnEnabled);

            //check if the male radio button is displayed
            boolean btnDesplayed = radioBtMale.isDisplayed();
            System.out.println("the male radio button is displayed" + btnDesplayed);

            //from the age select 5-15
            //find all the elements that have the age range

        List<WebElement> ageRanges = driver.findElements(By.xpath("//input[@name='ageGroup']"));


        for (WebElement ageRange:ageRanges){
            //get the value of the attribute "value"
            String option = ageRange.getAttribute("value");
            if (option.equalsIgnoreCase("5 - 15")){
                ageRange.click();
            }

        }


    }
}
