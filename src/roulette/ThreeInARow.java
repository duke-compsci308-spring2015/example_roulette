package roulette;

import util.ConsoleReader;

public class ThreeInARow extends Bet{
	private int myStart;
	
	public ThreeInARow(String description, int odds) {
		super(description, odds);
	}
	
	public void placeBet(){
		myStart = ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}
	
	public boolean betIsMade(Wheel wheel) {
		return (myStart <= wheel.getNumber() && wheel.getNumber() < myStart + 3);
	}
	
}
