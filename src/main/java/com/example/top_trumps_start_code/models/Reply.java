package com.example.top_trumps_start_code.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Reply {
    @JsonIgnore
    private boolean win;
    private String message;


    public Reply(boolean win){
        this.win = win;
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

}
