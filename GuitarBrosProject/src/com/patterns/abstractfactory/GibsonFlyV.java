package com.patterns.abstractfactory;

public class GibsonFlyV implements ElectricInterface {
    @Override
    public String getElectronicPickUp() {
        return "Guitar parts of the Electric. ";
    }

    @Override
    public String getAmp() {
        return "Guitar parts of the Electric. ";
    }
    @Override
    public String getWhammyBar() {
        return "Guitar parts of the Electric. ";
    }
}
