package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethod {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String url, String browser) {

        switch (browser) {
            case "Chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.get(url);

    }


    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();

        }
    }



    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }

    public static void selectFromDropdown(WebElement dd, int index) {
        Select sel = new Select(dd);
        sel.selectByIndex(index);
    }

    public static void selectFromDropdown(WebElement dd, String visibleText) {
        Select sel = new Select(dd);
        sel.selectByVisibleText(visibleText);
    }

    public static void selectFromDropdown(String value, WebElement dd) {
        Select sel = new Select(dd);
        sel.selectByValue(value);
    }


}