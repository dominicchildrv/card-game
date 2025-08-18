package src.main.java.com.domain.cardgame.cards.impl;
import src.main.java.com.domain.cardgame.cards.CardInterface;

public class IceShard implements CardInterface{
    private String name;
    private int manaCost;
    private int damage;

    public IceShard(){
        this.name = "Ice Shard";
        this.manaCost = 2;
        this.damage = 25;
    }

    @Override
    public void play(){
        System.out.println("Uses Ice Shard spell");
    }

    public String getName(){
        return name;
    }

    public int getManaCost(){
        return manaCost;
    }
}
