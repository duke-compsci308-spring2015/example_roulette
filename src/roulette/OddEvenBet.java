package roulette;

import util.ConsoleReader;

public class OddEvenBet extends Bet {
	public OddEvenBet(String description, int odds) {
		super(description, odds);
	}
	
	@Override
	public boolean checkWinConditions(Wheel myWheel, String betString) {
		 return (myWheel.getNumber() % 2 == 0 && betString.equals("even")) ||
                 (myWheel.getNumber() % 2 == 1 && betString.equals("odd"));
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}


}
