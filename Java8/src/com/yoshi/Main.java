package com.yoshi;

interface Person {

    String color = "Carmel";

    void talk();
    void walk();


}
class InterfaceExample implements Person {

    
    public static void main(String[] args) {
        System.out.println(color);

        InterfaceExample ex = new InterfaceExample();
        ex.talk();
        ex.walk();
    }


    @Override
    public void talk() {

    }

    @Override
    public void walk() {

    }
}
