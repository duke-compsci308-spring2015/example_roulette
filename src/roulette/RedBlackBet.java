package roulette;

import util.ConsoleReader;


public class RedBlackBet extends Bet {

	public RedBlackBet(){
		super("Red or black",1);
	}
	public String apply(){
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	public boolean betIsMade(String betChoice, Wheel myWheel){
		return myWheel.getColor().equals(betChoice);
	}
}	
