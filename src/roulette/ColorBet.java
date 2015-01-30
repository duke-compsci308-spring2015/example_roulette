package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet {

	public ColorBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		// TODO Auto-generated method stub
		return myWheel.getColor().equals(betChoice);
		}

	@Override
	public String placeBet(int whichBet) {
		// TODO Auto-generated method stub
		return "\n" + ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

}
