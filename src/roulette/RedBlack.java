package roulette;

import util.ConsoleReader;

public class RedBlack extends Bet {

	public RedBlack() {
		super("Red or Black", 1);
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	public boolean betIsMade(String choice, Wheel wheel) {
        return wheel.getColor().equals(choice);
	}

}
