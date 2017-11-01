package com.example.user.kaiju;

import com.example.user.kaiju.kaiju.KingKong;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/11/2017.
 */

public class KingKongTest {

    KingKong kingKong;

    @Before
    public void before() {
        kingKong = new KingKong("King Kong", 300, 30);
    }

    @Test
    public void canRoar() {
        assertEquals("ROAR I'M KING KONG!", kingKong.roar());
    }
}
