package com.jincreation.YJtarot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Data
//@AllArgsConstructor
@Service
public class Deck {
    public List<Card> cards = new ArrayList<>();
    public Deck(){
        for(Tarot tarot : Tarot.values()){
            cards.add(new Card(tarot));
        }
    }
}
