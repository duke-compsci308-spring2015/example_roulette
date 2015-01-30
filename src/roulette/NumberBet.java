package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet{
    public NumberBet(String description, int odds) {
        super(description, odds);
    }

    public String getPrompt () {
        return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                                                1, Wheel.NUM_SPOTS - 3);
    }

    public boolean getOutcome (Wheel w, String betChoice) {
        int start = Integer.parseInt(betChoice);
        return (start <= w.getNumber() && w.getNumber() < start + 3);
    }
}
