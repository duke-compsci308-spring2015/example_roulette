package roulette;

import util.ConsoleReader;

public class OddEvenBet extends Bet {

	public OddEvenBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	public boolean betIsMade (String betChoice, Object[] results){
		return ((Integer)results[1] % 2 == 0 && betChoice.equals("even")) ||
		((Integer)results[1] % 2 == 1 && betChoice.equals("odd"));
	}

	@Override
	public String placeBet() {
		// TODO Auto-generated method stub
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
	
	
	
	

}
