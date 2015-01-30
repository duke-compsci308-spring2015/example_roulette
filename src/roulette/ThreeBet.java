package roulette;

import util.ConsoleReader;

public class ThreeBet extends Bet {
	public ThreeBet(String description, int odds) {
		super(description, odds);
	}
	
	@Override
	public boolean checkWinConditions(Wheel myWheel, String betString) {
        int start = Integer.parseInt(betString);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

	@Override
	public String placeBet() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

}
