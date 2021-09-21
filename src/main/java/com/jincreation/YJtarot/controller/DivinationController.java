package com.jincreation.YJtarot.controller;

import com.jincreation.YJtarot.model.Card;
import com.jincreation.YJtarot.service.DivinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DivinationController {

    @Autowired
    private DivinationService divinationService;

    @GetMapping("/d")
    public List<Card> getDivination(@RequestParam(name="cat", defaultValue="career") String cat, @RequestParam(name="choice", defaultValue = "1") String choice){
        return divinationService.getDivination(cat, choice);
    }

}
