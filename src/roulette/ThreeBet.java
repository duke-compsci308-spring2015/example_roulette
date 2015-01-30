package roulette;

import util.ConsoleReader;


public class ThreeBet extends Bet {

    public ThreeBet () {
        super("Three in a Row", 11);
    }

    public String placeBetPrompt () {
        return "" +
               ConsoleReader.promptRange("Enter first of three consecutive numbers", 1,
                                         Wheel.NUM_SPOTS - 3);
    }

    public boolean betWins (Wheel wheel, String choice) {
        int start = Integer.parseInt(choice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
    }
}
