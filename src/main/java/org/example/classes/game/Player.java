package org.example.classes.game;

public abstract class Player {
    private final int originalHealth;
    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        originalHealth = health;
    }

    public void decrementLive() {
        if (lives > 0) {
            lives--;
            health = originalHealth;
        } else {
            health = 0;
            System.out.println("☠ This character is dead ☠");
        }
    }

    public void attack(Player playerToAttack) {
        // Only attack if the player is not dead
        if (playerToAttack.getLives() > 0) {
            // this.getStrength() will be the actual/current player
            playerToAttack.setHealth(playerToAttack.getHealth() - this.getStrength());
            playerToAttack.checkHealth();
        }
    }

    public int checkHealth() {
        if (getHealth() <= 0 && lives > 0) {
            decrementLive();
        }
        return getHealth();

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}