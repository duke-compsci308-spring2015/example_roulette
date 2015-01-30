package roulette;

import util.ConsoleReader;
/**
 * 
 * @author Kei Yoshikoshi & Nina Sun
 *
 */
public class ThreeInRow extends Bet {
	public ThreeInRow(String description, int odds){
		super(description, odds);
	}

	protected String placeBet () {     
		String result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
				1, Wheel.NUM_SPOTS - 3);
		System.out.println();
		return result;
	}

	protected boolean betIsMade (Wheel wheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
		return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}
}
