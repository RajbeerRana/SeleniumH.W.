package SeleniumHomeWork6;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 extends CommonMethod {


    public static void main(String[] args) {

        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="Chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement btn1 = driver.findElement(By.xpath("//button[@id='startButton']"));
        btn1.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.textToBePresentInElement(text,"Welcome Syntax Technologies"));
        System.out.println("THe displayed message is: " + text.getText());
        driver.quit();





    }

}
