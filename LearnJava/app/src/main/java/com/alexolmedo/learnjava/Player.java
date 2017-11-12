package com.alexolmedo.learnjava;

/**
 * Created by Alexander on 10/11/2017.
 */

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;

    public Player() {
        this("Unknown player");
    }

    public Player(String handle) {
        this(handle, 1);
//        handleName = handle;
//        lives = 3;
//        level = 1;
//        score = 0;
    }

    public Player(String handle, int startingLevel) {
        handleName = handle;
        lives = 3;
        level = startingLevel;
        score = 0;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if (handle.length() < 3 ){
            return;
        } else {
            handleName = handle;
        }
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
