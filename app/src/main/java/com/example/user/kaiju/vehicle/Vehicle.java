package com.example.user.kaiju.vehicle;

/**
 * Created by user on 01/11/2017.
 */

public class Vehicle {
    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
