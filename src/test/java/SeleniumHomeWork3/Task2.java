package SeleniumHomeWork3;

import Utils.CommonMethod;
import org.openqa.selenium.By;

import static Utils.CommonMethod.driver;

public class Task2 {
    // Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
    //Enter valid username
    //Leave password field empty
    //Click on login button
    //Verify error message with text “Password cannot be empty” is displayed. (edited)

    public static void main(String[] args) {
        CommonMethod.openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D","Chrome");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        var message =driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        if(message.getText().equals("Password cannot be empty")){
            System.out.println("Error message is verified");
        }else{
            System.out.println("Error message is invalid");
        }
        driver.quit();
    }
}
