package com.patterns.abstractfactory;

public abstract class AbstractGuitarFactory {
    public abstract void createFrame(AcousticInterface acoustic);
    public abstract void createFrame(ElectricInterface electric);
    public abstract void createFrame(HybridInterface hybrid);
}
