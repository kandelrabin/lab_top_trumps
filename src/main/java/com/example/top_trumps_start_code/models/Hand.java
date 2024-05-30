package com.example.top_trumps_start_code.models;

//pojo
public class Hand {

    //properties
    private Suit suit;
    private Rank rank;

    //constructor

    public Hand(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Hand(){
    }

    //getter setters

    public Suit getSuit() {
        return this.suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
