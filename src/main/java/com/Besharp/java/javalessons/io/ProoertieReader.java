package com.Besharp.java.javalessons.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Hmayak Atayan on 26, June, 2021
 **/
public class ProoertieReader {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("src/main/java/app.properties");
        properties.load(fileReader);
        String username = properties.getProperty("username");
        String paswword = properties.getProperty("pass");
        System.out.println(username);
        System.out.println(paswword);
    }
}