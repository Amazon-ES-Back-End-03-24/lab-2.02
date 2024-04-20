package org.example;

import org.example.classes.game.Elf;
import org.example.classes.game.Warrior;
import org.example.classes.game.Wizard;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Warrior player1 = new Warrior(100, 100, 3, 60);
        Wizard player2 = new Wizard(80, 60, 5, 100);
        Elf player3 = player1.convertToElf();
        Elf player4 = player2.convertToElf();
    }
}
