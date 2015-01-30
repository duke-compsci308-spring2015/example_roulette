package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet {
	
	private String myDescription;
	private int myOdds;

	public NumberBet(String description, int odds) {
		super(description, odds);
		myDescription = description;
		myOdds = odds;
	}

	@Override
	public String placeBet() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
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
