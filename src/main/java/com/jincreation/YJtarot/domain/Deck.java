package com.jincreation.YJtarot.domain;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public List<Card> cards = new ArrayList<>();
    public Deck(){
        for(Tarot tarot : Tarot.values()){
            cards.add(new Card(tarot));
        }
    }
}
