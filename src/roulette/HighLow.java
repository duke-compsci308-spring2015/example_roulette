package roulette;

import util.ConsoleReader;

public class HighLow extends Bet {

	public HighLow() {
		super("High or low", 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean betIsMade(String choice, Wheel wheel) {
		return ((wheel.getNumber()<=18) == choice.equals("low"));
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "low", "high");
	}

}
