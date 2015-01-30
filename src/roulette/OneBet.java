package roulette;

import util.ConsoleReader;

public class OneBet extends Bet {

    public OneBet(){
        super("Single Number", 35);
    }

    @Override
    public String placeBetPrompt () {
        return "" +
                ConsoleReader.promptRange("Enter first of two consecutive numbers", 1,
                                          Wheel.NUM_SPOTS - 1);
    }

    @Override
    public boolean betWins (Wheel wheel, String choice) {
        int start = Integer.parseInt(choice);
        return (start == wheel.getNumber());
    }

}
