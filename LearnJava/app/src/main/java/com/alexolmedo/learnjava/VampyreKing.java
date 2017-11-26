package com.alexolmedo.learnjava;

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
}
