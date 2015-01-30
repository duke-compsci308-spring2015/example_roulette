package roulette;

import util.ConsoleReader;

public class OddEvenBet extends Bet{
    public OddEvenBet(String description, int odds) {
        super(description, odds);
    }

    public String getPrompt () {
        return ConsoleReader.promptOneOf("Please bet", "even", "odd");
    }

    public boolean getOutcome (Wheel w, String betChoice) {
        return (w.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (w.getNumber() % 2 == 1 && betChoice.equals("odd"));
    }
}
