package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.*;
import org.springframework.stereotype.Service;

import java.security.interfaces.EdECKey;
import java.util.ArrayList;

@Service
public class TopTrumpService {

    public TopTrumpService(){
    }

    public Reply startNewGame(){
        Reply reply;
        DeckOfCards deckOfCards = new DeckOfCards();
        for (Rank rank : Rank.values()){
            for (Suit suit: Suit.values()){
                deckOfCards.addToDeck(new Card(rank, suit));
            }
        }
        reply = new Reply(false);
        return reply;
    }

    public Reply processCards(ArrayList<Card> cards){
        Reply reply = null;
        for( Card card : cards){
            reply = new Reply(false);
        }
        return reply;
    }

    public Reply checkWinner(Card firstCard, Card secondCard){
        Reply reply;
        if (firstCard.getRank().getValue() > secondCard.getRank().getValue()){

            reply = new Reply(
                    true);
            reply.setMessage(
                    String.format("%s of %s wins!",
                            firstCard.getRank(),
                            firstCard.getSuit()));
            return reply;
        } else if (firstCard.getRank().getValue() == secondCard.getRank().getValue()){
            reply = new Reply();
            reply.setMessage("It's a draw!");
            return reply;
        } else {
            reply = new Reply(

                    true);
            reply.setMessage(String.format("%s of %s wins!",
                    secondCard.getRank(),
                    secondCard.getSuit()));
            return reply;
        }





    }




}
