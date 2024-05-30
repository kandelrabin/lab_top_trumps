package com.example.top_trumps_start_code.models;

import java.util.ArrayList;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards(){
        this.deck = new ArrayList<>();
    }


    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void addToDeck(Card card){
        this.deck.add(card);
    }

    public Card getFromDeck(int index){
        return deck.get(index);
    }

}
