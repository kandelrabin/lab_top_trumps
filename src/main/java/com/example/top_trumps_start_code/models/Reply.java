package com.example.top_trumps_start_code.models;

//dto

public class Reply {

    private boolean win;
    private Suit suit;
    private Rank rank;


    public Reply(Suit suit, Rank rank,boolean win){
        this.win = false;
        this.suit = suit;
        this.rank = rank;
    }

    public Reply(){
    }

    public boolean getWin() {
        return this.win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

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
