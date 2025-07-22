package src.main.java.com.domain.cardgame.cards.impl;

import src.main.java.com.domain.cardgame.cards.AbstractCard;

public class Fireball extends AbstractCard {
    private int damage;

    public Fireball(){
        super("Fireball",1);
        this.damage = 30;
    }

    @Override
    public void play(){
        System.out.println("Uses Fireball spell");
    }
}
