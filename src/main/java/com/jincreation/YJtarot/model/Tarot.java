package com.jincreation.YJtarot.model;

public enum Tarot {
    TheFool(0, "The Fool", ""),
    TheMagician(1, "The Magician", ""),
    TheHighPriestess(2, "The High Priestess", ""),
    TheEmpress(3, "The Empress", ""),
    TheEmperor(4, "The Emperor", ""),
    TheHierophant(5, "The Hierophant", ""),
    TheLovers(6, "The Lovers", ""),
    TheChariot(7, "The Chariot", ""),
    Strength(8, "Strength", ""),
    TheHermit(9, "The Hermit", ""),
    TheWheelOfFortune(10, "The Wheel of Fortune", ""),
    TheJustice(11, "The Justice", ""),
    TheHangedMan(12, "The HangedMan", ""),
    Death(13, "Death", ""),
    Temperance(14, "Temperance", ""),
    TheDevil(15, "The Devil", ""),
    TheTower(16, "The Tower", ""),
    TheStar(17, "The Star", ""),
    TheMoon(18, "The Moon", ""),
    TheSun(19, "The Sun", ""),
    Judgement(20, "Judgement", ""),
    TheWorld(21, "The World", "");


    private final int index;
    private final String title;
    private final String description;

    Tarot(int index, String title, String description){
        this.index = index;
        this.title = title;
        this.description = description;
    }

    public int getIndex(){
        return this.index;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }




}
