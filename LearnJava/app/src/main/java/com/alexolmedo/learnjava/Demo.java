package com.alexolmedo.learnjava;

/**
 * Created by Alexander on 10/11/2017.
 */

public class Demo {

    public static void main(String[] args) {
//        Enemy enemy = new Enemy("test enemy", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(11);
//        enemy.showInfo();
        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);
    }
}
