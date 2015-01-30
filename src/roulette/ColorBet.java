package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet{
    public ColorBet(String description, int odds) {
        super(description, odds);
    }

    public String getPrompt () {
        return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
    }

    public boolean getOutcome (Wheel w, String betChoice) {
        return w.getColor().equals(betChoice);
    }
}
