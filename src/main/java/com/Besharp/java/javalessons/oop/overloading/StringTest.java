package com.Besharp.java.javalessons.oop.overloading;

public class StringTest {
    static String xpath;
    static  String sqlQuery;

    public static void main(String[] args) {
        String test = new String("asd");
        String test2 = new String("asd");
        String test3 = "asd";
        String test4 = "asd";

        xpath = "//div/tr/td/%d";

         sqlQuery = "SELECT * FROM Customers\n" +
                "WHERE Country='%s'";

        String a = "a";
        String b = "b";
        String c = "c";
        System.out.println(a + b + c);

        System.out.println(test == test2);
        System.out.println(test3 == test2);
        System.out.println(test3 == test);
        System.out.println(test3 == test4);


 String text  = getElementByRow(10);
        System.out.println(text);

        System.out.println(getSqlQueryWithParam("Yerevan"));
    }

   static String getElementByRow(int row) {
//        return  xpath + row;
       return String.format(xpath, row);
    }

    static String getSqlQueryWithParam(String country){
        return String.format(sqlQuery,country);
    }
}
