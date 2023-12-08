package edu.greenriver.sdev.dice;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTests {

    @Test
    void numbersBetweenOneSix() {
        Dice d = new Dice(6, "white");
        for (int i = 0; i < 50; i++) {
            int num = d.roll();
            assertTrue(num > 0 && num < 7);
        }
    }
 
    @Test
    void sidesEqualsSix() {
        Dice d = new Dice(6, "white");
        assertTrue(d.getSides() == 6);
    }

    @Test
    void colorWhite() {
        Dice d = new Dice(6, "white");
        assertTrue(d.getColor().equals("white"));
    }


}
