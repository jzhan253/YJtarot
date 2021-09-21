package com.jincreation.YJtarot.controller;

import com.jincreation.YJtarot.model.Card;
import com.jincreation.YJtarot.model.Deck;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class hello {

    @Autowired
    private Deck d;

    @RequestMapping("/h")
    public String index(){
        log.info("Received request..");
        StringBuilder sb = new StringBuilder();
        for(Card c : d.cards){
            sb.append(c.tarot.getIndex()).append(" ").append(c.tarot.getTitle()).append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }

    @RequestMapping(value = "/cards/{id}", method = RequestMethod.GET)
    public String getTarotTitle(@PathVariable("id") int id){
        log.info("Received request: reading card " + id);
        Deck d = new Deck();
        return d.cards.get(id).tarot.getTitle();
    }

}
