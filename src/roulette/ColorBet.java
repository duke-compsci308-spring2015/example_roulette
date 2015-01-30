package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet {

	public ColorBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public String place() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	protected boolean isMade(String betChoice, Wheel myWheel) {
		return myWheel.getColor().equals(betChoice);
	}

}
