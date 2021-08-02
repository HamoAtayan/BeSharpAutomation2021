package com.Besharp.java.javalessons.HomewWork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hmayak Atayan on 27, July, 2021
 **/
public class Demo {
    public static void main(String[] args) {
        List<Mard> mard = new ArrayList<>();
        Mard tiko = new Mard(24,"Tiko");
        Mard hamik = new Mard(25,"hamik");
        Mard artur = new Mard(30,"artur");
        Mard valentina = new Mard(20,"valentina");
        mard.add(tiko);
        mard.add(hamik);
        mard.add(artur);
        mard.add(valentina);
        mard.add(tiko);
        System.out.println(3);
    }
}
