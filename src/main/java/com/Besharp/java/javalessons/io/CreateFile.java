package com.Besharp.java.javalessons.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by Hmayak Atayan on 26, June, 2021
 **/
public class CreateFile {
    static BufferedWriter writer;
    static BufferedReader reader;

    public static void main(String[] args) {
        new File("res").mkdir();
//        File file = new File("com.Besharp.java.javalessons.res/abc.txt");

        try {
//            boolean isCreated = file.createNewFile();
//            if (isCreated) {
//                System.out.println("created");
//            } else {
            System.out.println("file not created");
//            }
            FileOutputStream fout = new FileOutputStream("res/abc.txt");
            String hello = "Hello World";
            fout.write(hello.getBytes(StandardCharsets.UTF_8));
        } catch (IOException exception) {
            exception.getMessage();
        }

        fileWriter();

        System.out.println(fileReader());

        //try with resources
        //file path
        //write file
    }


    static void fileWriter() {

        try {
            String str = "World";
            writer = new BufferedWriter(new FileWriter("res/abc.txt", true));

            writer.write(" asd");

        } catch (IOException ex) {
            ex.getMessage();
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException exception) {
                exception.getMessage();
            }
        }
    }

    static String fileReader() {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("res/bbb.txt"))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    String username = fileReader();
}


