package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet {

	public NumberBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	public String placeBet() {
		 return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                 1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		 int start = Integer.parseInt(betChoice);
         return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

}
