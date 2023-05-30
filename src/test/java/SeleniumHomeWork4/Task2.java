package SeleniumHomeWork4;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethod {
    // hw2:
    //goto facebook.com
    // click on create account
    //and select the your  date of birth using select class

    public static void main(String[] args) throws InterruptedException {
        CommonMethod.openBrowserAndLaunchApplication("https://www.facebook.com/","Chrome");
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        Thread.sleep(2000);

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select sel = new Select(month);
        sel.selectByIndex(5);

        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel1 = new Select(days);
        sel1.selectByVisibleText("17");

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select sel2 = new Select(year);
        sel2.selectByValue("1991");

        Thread.sleep(2000);

        driver.quit();
    }
}
