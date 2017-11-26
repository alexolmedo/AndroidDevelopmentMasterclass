package com.alexolmedo.learnjava;

/**
 * Created by Alexander on 10/11/2017.
 */

public class Demo {

    public static void main(String[] args) {
        VampyreKing dracula = new VampyreKing("Dracula");
        dracula.showInfo();
        dracula.takeDamage(12);
        dracula.showInfo();
    }
}
