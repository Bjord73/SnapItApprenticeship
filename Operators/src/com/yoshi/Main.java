package com.yoshi;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3; //30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result -2;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }
        //example
        boolean isBranBigMoney = true;
        if (isBranBigMoney == true) {
            System.out.println("Bran aint Big Money yet");
            System.out.println("But he is own his way");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if ((topScore < secondTopScore && topScore < 100)) {
            System.out.println("Greater then second top " +
                    "score and less then 100");
        }

        if ((topScore < 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the " +
                    "of the conditions are true");

            //example
            int kaiLevel = 1000;
            if (kaiLevel < 2000) {
                System.out.println("1 million to even greater height");
            }

            //example
            int kaiLevelTwo = 1500;
            if (kaiLevel < kaiLevelTwo && kaiLevel < 1500) {
                System.out.println("Kai level two is 5 thousand" +
                        " times bigger");
            }

            if ((kaiLevel > 1500) || (kaiLevelTwo > 1000)) {
                System.out.println("Kai level two is greater then kai level");

            }

            int fewFolks = 5;
            if (fewFolks < 10) {
                System.out.println("A few is not many");
            }

            int manyFolks = 15;
            if ((manyFolks < 20) && (fewFolks < 10)) {
                System.out.println("Many is more then few");
            }
            if ((fewFolks > 3) || (manyFolks > 9)) {
                System.out.println("Folks is few but more is many to");
            }

            int winnerNumber = 8;
            if (winnerNumber < 10) {
                System.out.println("We winners!");
            }

            int underDogNumber = 4;
            if ((winnerNumber > 6) && (underDogNumber > 2)) {
                System.out.println("Keep trying");
            }

            if ((winnerNumber < 7) || (underDogNumber < 3)) {
                System.out.println("Under dogs on top");
            }
            // == is for testing not assigning
            int newValue = 50;
            if (newValue == 50) {
                System.out.println("This is true");
            }
            // testing isCar == is true or false
            boolean isCar = false;
            if (isCar == true) {
                System.out.println("THis is not supposed happen");
            }

            isCar = true;
            boolean wasCar = isCar ? true : false;
            if (wasCar) {
                System.out.println("wasCar is true");
            }

            // ! test to see if false is false
            boolean isBranGreat = false;
            if (!isBranGreat) {
                System.out.println("Bran is the man");
            }
            isBranGreat = true;
            boolean isntBranGreat = isBranGreat ? true : false;
            if (isntBranGreat) {
                System.out.println("Brand the best!");
            }

            boolean mostHighIsGood = false;
            if (mostHighIsGood) {
                System.out.println("Yes he is, Always");
            }

            mostHighIsGood = true;
            boolean almightyMostHigh = mostHighIsGood ? true : false;
            if (almightyMostHigh) {
                System.out.println("was it true");
            }

            boolean isTheColorGreen = false;
            if (isTheColorGreen == true) {
                System.out.println("what color is the car");
            }
            // ternary operator aka assigning two opps shortcut
            isTheColorGreen = false;
            boolean blue = isTheColorGreen ? true : false;
            if (blue) {
                System.out.println("The car is blue");
            }
            // ternary operator aka assigning two opps shortcut
            boolean didIGo = false;
            if (didIGo = true) {
                System.out.println("He went yo");
            }
            didIGo = true;
            boolean bruhWent = didIGo ? true : false;
            if (bruhWent) {
                System.out.println("I did see him");
            }
            // the real short cut!
            int ageOfClient = 20;
            boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
            System.out.println("Client is 20");
        }

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00;
        double allValues = (myFirstValue + mySecondValue) * 100.00;
        System.out.println("allValues = " + allValues);
        double remainder = allValues % 40.00;
        System.out.println("remainder = " + remainder);
        boolean notRemainder = (remainder == 0) ? true : false;
        System.out.println("notRemainder = " + notRemainder);
        if (!notRemainder) {
            System.out.println("got it");
        }
        /*
        double valueOne = 70.00d;
        double valueTwo = 170.00;
        double totalValue = valueOne + valueTwo * 200.00;
        System.out.println("totalValue = " + totalValue);
        double myRemainder = totalValue % 40.00;
        System.out.println("myRemainder = " + myRemainder);
        boolean noRemainder = (myRemainder == 30) ? true : false;
        if (!noRemainder) {
            System.out.println("Got some pop");
         */
        }
    }

