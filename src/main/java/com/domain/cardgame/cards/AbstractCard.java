package src.main.java.com.domain.cardgame.cards;

public abstract class AbstractCard implements CardInterface {
    protected String name;
    protected int manaCost;

    public AbstractCard(String name, int manaCost){
        this.name = name;
        this.manaCost = manaCost;
    }

    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }


}
