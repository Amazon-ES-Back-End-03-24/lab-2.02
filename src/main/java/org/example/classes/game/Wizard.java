package org.example.classes.game;

public class Wizard extends Player {
    private int spell;

    public Wizard(int health, int strength, int lives, int spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public Elf convertToElf() {
        System.out.println("\uD83E\uDDEA \uD83E\uDDEA Converting your wizard \uD83E\uDDD9 to an elf \uD83E\uDDDD\uD83C\uDFFC");
        return new Elf(getHealth(), getStrength(), getLives(), getSpell());
    }
}