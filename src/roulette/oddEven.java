package roulette;

import util.ConsoleReader;

public class oddEven extends Bet{
	
	public oddEven(String des, Integer odd){
		super(des, odd);
	}
	
	public String placeBet(int whichBet) {
		String result = "";
		result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		return result;

	}

	public boolean betIsMade(int whichBet, String betChoice, Wheel myWheel) {
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

}
