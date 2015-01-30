package roulette;

import util.ConsoleReader;

public class OddEven extends Bet {

	public OddEven() {
		super("Odd or Even", 1);
	}

	@Override
	public boolean betIsMade(String choice, Wheel wheel) {
		return ((wheel.getNumber() % 2 == 0) == choice.equals("even"));
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

}
