package com.jincreation.YJtarot.service;

import com.jincreation.YJtarot.model.Card;
import com.jincreation.YJtarot.model.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class DivinationService {

    @Resource
    private Deck d;

    public List<Card> getDivination(String questionCategory, String formation){
        int[] availableFormation = getFormations(questionCategory);
        int formationChoice = availableFormation[Integer.parseInt(formation)];
        return getCardList(formationChoice);
    }

    private int[] getFormations(String questionCategory){
        int[] res;
        if(questionCategory.equalsIgnoreCase("career")){
            res = new int[]{0, 1, 2};
        } else{
            res = new int[]{3, 4, 5};
        }
        return res;
    }

    private List<Card> getCardList(int formationChoice){
        List<Card> res = new ArrayList<>();
        if(formationChoice == 1){
            Random random = new Random();
            List<Integer> randomNumbers = random.ints(0, 22).distinct().limit(3).boxed().collect(Collectors.toList());
            res.add(d.cards.get(randomNumbers.get(0)));
            res.add(d.cards.get(randomNumbers.get(1)));
            res.add(d.cards.get(randomNumbers.get(2)));
            return res;
        } else return null;
    }
//    private String questionCategory;
//    private String formation;
//    private Deck d;
//
//    public DivinationService(String questionCategory, String formation, Deck d){
//        this.formation = formation;
//        this.questionCategory = questionCategory;
//        this.d = d;
//    }

}
