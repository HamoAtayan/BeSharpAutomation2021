package com.Besharp.java.javalessons.javacollections;

import java.util.Comparator;

/**
 * Created by Hmayak Atayan on 17, July, 2021
 **/
public class ExperianceComparator implements Comparator<Mard> {
    @Override
    public int compare(Mard m1, Mard m2) {
        if (m1.getWorkExperiance() == m2.getWorkExperiance())
            return 0;
        else if (m1.getWorkExperiance() > m2.getWorkExperiance())
            return 1;
        else
            return -1;
    }

}
