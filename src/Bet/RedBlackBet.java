package Bet;

import roulette.Wheel;
import util.ConsoleReader;

public class RedBlackBet extends Bet {

    public RedBlackBet () {
        super("Red or Black", 1);
    }

    @Override
    public String askBet () {
        return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
    }

    @Override
    public boolean winOrLose (String betChoice) {
        return myWheel.getColor().equals(betChoice);
    }
}
