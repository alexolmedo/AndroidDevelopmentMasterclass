package com.alexolmedo.learnjava;

/**
 * Created by Alexander on 25/11/2017.
 */

public class Enemy {
    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage) {
        int remainingPoints = this.hitPoints - damage;
        if (remainingPoints > 0) {
            setHitPoints(remainingPoints);
            System.out.println("I took " + damage + " points damage, and have " + remainingPoints + " left.");
        } else {
            this.lives = this.lives - 1;
            System.out.println("I've lost a life.");
        }
    }

    public void showInfo() {
        System.out.println("Name: " + this.name + " Hitpoints: " + this.hitPoints + " Lives: " + this.lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
