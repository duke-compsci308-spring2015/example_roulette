package roulette;

import util.ConsoleReader;

public class Refactored_Bet extends Bet {

	public Refactored_Bet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	String placeBet (int whichBet) {
		String result = "";
			result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		System.out.println();
		return result;
	}
}
