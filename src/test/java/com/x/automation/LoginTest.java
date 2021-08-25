package com.x.automation;

import automation.Constants;
import automation.pages.HomePage;
import automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created By Hmayak on 2021, Aug, 25
 */
public class LoginTest extends BaseTest {

    @Test
    public void login() throws InterruptedException {
        driver.get("https://www.sas.am/");
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignIn();

        LoginPage loginpage = new LoginPage(driver);
        loginpage.setLogin("login@test.com");
        loginpage.setPassword("passpass");
        loginpage.clickOnAcceptCookies();
        loginpage.clickOnMutq();

        Assert.assertEquals(loginpage.getErorMessage(0), Constants.LOGIN_ERROR_MESSAGE);
    }
}