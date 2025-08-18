package src.main.java.com.domain.cardgame.cards.impl;
import src.main.java.com.domain.cardgame.cards.CardInterface;

public class Earthquake implements CardInterface{
    private String name;
    private int manaCost;
    private int damage;

    public Earthquake(){
        this.name = "Earthquake";
        this.manaCost = 4;
        this.damage = 50;
    }

    @Override
    public void play(){
        System.out.println("Uses Earthquake spell");
    }

    public String getName(){
        return name;
    }

    public int getManaCost(){
        return manaCost;
    }
}
