package roulette;

import util.ConsoleReader;

public class ThreeRowBet extends Bet{
	
	public ThreeRowBet() {
		super("Three in a Row", 11);
	}
	
	public String place() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}
	
	public boolean isMade(Wheel w, String betChoice){
		int start = Integer.parseInt(betChoice);
        return (start <= w.getNumber() && w.getNumber() < start + 3);
	}
	

}
