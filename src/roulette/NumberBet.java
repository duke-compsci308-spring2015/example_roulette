package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet{

	public NumberBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	public String printPrompt() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",1, Wheel.NUM_SPOTS - 3);
	}
	@Override
	public boolean makeBet(String choice, Wheel wheel) {
		int start = Integer.parseInt(choice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}
	
}
