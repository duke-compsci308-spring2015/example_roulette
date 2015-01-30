package roulette;

import util.ConsoleReader;

public class RedBlackBet extends Bet{

	public RedBlackBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		
		
	}

	@Override
	public boolean betIsMade(Wheel w, String betChoice) {
		return w.getColor().equals(betChoice);
	}

}
