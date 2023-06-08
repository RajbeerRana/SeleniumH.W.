package SeleniumHomeWork7;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task1 extends CommonMethod {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "Chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement login = driver.findElement(By.xpath("//input[@name='Submit']"));
        login.click();

        WebElement pim = driver.findElement(By.xpath("//b[text()='PIM']"));
        pim.click();

        //  print the row which has id 37412781

        List<WebElement> employeeId = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for (int i = 0; i < employeeId.size(); i++) {
            String singleEmpId = employeeId.get(i).getText();
            if (singleEmpId.equals("37412781")) {
                System.out.println("The Row number of 37412781 id is: " + (i + 1));
            }
        }

    }

}

