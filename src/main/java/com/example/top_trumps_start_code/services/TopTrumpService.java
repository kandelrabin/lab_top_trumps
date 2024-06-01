package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpService {

    public TopTrumpService(){
    }


    public ArrayList<Card> deal(Game game){
        ArrayList<Card> cardsDealt = new ArrayList<>();
        cardsDealt.add(game.getDeck().remove(0));
        cardsDealt.add(game.getDeck().remove(0));
        return cardsDealt;
    }

    public Outcome checkWinner(Card firstCard, Card secondCard){
        Outcome outcome;
        if (firstCard.getRank().getValue() > secondCard.getRank().getValue()){

            outcome = new Outcome(
                    true);
            outcome.setMessage(
                    String.format("%s of %s wins!",
                            firstCard.getRank(),
                            firstCard.getSuit()));
            return outcome;
        } else if (firstCard.getRank().getValue() == secondCard.getRank().getValue()){
            outcome = new Outcome();
            outcome.setMessage("It's a draw!");
            return outcome;
        } else {
            outcome = new Outcome(

                    true);
            outcome.setMessage(String.format("%s of %s wins!",
                    secondCard.getRank(),
                    secondCard.getSuit()));
            return outcome;
        }


    }




}
