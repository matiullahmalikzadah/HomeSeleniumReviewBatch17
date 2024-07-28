package Class08;

import Utiles.CommontMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTablefFinfToNextPage extends CommontMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/inbox.php/auth/login";
        String browser = "chrome";
        openBrowserAndLunchApplication(url, browser);

        //find the username
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        //find the password
        WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");

        //find the login button
        WebElement click = driver.findElement(By.xpath("//input[@name='Submit']"));
        click.click();

        //clicK on PIM
        WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();

        //-----------------table task-------------------
        //select the checkbox for the employee that has an id of to the next page	41840640

        boolean notfound = true;
        while (notfound) {
            //get the culam id in the list
            //note:if we want to search our id number or goal to the next next pages
            //then we have to bring the below code from top of boolean to this posation
            List<WebElement> idColum = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            //iterate
            for (int i = 0; i < idColum.size(); i++) {

                String id = idColum.get(i).getText();
                //compare if thet is my desired id
                if (id.equals("106292A")) {
                    //chick on the checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    notfound = false;
                    break;

                }
            }
            if (notfound) {
                WebElement nextPage = driver.findElement(By.xpath("//a[text()='Next']"));
                nextPage.click();
            }
        }
    }
}
