package com.notSlots.Random.Picker.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;

@Entity
public class GameState {

    @Id
    private Long id;
    private String userName;

    private short wheelOne;
    private short wheelTwo;
    private short wheelThree;
    private short wheelFour;

    @Transient
    private final ArrayList<Short> randoHolder = new ArrayList<>();

    public ArrayList<Short> getRandoHolder() {
        return randoHolder;
    }


    public GameState(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public short getWheelOne() {
        return wheelOne;
    }

    public void setWheelOne(short wheelOne) {
        this.wheelOne = wheelOne;
    }

    public short getWheelTwo() {
        return wheelTwo;
    }

    public void setWheelTwo(short wheelTwo) {
        this.wheelTwo = wheelTwo;
    }

    public short getWheelThree() {
        return wheelThree;
    }

    public void setWheelThree(short wheelThree) {
        this.wheelThree = wheelThree;
    }

    public short getWheelFour() {
        return wheelFour;
    }

    public void setWheelFour(short wheelFour) {
        this.wheelFour = wheelFour;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
