package roulette;

import util.ConsoleReader;

public class threeInRow extends Bet{
	
	public threeInRow(String des, Integer odd){
		super(des, odd);
	}
	
	public String placeBet(int whichBet) {
		String result = "";
		result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
		return result;

	}

	public boolean betIsMade(int whichBet, String betChoice, Wheel myWheel) {
		 int start = Integer.parseInt(betChoice);
         return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

}
