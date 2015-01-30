package roulette;

import util.ConsoleReader;

public class TwoBet extends Bet {

    public TwoBet(){
        super("Two in a Row", 17);
    }
    @Override
    public String placeBetPrompt () {
        return "" +
                ConsoleReader.promptRange("Enter first of two consecutive numbers", 1,
                                          Wheel.NUM_SPOTS - 2);
    }

    @Override
    public boolean betWins (Wheel wheel, String choice) {
        int start = Integer.parseInt(choice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 2);
    }

}
