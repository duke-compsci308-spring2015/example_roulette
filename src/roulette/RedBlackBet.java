package roulette;

import util.ConsoleReader;

public class RedBlackBet extends Bet{

	public RedBlackBet() {
		super("Red or Black", 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String promptConsole() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	protected boolean determineSuccess(Wheel wheel, String betChoice) {
		return wheel.getColor().equals(betChoice);
	}

}
