package com.x.automation;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EsimnichTest extends BaseTest {
    @Test
    public void validLogin_TC1() {
        driver.get("https://staff.am/");
        //login functionality
        Assert.assertEquals(driver.getCurrentUrl(),"https://staff.am/", "not in home page");
    }

    @Test(priority = 2)
    void ablabla() {
        //some code
        driver.get("https://staff.am/");

        Assert.assertEquals(driver.getCurrentUrl(),"https://staff.am/", "not in home page");

    }

    @Test(priority = 1)
    void blablabla2() {
        //some code
        driver.get("https://staff.am/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://staaff.am/", "not in home page");

    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @AfterMethod
    void after(){
        System.out.println("after method");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("beforeClass");
    }
}
