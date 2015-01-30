package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet {

	public NumberBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	public boolean betIsMade (String betChoice, Object[] results){
		int start = Integer.parseInt(betChoice);
		return (start <= (Integer)results[1] && (Integer)results[1] < start + 3);
	}

	@Override
	public String placeBet() {
		// TODO Auto-generated method stub
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}
}
