package com.yoshi;

public class Main {

    public static void main(String[] args) {

        byte smallByte = 127;
        short smallShort = 32767;
        int smallInt = 77777;

        long smallLong = 50000L + 10 * (smallByte + smallShort + smallInt);
        System.out.println(smallLong);

        //Type casting//
        short shortTotal = (short)(1000 + 10 *
                (smallByte + smallShort + smallInt));
    }
}
