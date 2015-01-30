package Bet;

import roulette.Wheel;
import util.ConsoleReader;

public class NumberBet extends Bet {
    public NumberBet () {
        super("Three in a Row", 11);
    }

    @Override
    public String askBet () {
        return "" +
               ConsoleReader.promptRange("Enter first of three consecutive numbers", 1,
                                         Wheel.NUM_SPOTS - 3);
    }

    @Override
    public boolean winOrLose (String betChoice) {
        int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
    }
}
