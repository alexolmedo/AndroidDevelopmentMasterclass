package com.alexolmedo.learnjava;

/**
 * Created by Alexander on 26/11/2017.
 */

public class Vampyre extends Enemy {
    public Vampyre(String name) {
        super(name, 20,3);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = damage / 2;
        super.takeDamage(damageDone);
    }

}
