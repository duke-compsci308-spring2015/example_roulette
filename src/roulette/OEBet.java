package roulette;

import util.ConsoleReader;

public class OEBet extends Bet{
	private boolean isEven;
	
	public OEBet(String description, int odds) {
		super(description, odds);
	}
	
	public void placeBet(){
		isEven = ConsoleReader.promptOneOf("Please bet", "even", "odd").equals("even");
	}
	
	public boolean betIsMade(Wheel wheel) {
		return !(wheel.getNumber() % 2 == 0 ^ isEven);
	}
	
}
