package com.alexolmedo.learnjava;

/**
 * Created by Alexander on 10/11/2017.
 */

public class Demo {

    public static void main(String[] args) {
        Player alex = new Player();
        System.out.println(alex.getHandleName());
        alex.setNameAndLevel("Alexander", 5);
        System.out.println(alex.getHandleName());
        System.out.println("Level: " + alex.getLevel());
        System.out.println("Lives: " + alex.getLives());


    }
}
