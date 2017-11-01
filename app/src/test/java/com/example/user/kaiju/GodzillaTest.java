package com.example.user.kaiju;



import com.example.user.kaiju.kaiju.Godzilla;
import com.example.user.kaiju.vehicle.Tank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 01/11/2017.
 */

public class GodzillaTest {

    Godzilla godzilla;
    Tank tank;

    @Before
    public void before() {
        godzilla = new Godzilla("Godzilla", 300, 30);
        tank = new Tank("slow", 50);
    }

    @Test
    public void canRoar() {
        assertEquals("ROAR I'M GODZILLA!", godzilla.roar());
    }

    @Test
    public void canAttack() {
        godzilla.attack(tank);
        assertEquals(20, tank.getHealthValue());
    }

    @Test
    public void canMove() {
        assertEquals("Just walking through some skyscrapers.", godzilla.move());
    }

}
