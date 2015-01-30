package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet{
	public NumberBet (String string, int i){
		super(string, i);
	}
	
	public String placeBet(){
		return "" + ConsoleReader.promptRange("Enter a number between 1 and 35",
                1, 35);
	}
	
	public boolean betIsMade(Wheel w, String betChoice) {
        return (w.getNumber() == (int)(Math.random()*35));
       }
}
