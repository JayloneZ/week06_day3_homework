package com.example.user.kaiju;



import com.example.user.kaiju.kaiju.Godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 01/11/2017.
 */

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void before() {
        godzilla = new Godzilla("Godzilla", 300, 30);
    }

    @Test
    public void canRoar() {
        assertEquals("ROAR I'M GODZILLA!", godzilla.roar());
    }

}
