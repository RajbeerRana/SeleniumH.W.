package SeleniumHomeWork2;

// HW  (only use XPATH)
//navigate to fb.com
//click on create new account
//fill up all the textboxes
//close the popup
//close the browser
//[10:19 PM]
//Note : in order for ur code to work
//u have to put Thread.sleep(2000) after clicking on Create me

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement open = driver.findElement(By.xpath("//a[text()='Create new account']"));
        open.click();
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.xpath("//input[ @name = 'firstname']"));
        firstName.sendKeys("Human");

        WebElement lastName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        lastName.sendKeys("1234fam");

        WebElement contactNumber = driver.findElement(By.xpath("//input[contains(@name,'reg')]"));
        contactNumber.sendKeys("6476379534");

        WebElement password = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
        password.sendKeys("hjdhu234");

        WebElement monthOfYear = driver.findElement(By.xpath("//select[@id = 'month']"));
        monthOfYear.sendKeys("April");

        WebElement dayOfMonth = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
        dayOfMonth.sendKeys("12");

        WebElement year= driver.findElement(By.xpath("//select[@name = 'birthday_year']"));
        year.sendKeys("2010");

        WebElement genderOfPerson= driver.findElement(By.xpath("//label[text() = 'Male']"));
        genderOfPerson.click();

        WebElement signUp= driver.findElement(By.xpath("//button[text() = 'Sign Up']"));
        signUp.click();

        WebElement close = driver.findElement(By.xpath("//img[@src= 'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']"));
        Thread.sleep(2000);
        close.click();

        driver.quit();



    }
}
