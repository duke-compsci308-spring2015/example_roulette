package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet{

	public ColorBet() {
		super("Red or Black", 1);
	}
	
	
	public String place(){ 
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);	
	}
	
	public boolean isMade(Wheel w, String betChoice){
		return w.getColor().equals(betChoice);
	}
}
