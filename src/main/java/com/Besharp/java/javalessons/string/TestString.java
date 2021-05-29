package com.Besharp.java.javalessons.string;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by Hmayak on 22, May, 2021.
 */
public class TestString {

    @Test
    void hamemati() {

        String expectedResult = "Transaction completed successfully";
        String actualResult = "Transaction completedsuccessfully";


        Assert.assertEquals(actualResult, expectedResult);
    }
}
