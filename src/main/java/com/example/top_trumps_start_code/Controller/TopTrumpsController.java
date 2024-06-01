package com.example.top_trumps_start_code.Controller;


import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Game;
import com.example.top_trumps_start_code.models.Outcome;
import com.example.top_trumps_start_code.services.TopTrumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/toptrump")
public class TopTrumpsController {

    @Autowired
    TopTrumpService topTrumpService;

    Game game;

    @PostMapping(value = "/start")
    public ResponseEntity<Game> newGame(){
        game = new Game();
        return new ResponseEntity<>(game, HttpStatus.CREATED);
    }

    @PostMapping (value = "/play")
    public ResponseEntity<Outcome> playGame(){
        ArrayList<Card> cardsDealt = topTrumpService.deal(game);
        Card firstCard = cardsDealt.get(0);
        Card secondCard = cardsDealt.get(1);
        Outcome outcome = topTrumpService.checkWinner(firstCard, secondCard);
        return new ResponseEntity<>(outcome, HttpStatus.OK);
    }










}
