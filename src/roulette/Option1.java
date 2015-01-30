package roulette;

import util.ConsoleReader;

public class Option1 extends Refactored_Bet {

	public Option1(String string, int i) {
		// TODO Auto-generated constructor stub
		super(string,i);
	}

	String placeBet (int whichBet) {
		String result = "";
			result = ConsoleReader.promptOneOf("Please bet", Wheel.HIGH, Wheel.LOW);
		System.out.println();
		return result;
	}
	
	public boolean checkBet(String s, int i, Wheel w){
		if (w.getNumber()>=16){
			return Wheel.HIGH.equals(s);
		}
		else{
			return Wheel.LOW.equals(s);
		}	
	}

}
