package roulette;

import util.ConsoleReader;

public class RedOrBlack extends Bet {

	public RedOrBlack(String description, int odds) {
		super(description, odds);
	}

	public String getPrompt() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	public boolean compareBet(Wheel wheel, String betChoice) {
        return wheel.getColor().equals(betChoice);
	}

}
