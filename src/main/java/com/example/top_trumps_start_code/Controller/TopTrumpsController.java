package com.example.top_trumps_start_code.Controller;


import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Reply;
import com.example.top_trumps_start_code.services.TopTrumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/top_trump")
public class TopTrumpsController {

    @Autowired
    TopTrumpService topTrumpService;

//    @PostMapping
//    public ResponseEntity<Reply> newGame(){
//        Reply reply = topTrumpService.startNewGame();
//        return new ResponseEntity<>(reply, HttpStatus.CREATED);
//    }

    @PostMapping
    public ResponseEntity<Reply> putCards(@RequestBody ArrayList<Card> cards){
        Card firstCard = cards.get(0);
        Card secondCard = cards.get(1);
        Reply reply = topTrumpService.checkWinner(firstCard, secondCard);
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }










}
