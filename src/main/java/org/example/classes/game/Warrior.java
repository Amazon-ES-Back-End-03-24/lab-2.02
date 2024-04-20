package org.example.classes.game;

public class Warrior extends Player {
    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public Elf convertToElf() {
        System.out.println("\uD83E\uDDEA \uD83E\uDDEA Converting your warrior ⚔\uFE0F to an elf \uD83E\uDDDD\uD83C\uDFFC");
        return new Elf(getHealth(), getStrength(), getLives(), getForce());
    }
}