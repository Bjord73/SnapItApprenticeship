package com.yoshi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //constructor with ()parameters
public static class Watch {
    String watchBand;
    String watchBandColor;
    String watchFaceColor;
    String watchGlass;
    String watchMetal;

    public Watch(String band, String bandColor, String faceColor, String glass, String metal) {

        watchBand = band;
        watchBandColor = bandColor;
        watchGlass = glass;
        watchFaceColor = faceColor;
        watchMetal = metal;
    }
}

    public static void main(String[] args) {
    Watch myWatch = new Watch("Leather", "Brown", "Green", "Crystal", "Gold" );
        System.out.println("My wrist watch has" + " " + myWatch.watchBand + " " + myWatch.watchBandColor + " Band, with a  " + myWatch.watchFaceColor
        + " face, an " + myWatch.watchGlass + " glass, an is " + myWatch.watchMetal);

               // System.out.print((10.5 + 2 * 3) / (45 – 35));
               // System.out.println(5 * 6);

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        // System.out.print("Enter three numbers: ");

         //double number1 = input.nextDouble();
        // double number2 = input.nextDouble();
         //double number3 = input.nextDouble();

        // double average = (number1 + number2 + number3) / 3;

        //System.out.println("The average of" + " " + number1 + " " + number2 + " " + number3 + " "  + "is" + " " + average);

        }
    }
