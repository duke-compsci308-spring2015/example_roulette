package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet {
	public NumberBet(){
		super("Three in a Row", 11);
	}
	public String apply(){
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",1, Wheel.NUM_SPOTS - 3);
	}
	public boolean betIsMade(String betChoice, Wheel myWheel){
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}
}
