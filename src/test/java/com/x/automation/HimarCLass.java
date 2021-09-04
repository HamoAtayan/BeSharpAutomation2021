package com.x.automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created By Hmayak on 2021, Sep, 04
 */
public class HimarCLass extends BaseTest {

    @Test
    void esiminchTest() {
        driver.findElement(By.id("login"));
        Humn hhh = new Humn(10, "Ashot");
        new Humn(10, "Ashot").getAge();


    }
}
