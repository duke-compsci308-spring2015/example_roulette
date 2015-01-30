package roulette;

import util.ConsoleReader;

public class OEBet extends Bet {
	public OEBet(){
		super("Odd or Even", 1);
	}
	public String apply(){
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
	public boolean betIsMade(String betChoice, Wheel myWheel){
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
}
