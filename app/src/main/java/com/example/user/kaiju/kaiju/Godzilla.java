package com.example.user.kaiju.kaiju;

/**
 * Created by user on 01/11/2017.
 */

public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "ROAR I'M GODZILLA!";
    }
}
