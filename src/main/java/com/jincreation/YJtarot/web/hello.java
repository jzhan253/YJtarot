package com.jincreation.YJtarot.web;

import com.jincreation.YJtarot.domain.Card;
import com.jincreation.YJtarot.domain.Deck;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("/h")
    public String index(){
        Deck d = new Deck();
        StringBuilder sb = new StringBuilder();
        for(Card c : d.cards){
            sb.append(c.tarot.getIndex()).append(" ").append(c.tarot.getTitle()).append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
