
package roulette;

import util.ConsoleReader;

public class SingleNumberBet extends Bet{
	public SingleNumberBet() {
		super("Single Number", 35);
		// TODO Auto-generated constructor stub
	}
	
	public String place(){
		return ""+ ConsoleReader.promptRange("Enter a number in the following Range", 1, Wheel.NUM_SPOTS-1);
	}
	
	public boolean isMade(Wheel w, String betChoice){
		return (Integer.parseInt(betChoice) == w.getNumber());
	}

}
