package roulette;

import util.ConsoleReader;

public class OddEvenBet extends Bet {
	
	private String myDescription;
	private int myOdds;

	public OddEvenBet(String description, int odds) {
		super(description, odds);
		myDescription = description;
		myOdds = odds;
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
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
