package com.jincreation.YJtarot.model;

import java.util.List;

public enum Formation{
    GoldenTriangle("Golden Triangle", new Card[3]),
    FiveStar("Five Star", new Card[5]);

    private String name;
    private Card[] cards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    Formation(String name, Card[] cards){
        this.name = name;
        this.cards = cards;
    }
}
