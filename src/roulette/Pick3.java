package roulette;

import util.ConsoleReader;

public class Pick3 extends Bet {
	
	public Pick3(String description, int odds, Wheel wheel) {
		super(description, odds, wheel);
		// TODO Auto-generated constructor stub
	}

	public String placeBet() {
		String result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		result = ""
				+ ConsoleReader.promptRange(
						"Enter first of three consecutive numbers", 1,
						Wheel.NUM_SPOTS - 3);
		return result;
	}

	public boolean betIsMade(String betChoice) {
		int start = Integer.parseInt(betChoice);
		return (start <= this.getWheel().getNumber() && this.getWheel().getNumber() < start + 3);
	}

}
