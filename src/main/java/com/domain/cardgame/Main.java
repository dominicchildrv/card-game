package src.main.java.com.domain.cardgame;

import src.main.java.com.domain.cardgame.cards.impl.Fireball;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Fireball fireball = new Fireball();
        fireball.play();
    }
}
