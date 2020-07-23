package advance;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdvanceClass3 {
    public WebDriver driver;



    public void init2() {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        // WebDriver driver;
        driver = new ChromeDriver() ;
        driver.get("http://automationpractice.com/index.php");

    }

}
