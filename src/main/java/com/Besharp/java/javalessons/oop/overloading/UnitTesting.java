package com.Besharp.java.javalessons.oop.overloading;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTesting {

    @Test
    public static void main(String[] args) {
        int tiv = 10;
        int ti2 = 1;

        Assert.assertEquals(11 ,sum(tiv,ti2) );
    }

  static   int sum(int a , int b){
      return a + b;
  }
}
