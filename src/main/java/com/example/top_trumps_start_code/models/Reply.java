package com.example.top_trumps_start_code.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Reply {
    @JsonIgnore
    private boolean win;
    @JsonIgnore
    private Suit suit;
    @JsonIgnore
    private Rank rank;
    private String message;


    public Reply(Suit suit, Rank rank, boolean win){
        this.win = win;
        this.suit = suit;
        this.rank = rank;
        this.message = "";
    }

    public Reply(){
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
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
