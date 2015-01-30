package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet {

	public NumberBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public String place() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	@Override
	protected boolean isMade(String betChoice, Wheel myWheel) {
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
}
