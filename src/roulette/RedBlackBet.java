package roulette;

import util.ConsoleReader;

public class RedBlackBet extends Bet{

	public RedBlackBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public boolean checkWin(Wheel w, String choice) {
		return w.getColor().equals(choice);
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}


	
	
}
