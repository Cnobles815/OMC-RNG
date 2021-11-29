package com.notSlots.Random.Picker.services;

import com.notSlots.Random.Picker.models.GameState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class GameStateService {

    private final Random stateRandomizer = new Random();

    public ArrayList<Short> randomizedState(){
        GameState currentState = new GameState();

        currentState.getRandoHolder().add((short) stateRandomizer.nextInt(9));
        currentState.getRandoHolder().add((short) stateRandomizer.nextInt(9));
        currentState.getRandoHolder().add((short) stateRandomizer.nextInt(9));
        currentState.getRandoHolder().add((short) stateRandomizer.nextInt(9));

        return currentState.getRandoHolder();

    }




}
