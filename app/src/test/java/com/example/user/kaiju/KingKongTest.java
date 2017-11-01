package com.example.user.kaiju;

import com.example.user.kaiju.kaiju.KingKong;
import com.example.user.kaiju.vehicle.Tank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/11/2017.
 */

public class KingKongTest {

    KingKong kingKong;
    Tank tank;

    @Before
    public void before() {
        kingKong = new KingKong("King Kong", 300, 30);
        tank = new Tank("fast", 40);
    }

    @Test
    public void canRoar() {
        assertEquals("ROAR I'M KING KONG!", kingKong.roar());
    }

    @Test
    public void canAttack() {
        kingKong.attack(tank);
        assertEquals(10, tank.getHealthValue());
    }

    @Test
    public void canMove() {
        assertEquals("Just climbing some skyscrapers.", kingKong.move());
    }
}
