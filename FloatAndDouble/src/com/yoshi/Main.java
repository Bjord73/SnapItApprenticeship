package com.yoshi;

import com.sun.jdi.Value;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        float myMinValue = Float.MIN_VALUE;
        float myMaxValue  = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinValue);
        System.out.println("Float maximum value = " + myMaxValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue  = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5 / 3d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue " + myDoubleValue);
    }
}
