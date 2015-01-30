package roulette;

import util.ConsoleReader;

public class HiLoBet extends Bet{
	
	
	public HiLoBet() {
		super("HiLoBet", 1);
		// TODO Auto-generated constructor stub
	}
	
	public String place(){
		return ""+ ConsoleReader.promptOneOf("Please bet", "High", "Low");
	}
	
	public boolean isMade(Wheel w, String betChoice){
		return ((w.getNumber() <= Wheel.NUM_SPOTS/2 && betChoice.equalsIgnoreCase("Low")) ||
				(w.getNumber() >= Wheel.NUM_SPOTS/2 && betChoice.equalsIgnoreCase("High")));
	}
	
	
	
}
