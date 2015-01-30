package roulette;

import util.ConsoleReader;

public class Refactored_Bet1 extends Refactored_Bet {


	public Refactored_Bet1(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	String placeBet (int whichBet) {
		String result = "";
		result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		System.out.println();
		return result;
	}

	public boolean checkBet(String s, int i, Wheel w){
		return (w.getNumber() % 2 == 0 && s.equals("even")) ||
				(w.getNumber() % 2 == 1 && s.equals("odd"));

	}
}
