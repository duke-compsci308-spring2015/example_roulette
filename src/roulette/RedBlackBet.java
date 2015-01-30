package roulette;

import util.ConsoleReader;

public class RedBlackBet extends Bet {
	
	private String myDescription;
	private int myOdds;

	public RedBlackBet(String description, int odds) {
		super(description, odds);
		myDescription = description;
		myOdds = odds;
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return myWheel.getColor().equals(betChoice);
		
	}

	@Override
	public int getOdds() {
		// TODO Auto-generated method stub
		return myOdds;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return myDescription;
	}

}
