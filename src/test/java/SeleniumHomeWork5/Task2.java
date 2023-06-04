package SeleniumHomeWork5;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethod {
    // click on check box
    //then select bay cat from drop down
    //then enter text in text box (edited)
    public static void main(String[] args) throws InterruptedException {
        String url = "https://chercher.tech/practice/frames";
        String browser = "Chrome";
        openBrowserAndLaunchApplication(url, browser);


        driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame3']")));

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();


        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement cat = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(cat);
        sel.selectByVisibleText("Baby Cat");


        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.xpath("//input"));
        text.sendKeys("Animal Selection");


        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.quit();




    }
}
