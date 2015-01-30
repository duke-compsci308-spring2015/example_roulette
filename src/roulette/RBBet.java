package roulette;

import util.ConsoleReader;

public class RBBet extends Bet{
	private String color;
	
	public RBBet(String description, int odds) {
		super(description, odds);
	}
	
	public void placeBet(){
		color = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
	public boolean betIsMade(Wheel wheel) {
		return wheel.getColor().equals(color);
	}
	
}
