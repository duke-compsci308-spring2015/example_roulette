package roulette;

import util.ConsoleReader;

public class OEBet extends Bet{

	public OEBet() {
		super("Odd or Even", 1);
	}
	
	public String place() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
	
	public boolean isMade(Wheel w, String betChoice){
		return (w.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (w.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
	
}
