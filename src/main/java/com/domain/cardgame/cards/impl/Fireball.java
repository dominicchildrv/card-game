package src.main.java.com.domain.cardgame.cards.impl;
import src.main.java.com.domain.cardgame.cards.CardInterface;

public class Fireball implements CardInterface{
    private String name;
    private int manaCost;
    private int damage;

    public Fireball(){
        this.name = "Fireball";
        this.manaCost = 1;
        this.damage = 30;
    }

    @Override
    public void play(){
        System.out.println("Uses Fireball spell");
    }

    public String getName(){
        return name;
    }

    public int getManaCost(){
        return manaCost;
    }
}
