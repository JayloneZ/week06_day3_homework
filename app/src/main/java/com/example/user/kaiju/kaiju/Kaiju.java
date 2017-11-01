package com.example.user.kaiju.kaiju;

import com.example.user.kaiju.vehicle.Vehicle;

/**
 * Created by user on 01/11/2017.
 */

public abstract class Kaiju {
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public abstract String roar();

    public void attack(Vehicle vehicle) {
        int health = vehicle.getHealthValue() - this.attackValue;
        vehicle.setHealthValue( health );
    }
}
