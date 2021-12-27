package com.yoshi;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00a9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + 49.95;
        System.out.println(numberString);
        String lasString = "10";
        int myInt = 50;
        lasString = lasString + myInt;
        System.out.println("LastString is equal to " + lasString);
        double doubleNumber = 120.47d;
        lasString = lasString + doubleNumber;
        System.out.println("LastString is equal to " + lasString);

        // practice
        String noString = "this is how it goes";
        System.out.println("you get the printout " + noString);

        //tried to add two string but could not get a space
        String oneString = "this plus the other";
        System.out.println("them both " + noString  +  oneString);


    }
}
