package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet{

	public ColorBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	public boolean betIsMade (String betChoice, Object[] results){
		return results[0].equals(betChoice);
	}
	
	public String placeBet(){
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
}
