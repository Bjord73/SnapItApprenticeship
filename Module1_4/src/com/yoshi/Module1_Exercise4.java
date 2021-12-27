package com.yoshi;

import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class Module1_Exercise4 {
    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        //LeapYear();
        //CheckAge();


    }

    public static void LeapYear() {
        System.out.println("Enter a 21st century number here:");

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int length = String.valueOf(k).length();
        try {
            if (length == 4 && k % 4 == 0) {
                System.out.println("That's a leap year");
            } else if (length != 0) {
                System.out.println(" Entry invalid, try again");
            } else if (length == 0 && k % 4 != 0) {
                System.out.println("That's not leap year");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void CheckAge() {
        int age = 15;

            if(age < 21) {
                throw new ArithmeticException("Person can have liquor");
            } else {
                System.out.println("Person not old enough to drink liquor");
            }
        }

    }
