package com.bnta.word_guesser.models;

public class Guess {

    private String letter;

    public Guess(){

    }

    public Guess(String letter){
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter){
        this.letter = letter;
    }
}
