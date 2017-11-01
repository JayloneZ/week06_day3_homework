package com.example.user.kaiju.kaiju;

/**
 * Created by user on 01/11/2017.
 */

public class KingKong extends Kaiju {

    public KingKong(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "ROAR I'M KING KONG!";
    }

    public String move() {
        return "Just climbing some skyscrapers.";
    }
}
