package com.yoshi;

public class Main {

    public static void main(String[] args) {
        Dc dc = new Dc();
        Marvel mv = new Marvel();
        HeroesHuman h = new HeroesHuman();
        StaticBlock sb = new StaticBlock();


        //constance
        final int DESIGNER_DOG = 7000;
        System.out.println("Why this dog so high " +""+ DESIGNER_DOG);

        final int NEW_Dodge = 40000;
        System.out.println("I want the new dodge but not trying to spend " + "" + NEW_Dodge);

        final int House_Rent = 500;
        System.out.println("My house rent is very affordable its" + " "+ House_Rent);

        //Dc.heroesD();
        //Dc.characterSelect();
        //Dc.Flash();
        //Dc.imageComics();
        //Dc.flashComic();
        //Dc.humanSupName();
        Dc.normalFlash();


        //HeroesHuman class getter/setter
        h.setName("Berry Allen");
        h.setAge(26);
        System.out.println("The Flash is " + h.getName());
        System.out.println("Berry Allen is " + h.getAge());

        Marvel.heroesM();
        Marvel.characterSelect();
        Marvel.BlackPanther();
        Marvel.imageComics();
        Marvel.blackComic();
        //Marvel.humanSupName();
        //Marvel.normalblackPanther();

        //HeroesHuman class getter/setter
        h.setmName("T'Challa");
        h.setmAge(29);
        System.out.println("Black Panther is " + h.getMName());
        System.out.println("T'Challa is " + h.getmAge());

        /*
        h.sethlkName("Bruce Banner");
        h.sethlkAge(35);
        System.out.println("Hulk is " + h.gethlkName());
        System.out.println("Bruce Banner is " + h.gethlkAge());

        h.setbName("Bruce Wayne");
        h.setbAge(34);
        System.out.println("Bat-Man is " + h.getbName());
        System.out.println("Bruce Wayne is " + h.getbAge());

        h.setGreenName("John Stewart");
        h.setGreenAge(32);
        System.out.println("Green Lantern is " + h.getGreenName());
        System.out.println("John Stewart is " + h.getGreenAge());

        h.setWonderName("Diana Prince");
        h.setWonderAge(23);
        System.out.println("Wonder Woman is " + h.getWonderName());
        System.out.println("Diana Prince is " + h.getwonderAge());

        h.setThunderName("Thor Odinson");
        h.setThunderAge(1500);
        System.out.println("Thor is " + h.getthunderName());
        System.out.println("Thor Odinson is " + h.getthunderAge());

        h.setsupName("Clark Kent");
        h.setsupAge(21);
        System.out.println("Super-Man is " + h.getsupName());
        System.out.println("Clark Kent is " + h.getsupAge());

         */
    }
}

