package com.Besharp.java;

public class MaxAndMin {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,9};
        int max=0;
        for (int tiv: arr
             ) {
            if (tiv>max){
                max = tiv;
            }

        }
        System.out.println(" = "  + max);
    }
}
