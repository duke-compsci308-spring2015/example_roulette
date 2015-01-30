package roulette;

import util.ConsoleReader;

public class EvenOddBet extends Bet{

	public EvenOddBet(String string, int i){
		super(string, i);
	}
	
	public String placeBet(){
        System.out.println();
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
	
	public boolean betIsMade(Wheel w, String betChoice) {
		return (w.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (w.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
}
