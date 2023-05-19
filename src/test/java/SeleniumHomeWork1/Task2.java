package SeleniumHomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// HW2:
//navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//enter the username "Tester"
//enter the password "test"
//get the title of the webPage and confirm that it is  "Web Orders Login"
public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(1000);

        String title = driver.getTitle();
        if(title.equals("Web Orders Login")){
            System.out.println("The title of this Web page is " + title);
        }else{
            System.out.println("The title of this Web page is invalid");
        }





    }
}
