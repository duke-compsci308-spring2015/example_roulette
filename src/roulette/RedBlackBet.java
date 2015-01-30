package roulette;

import util.ConsoleReader;

public class RedBlackBet extends Bet{

	public RedBlackBet(String description, int odds) {
		super(description, odds);
	}
	
	public boolean checkWinConditions(Wheel myWheel, String betChoice){
		return myWheel.getColor().equals(betChoice);	
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
}
