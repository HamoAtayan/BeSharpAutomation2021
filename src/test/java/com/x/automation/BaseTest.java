package com.x.automation;

import automation.InitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;

//    @BeforeTest // 1
//    @BeforeGroups // 2
//    @BeforeSuite // 3
//    @BeforeClass // 4
//    @BeforeMethod //5

    //same with after

//    @AfterTest

    @BeforeMethod
    protected void initDriver() {
        InitDriver initDriver = new InitDriver();
        driver = initDriver.getDriver();
    }

    @AfterMethod
    protected void quitDriver() {
        driver.quit();
    }

    @BeforeClass
    void beforeBase() {
        System.out.println("beforeBase");
    }
}
