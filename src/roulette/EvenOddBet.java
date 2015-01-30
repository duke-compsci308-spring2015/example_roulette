package roulette;

import util.ConsoleReader;

public class EvenOddBet extends Bet {

	public EvenOddBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		// TODO Auto-generated method stub
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
		}

	@Override
	public String placeBet(int whichBet) {
		// TODO Auto-generated method stub
		return "\n" + ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

}
