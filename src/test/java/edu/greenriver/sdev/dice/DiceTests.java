package edu.greenriver.sdev.dice;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTests {

    private static final int TEST_ROLLS = 50;
    static Dice d;

    @BeforeAll
    static void init() {
        d = new Dice(6, "white");
    }


    @Test
    void numbersBetweenOneSix() {
        for (int i = 0; i < TEST_ROLLS; i++) {
            int num = d.roll();
            assertTrue(num > 0 && num < 7);
        }
    }

    @Test
    void sidesEqualsSix() {
        assertEquals(6, d.getSides());
    }

    @Test
    void colorWhite() {
        assertEquals("white", d.getColor());
    }

    @Test
    void testSides() {
        assertEquals(6, d.getSides());
    }


}
