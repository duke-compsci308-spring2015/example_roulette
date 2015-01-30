package Bet;

import util.ConsoleReader;

public class ParityBet extends Bet {
    public ParityBet () {
        super("Odd or Even", 1);
    }

    @Override
    public String askBet () {
        return ConsoleReader.promptOneOf("Please bet", "even", "odd");
    }

    @Override
    public boolean winOrLose (String betChoice) {
        return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
               (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
    }

}
