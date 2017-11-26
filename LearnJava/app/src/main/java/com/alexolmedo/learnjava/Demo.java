package com.alexolmedo.learnjava;

/**
 * Created by Alexander on 10/11/2017.
 */

public class Demo {

    public static void main(String[] args) {
        VampyreKing dracula = new VampyreKing("Dracula");
        dracula.showInfo();

        while(dracula.getLives() > 0) {
            if(dracula.dodges()){
                continue;
            }
            if(dracula.runAway()) {
                System.out.println("Dracula ran away");
                break;
            } else {
                dracula.takeDamage(12);
                dracula.showInfo();
            }
        }
    }
}
