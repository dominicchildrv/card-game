package src.main.java.com.domain.cardgame.cards.impl;
import src.main.java.com.domain.cardgame.cards.CardInterface;

public class ArcaneBlast implements CardInterface{
    private String name;
    private int manaCost;
    private int damage;

    public ArcaneBlast(){
        this.name = "Arcane Blast";
        this.manaCost = 2;
        this.damage = 35;
    }

    @Override
    public void play(){
        System.out.println("Uses Arcane Blast spell");
    }

    public String getName(){
        return name;
    }

    public int getManaCost(){
        return manaCost;
    }
}
