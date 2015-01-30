package roulette;

import util.ConsoleReader;


public class OddEvenBet extends Bet {
    public OddEvenBet () {
        super("Odd or Even", 1);
    }

    public String placeBetPrompt () {
        return ConsoleReader.promptOneOf("Please bet", "even", "odd");
    }

    public boolean betWins (Wheel wheel, String choice) {
        return (wheel.getNumber() % 2 == 0 && choice.equals("even")) ||
               (wheel.getNumber() % 2 == 1 && choice.equals("odd"));
    }

}
