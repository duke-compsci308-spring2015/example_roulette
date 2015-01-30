package roulette;

import util.ConsoleReader;

public class ThreeBet extends Bet {

	public ThreeBet(String description, int odds) {
		super(description, odds);
	}
	
	@Override
	public String place() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	protected boolean isMade(String betChoice, Wheel myWheel) {
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

}
