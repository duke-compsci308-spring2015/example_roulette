package roulette;

import util.ConsoleReader;

public class RedOrBlackBet extends Bet {

	public RedOrBlackBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public String placeBetLogic() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	public boolean betIsMadeLogic(Wheel wheel, String s) {
		 return wheel.getColor().equals(s);
	}

}
