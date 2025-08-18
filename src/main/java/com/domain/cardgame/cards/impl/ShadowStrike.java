package src.main.java.com.domain.cardgame.cards.impl;
import src.main.java.com.domain.cardgame.cards.CardInterface;

public class ShadowStrike implements CardInterface{
    private String name;
    private int manaCost;
    private int damage;

    public ShadowStrike(){
        this.name = "Shadow Strike";
        this.manaCost = 1;
        this.damage = 20;
    }

    @Override
    public void play(){
        System.out.println("Uses Shadow Strike spell");
    }

    public String getName(){
        return name;
    }

    public int getManaCost(){
        return manaCost;
    }
}
