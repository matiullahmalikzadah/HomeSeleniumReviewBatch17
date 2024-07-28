package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class MultipleDD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        //find the element
        WebElement dropD = driver.findElement(By.xpath("//Select[@id='multi-select']"));
        //crete the object to select class
        Select D = new Select(dropD);
        //select
        D.selectByVisibleText("Pennsylvania");
        Thread.sleep(2000);
        D.selectByValue("Florida");
        Thread.sleep(2000);
        D.selectByIndex(4);
        Thread.sleep(3000);

        //Deselect
        D.deselectByIndex(4);
        //check wether the dropdown is multiple or not
        System.out.println(D.isMultiple());

    }
}
