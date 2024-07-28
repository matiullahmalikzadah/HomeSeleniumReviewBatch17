package Class08;

import Utiles.CommontMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.font.FontRenderContext;
import java.util.List;

public class calendarWithPagination extends CommontMethods {
    public static void main(String[] args) {

        String url = "https://www.aa.com/homePage.do";
        String browser = "chrome";
        openBrowserAndLunchApplication(url, browser);

        WebElement clickTable = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        clickTable.click();

        boolean notfound = true;
        while (notfound) {
            //find the mont
            WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            String currentMonth = month.getText();
            if (currentMonth.equals("July")) {
                List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
                for (WebElement date:dates) {
                    String currentDate = date.getText();
                    if (currentDate.equals("5")) {
                        date.click();
                        break;
                    }
                }
                notfound=false;
            } else {
                WebElement next = driver.findElement(By.xpath("//a[@data-handler='next']"));
                next.click();
            }

        }




    }
}
