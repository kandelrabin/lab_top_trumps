package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Hand;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpService {

    private ArrayList<Card> currentCards;

    public TopTrumpService(){
    }

    public Reply processCards(ArrayList<Card> cards){
        Reply reply = null;
        for( Card card : cards){
            reply = new Reply(card.getSuit(), card.getRank(),false);
        }
        return reply;
    }

    public Reply checkWinner(Card firstCard, Card secondCard){
        Reply reply;
        if (firstCard.getRank().getValue() > secondCard.getRank().getValue()){
            reply = new Reply(
                    firstCard.getSuit(),
                    firstCard.getRank(),
                    true);
            reply.setMessage(
                    String.format("%s of %s wins!",
                            reply.getRank(),
                            reply.getSuit()));
            return reply;
        } else {
            reply = new Reply(
                    secondCard.getSuit(),
                    secondCard.getRank(),
                    true);
            reply.setMessage(String.format("%s of %s wins!",
                    reply.getRank(),
                    reply.getSuit()));
            return reply;
        }

    }




}
