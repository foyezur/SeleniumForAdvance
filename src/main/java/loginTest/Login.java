package loginTest;

import advance.AdvanceClass3;
import advance.AdvanceLoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends AdvanceClass3 {

    AdvanceLoginPage AdvanceLoginPage;
    @BeforeTest
    public void beforetest(){
        init2();
    }

    @Test
    public void verifyInvalidLogin() {
        AdvanceLoginPage= new AdvanceLoginPage(driver);
        AdvanceLoginPage.InvalidSignIn();
    }

    @AfterTest
    public void closebrowser(){
        driver.close();
        driver.quit();
    }
}
