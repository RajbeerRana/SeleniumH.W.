package SeleniumHomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    // HW1:
    //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //close the browser
    //Note: use name or id as locators
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Bruce");
        driver.findElement(By.name("customer.lastName")).sendKeys("Wayne");
        driver.findElement(By.id("customer.address.street")).sendKeys("1007 Mountain Drive ");
        driver.findElement(By.name("customer.address.city")).sendKeys("Gotham");
        driver.findElement(By.id("customer.address.state")).sendKeys("East Seaboard ");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("GA1940");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("364442348778");
        driver.findElement(By.id("customer.ssn")).sendKeys("784****");
        driver.findElement(By.id("customer.username")).sendKeys("Bru@night");
        driver.findElement(By.id("customer.password")).sendKeys("kghshs785");
        driver.findElement(By.name("repeatedPassword")).sendKeys("yes");

        Thread.sleep(5000);
        driver.quit();



    }
}
