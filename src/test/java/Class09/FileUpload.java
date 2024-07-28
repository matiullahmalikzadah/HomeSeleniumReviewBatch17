package Class09;

import Utiles.CommontMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommontMethods {
    public static void main(String[] args) {
        String url="https://syntaxprojects.com/upload-image.php";
        String browser="chrome";
        openBrowserAndLunchApplication(url,browser);

        // find the upload element
        WebElement upload = driver.findElement(By.xpath("//input[@id='image-file']"));
         upload.sendKeys("C:\\Users\\malik\\OneDrive\\Desktop\\mat.png");


    }
}
