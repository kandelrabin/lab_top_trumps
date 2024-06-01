package com.example.top_trumps_start_code.models;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private ArrayList<Card> deck;

    public Game(){
        this.deck = createDeck();
    }

    public ArrayList<Card> createDeck(){
        ArrayList <Card> deck = new ArrayList<>();
        for (Rank rank : Rank.values()){
            for (Suit suit: Suit.values()){
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
        return deck;
    }


    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public int countDeck(){
        return this.deck.size();
    }

    public Card getFromDeck(int index){
        return deck.get(index);
    }


}
