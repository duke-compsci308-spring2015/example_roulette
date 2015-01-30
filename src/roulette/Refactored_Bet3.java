package roulette;

import util.ConsoleReader;

public class Refactored_Bet3 extends Refactored_Bet{
	
	public Refactored_Bet3(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	 String placeBet (int whichBet) {
		String result = "";
		result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
				1, Wheel.NUM_SPOTS - 3);
		System.out.println();
		return result;
	}
}
