package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet{
	
	public ColorBet(String string, int i){
		super(string, i);
	}
	
	public String placeBet(){
        System.out.println();
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
	public boolean betIsMade(Wheel w, String betChoice) {
        return w.getColor().equals(betChoice);
	}

}
