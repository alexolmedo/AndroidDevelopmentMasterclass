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
    }
}
