package Class08;

import Utiles.CommontMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class clander extends CommontMethods {
    public static void main(String[] args) {

        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/inbox.php/auth/login";
        String browser="chrome";
        openBrowserAndLunchApplication(url,browser);

        //find the username
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        //find the password
        WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");

        //find the login button
        WebElement click = driver.findElement(By.xpath("//input[@name='Submit']"));
        click.click();

        //click leave
        WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
        leave.click();

        //click the claneder
        WebElement clander = driver.findElement(By.xpath("//input[@id='calFromDate']"));
        clander.click();

        //se;ect th emonth
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        //use selecte class
        Select sel=new Select(month);
        sel.selectByVisibleText("Aug");

        //selecte the year
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        //Selecte the classs
        Select Ssel=new Select(year);
        Ssel.selectByVisibleText("1925");

        // get all the date
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));


        for (WebElement datte:dates){
            String text = datte.getText();

            if (text.equals("5")){
                datte.click();
                break;
            }

        }




    }
}
