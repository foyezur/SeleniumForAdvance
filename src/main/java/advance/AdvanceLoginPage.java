package advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvanceLoginPage {
    @FindBy(xpath = "//*[@id='header']//a[@ class='login']")
    WebElement siginButton;
    @FindBy(name = "email")
    WebElement emailsendkeys;
    @FindBy(name = "passwd")
    WebElement passwdsendkeys;
    @FindBy(css = "#SubmitLogin > span")
    WebElement SiginSubmitButton;

    public AdvanceLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void InvalidSignIn(){
        siginButton.click();
        emailsendkeys.sendKeys("test4@gmail.com");
        passwdsendkeys.sendKeys("12345qhwe");
        SiginSubmitButton.click();
        //this is new work

    }

}

