package roulette;

import util.ConsoleReader;

public class HighLowBet extends Bet {

    public HighLowBet(){
        super("High or Low Number", 1);
    }
    @Override
    public String placeBetPrompt () {
        return ConsoleReader.promptOneOf("Please bet", "high", "low");
    }

    @Override
    public boolean betWins (Wheel wheel, String choice) {
        return (wheel.getNumber()  > Wheel.NUM_SPOTS/2 && choice.equals("high")) ||
                (wheel.getNumber() <= Wheel.NUM_SPOTS/2 && choice.equals("low"));
    }

}
