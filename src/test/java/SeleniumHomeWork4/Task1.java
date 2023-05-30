package SeleniumHomeWork4;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethod {

    // HW1:
    //goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
    //select , tuesday, thursday and friday one by one

    public static void main(String[] args) throws InterruptedException {
        CommonMethod.openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php","Chrome");
       WebElement days = driver.findElement(By.xpath("//select[@id='select-demo']"));
       days.click();

        Select sel = new Select(days);
        sel.selectByVisibleText("Tuesday");
        Thread.sleep(2000);
        sel.selectByValue("Thursday");
        Thread.sleep(2000);
        sel.selectByIndex(6);
        Thread.sleep(2000);

        driver.quit();


    }
}
