package src.main.java.com.domain.cardgame.decks.impl;

import java.util.List;

import src.main.java.com.domain.cardgame.cards.CardInterface;

public class BasicDeck {
    private int size;
    private String name;
    private int copies;
    private int handSize;
    private List<CardInterface> cards;
    private List<CardInterface> hand;

    public BasicDeck(String name, int size){
        this.name = name;
        this.size = size;
        this.copies = 3;
        this.handSize = 7;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }

    public int getCopies(){
        return copies;
    }

}
