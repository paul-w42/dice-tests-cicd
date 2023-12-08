package edu.greenriver.sdev.dice;

public class DicerRunner {

    public static void main(String[] args) {
        Dice dice = new Dice(6, "White");

        for (int i = 0; i < 4; i++) {
            System.out.println("Dice rolling ... : " + dice.roll());
        }
    }
}
