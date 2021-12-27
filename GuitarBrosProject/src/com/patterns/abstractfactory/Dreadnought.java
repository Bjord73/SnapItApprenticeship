package com.patterns.abstractfactory;

public class Dreadnought implements AcousticInterface {
    @Override
    public String getHollowBody() {
        return "Guitar parts of the Acoustic. ";
    }

    @Override
    public String getSoundHole() {
        return "Guitar parts of the Acoustic. ";
    }

    @Override
    public String getSaddle() {
        return "Guitar parts of the Acoustic. ";
    }


}
