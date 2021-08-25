package com.x.automation;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest extends BaseTest {

    @Test(dataProvider = "getData")
    void testik(String userNAME, String password) {
        System.out.println(userNAME);
        System.out.println(password);
        driver.get("google.com");
        driver.findElement(By.id("login")).sendKeys(userNAME);
        driver.findElement(By.id("pass")).sendKeys(password);

    }

    @DataProvider(name = "getData")
    private Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "userName1";
        data[0][1] = "pvd";

        data[1][0] = "userName2";
        data[1][1] = "pvd2";

        data[2][0] = "userName3";
        data[2][1] = "pvd3";

        return data;
    }

    @Test(dataProvider = "getData2")
    private void testDataProvider(String tver) {
        System.out.println(tver);
    }

    @DataProvider(name = "getData3")
    private Object[][] getData3() {
        Object[][] data = new Object[3][2];
        data[0][0] = 1;
        data[0][1] = 2;

        data[1][0] = 2;
        data[1][1] = 4;

        data[2][0] = 3;
        data[2][1] = 5;

        return data;

    }
}
