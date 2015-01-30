package roulette;

import util.ConsoleReader;

public class ThreeInARow extends Bet{

	public ThreeInARow(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	public String getPrompt() {
		// TODO Auto-generated method stub
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, Wheel.NUM_SPOTS - 3);
	}

	public boolean compareBet(Wheel wheel, String betChoice) {
		// TODO Auto-generated method stub
		 int start = Integer.parseInt(betChoice);
         return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}

}
