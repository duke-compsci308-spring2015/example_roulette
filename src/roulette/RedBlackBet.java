package roulette;

import util.ConsoleReader;


public class RedBlackBet extends Bet {
    public RedBlackBet () {
        super("Red or Black", 1);
    }

    public String placeBetPrompt () {
        return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
    }

    public boolean betWins (Wheel wheel, String choice) {
        return wheel.getColor().equals(choice);
    }
}
