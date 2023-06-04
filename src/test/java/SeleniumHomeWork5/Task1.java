package SeleniumHomeWork5;

import Utils.CommonMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1 extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "Chrome";
        openBrowserAndLaunchApplication(url, browser);


        WebElement alert3Btn = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        alert3Btn.click();

        Thread.sleep(2000);

        Alert pass = driver.switchTo().alert();
        pass.sendKeys("Syntax");
        Thread.sleep(3000);
        pass.accept();

        driver.quit();

    }
}
