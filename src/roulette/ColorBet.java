package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet {

	public ColorBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void placeBet() {
		betChoice = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
	@Override
	public boolean betIsMade(Wheel myWheel) {
		return myWheel.getColor().equals(betChoice);
	}
}
