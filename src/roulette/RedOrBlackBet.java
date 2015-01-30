package roulette;

import util.ConsoleReader;

public class RedOrBlackBet extends Bet {

	public RedOrBlackBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	public String betString(){
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
	public boolean betResults(Wheel myWheel, String betChoice) {
		return myWheel.getColor().equals(betChoice);
	}
	
}
