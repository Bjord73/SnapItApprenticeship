package com.yoshi;

import java.awt.*;

public class Main {


    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        cars();


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }
        return -1;


        // Print out a score on the screen with the following
        // score set to 1000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well
        /*boolean gameOverTwo = true;
        int secondScore = 10000;
        int levelCompletedTwo = 8;
        int bonusTwo = 200;
        if (secondScore < 50000 && score > 10000) { // if = true
            System.out.println("Your score was less than 50000 but greater then 10000");
        } else if (score < 10000) {
            System.out.println("Your score was less then 10000");
        } else { // else = false
            System.out.println("Got here");
        }

        if (gameOverTwo) {
            int finalScoreTwo = secondScore + (levelCompletedTwo * bonusTwo);
            System.out.println("Your final score was " + finalScoreTwo);
           } */

        /* else if.. example
        int topPlayer = 5000;
        if (topPlayer > 8000) {
            System.out.println("topPlayer score is greater then 4000 but less then 10k");
        } else if (topPlayer < 10000 && topPlayer > 4000) {
            System.out.println("Score less then 10k but more then 4k");
        } else {
            System.out.println("Score < 4000");
        }
        /* else if,,, example.
        int numberOneScore = 125000;
        if (numberOneScore > 200000) {
            System.out.println("Number1Score greater than 200k");
        } else if (numberOneScore < 200000 && numberOneScore < 100000) {
            System.out.println("Number 1 Score > 200k");
        } else {
            System.out.println("Your score is 125k");
        }    */
    }

    public static void cars() {


        String goOver200Mph = "HyperCars";
        System.out.println(goOver200Mph);

        //car options
        String HyperCars = "Ferrari, Lamborghini, BentleyGt";
        System.out.println("Our 200+ mph cars: " + HyperCars);

        String rerrai = "Ferrari";
        String lambo = "Lamborghini";
        String benzo = "BentleyGt";



            //each car color personal list
            String modelColorList = "CarsColor";
            System.out.println(modelColorList + " Each Selection has it's own: ");


            String FerrariOption = modelColorList + " Choose your color: " + "Red, Yellow, White, Silver, Black";
            System.out.println(FerrariOption);

            String LamborghiniOptions = modelColorList + " Choose your color: " + "Red, Yellow, Blue, Silver, Lime Green ";
            System.out.println(LamborghiniOptions);

            String BentleyGtOption = modelColorList + " Choose your color: " + "Burnt Orange, Blue, Pearl, Silver, Tan ";
            System.out.println(BentleyGtOption);


            //car color list
            String paints = "color1, color2, color3, color4, color5, color6, color7, color8, color9";
            System.out.println(paints);

            String color1 = "red";
            String color2 = "Blue";
            String color3 = "Silver";
            String color4 = "White";
            String color5 = "Black";
            String color6 = "Lime Green";
            String color7 = "Burnt Orange";
            String color8 = "Tan";
            String color9 = "Pearl";


            //interior selection
            String interiorOptions = "Leathers";
            System.out.println("Select your interior: " + interiorOptions);

            String peanut = "PeanutButter";
            String burg = "Burgundy";
            String white = "UltraWhite";
            String blk = "UltraBlack";
            String red = "CherryRed";
        System.out.println(peanut + " ," + burg + " ,"  + white + " ,"  + blk + " ,"  + red);


            //create your car here
            String carCreator = "Car Option: ";
            System.out.println(carCreator + "Your car has been made");





        //short-hand if..else
        /*
        int time = 50;
        String result = (time < 40)? "Good day." : "Good evening.";
        System.out.println(result);

        String Red = "redCar";
        String Green = "greenCar";
        String result2 = (Red == Green)? "Nice car." : "What car.";
        System.out.println(result2);

        int lucky = 77;
        int number = 0;
        String result3 = (lucky == number)? "lucky 7." : "number zero.";
        System.out.println(result3);

        String homeBurger = "home";
        String fastFoodBurger = "out";
        String result4 = (homeBurger != fastFoodBurger)? "Home food better" : "I guess fast food win";
        System.out.println(result4);

         */

        String car = "vehicleTwo";
        switch (car) {
            case "vehicleOne":
                System.out.println("Charger");
                break;
            case "vehicleTwo":
                System.out.println("Challenger");
                break;
            case "vehicleThree":
                System.out.println("GTO");
                break;
            case "vehicleFour":
                System.out.println("Mustang");
                break;

}       }
        }
