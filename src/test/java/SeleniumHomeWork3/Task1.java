package SeleniumHomeWork3;


import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utils.CommonMethod.driver;

public class Task1 extends CommonMethod {

    // HW1:
    //Open chrome browser
    //Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
    //fill in the complete form (edited)
    //[10:17 PM]
    public static void main(String[] args) throws InterruptedException {

        CommonMethod.openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/input-form-demo.php","Chrome");
        driver.findElement(By.xpath("//input[@name='first_name'] ")).sendKeys("Rajbeer");
        driver.findElement(By.xpath("//input[@name='last_name'] ")).sendKeys("Rana");
        driver.findElement(By.xpath("//input[@placeholder='E-Mail Address'] ")).sendKeys("Rajbeer@gmail.com");
        driver.findElement(By.xpath("//input[@name='phone'] ")).sendKeys("3455452544");
        driver.findElement(By.xpath("//input[@name='address'] ")).sendKeys("15Toronto");
        driver.findElement(By.xpath("//input[@data-bv-field='city'] ")).sendKeys("Scarborough");
        WebElement states = driver.findElement(By.xpath("//select[@name='state']"));
        Select sel = new Select(states);
        sel.selectByVisibleText("Alaska");
        driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("M1J567");
        driver.findElement(By.xpath("//input[@name='website']")).sendKeys("http://www.Badshah.com");
        driver.findElement(By.xpath("//input[@value='no']")).click();
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("First Selenium Project");
        Thread.sleep(2000);
        driver.quit();



    }
}
