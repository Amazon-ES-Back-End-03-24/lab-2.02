package org.example.classes.game;

public class Elf extends Player {
    private int speed;

    public Elf(int health, int strength, int lives, int speed) {
        super(health, strength, lives);
        this.speed = speed;
    }

    // or you could decide that if you don´t pass speed you will set a default value
    public Elf(int health, int strength, int lives) {
        super(health, strength, lives);
        this.speed = 10;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}