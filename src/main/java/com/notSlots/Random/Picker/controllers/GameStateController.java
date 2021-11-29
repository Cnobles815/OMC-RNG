package com.notSlots.Random.Picker.controllers;

import com.notSlots.Random.Picker.services.GameStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GameStateController {

    @Autowired
    GameStateService gameService;

    @GetMapping("/")
    public ArrayList<Short> gimmeRandoms(){
        return gameService.randomizedState();
    }


}
