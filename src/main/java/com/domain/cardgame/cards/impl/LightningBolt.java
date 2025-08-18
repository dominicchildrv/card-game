package src.main.java.com.domain.cardgame.cards.impl;
import src.main.java.com.domain.cardgame.cards.CardInterface;

public class LightningBolt implements CardInterface{
    private String name;
    private int manaCost;
    private int damage;

    public LightningBolt(){
        this.name = "Lightning Bolt";
        this.manaCost = 3;
        this.damage = 40;
    }

    @Override
    public void play(){
        System.out.println("Uses Lightning Bolt spell");
    }

    public String getName(){
        return name;
    }

    public int getManaCost(){
        return manaCost;
    }
}
