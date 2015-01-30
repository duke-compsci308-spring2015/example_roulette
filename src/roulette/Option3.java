package roulette;

import util.ConsoleReader;

public class Option3 extends Refactored_Bet {

	public Option3(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	String placeBet (int whichBet) {
		String result = "";
		result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
				1, Wheel.NUM_SPOTS - 3);
		System.out.println();
		return result;
	}

	public boolean checkBet(String s, int i, Wheel w){
		int start = Integer.parseInt(s);
		return (start <= w.getNumber() && w.getNumber() < start + 3);

	}
	
}
