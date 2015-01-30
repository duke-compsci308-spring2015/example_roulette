package roulette;

import util.ConsoleReader;

public class OEBet extends Bet{

	public OEBet(String description, int odds) {
		super(description, odds);

	}
	public String printPrompt() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
	
	@Override
	public boolean makeBet(String choice, Wheel wheel){
		return (wheel.getNumber() % 2 == 0 && choice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && choice.equals("odd"));
	}
	
}
