package com.alexolmedo.learnjava;

/**
 * Created by Alexander on 10/11/2017.
 */

public class Demo {

    public static void main(String[] args) {
        Player alex = new Player();
        System.out.println(alex.getHandleName());
        alex.setHandleName("Ale");
        System.out.println(alex.getHandleName());
        System.out.println("Level: " + alex.getLevel());
        System.out.println("Lives: " + alex.getLives());

        Player louise = new Player("Louise");
        System.out.println(louise.getHandleName());
        louise.setLives(5);
        System.out.println("Level: " + louise.getLevel());
        System.out.println("Lives: " + louise.getLives());

        Player gr8 = new Player("gr8", 9);
        System.out.println(gr8.getHandleName());
        System.out.println("Level: " + gr8.getLevel());
        System.out.println("Lives: " + gr8.getLives());
    }
}
