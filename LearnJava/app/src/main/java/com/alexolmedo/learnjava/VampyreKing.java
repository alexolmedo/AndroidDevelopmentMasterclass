package com.alexolmedo.learnjava;

import java.util.Random;

/**
 * Created by Alexander on 26/11/2017.
 */

public class VampyreKing extends Vampyre {

    public VampyreKing(String name) {
        super(name);
        setHitPoints(140);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }

    public boolean runAway() {
//        if (getLives() < 2) {
//            return true;
//        } else {
//            return false;
//        }
        return (getLives() < 2);
    }

    public boolean dodges() {
        Random rand = new Random();
        int chance = rand.nextInt(6);
        if(chance > 3) {
            System.out.println("Dracula dodges");
            return true;
        }
        return false;
    }
}
