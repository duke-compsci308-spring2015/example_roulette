package roulette;

import util.ConsoleReader;

public class OddOrEvenBet extends Bet {

	public OddOrEvenBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	public String betString(){
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
	
	public boolean betResults(Wheel myWheel, String betChoice) {
		 return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                 (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
}
