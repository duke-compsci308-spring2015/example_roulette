package roulette;

import util.ConsoleReader;

public class redBlack extends Bet {

	public redBlack(String des, Integer odd) {
		super(des, odd);
	}

	public String placeBet(int whichBet) {
		String result = "";
		result = ConsoleReader
				.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		return result;

	}

	public boolean betIsMade(int whichBet, String betChoice, Wheel myWheel) {
		return myWheel.getColor().equals(betChoice);
	}

}
