package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet {

	private String betChoice;
	
	public ColorBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	public void setChoice(String s){
		betChoice = s;
	}
	
	public String getChoice(){
		return betChoice;
	}
	
	@Override
	public String printPrompt() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
	@Override
	public boolean makeBet(String choice, Wheel wheel){
		return wheel.getColor().equals(betChoice);
	}
	
	
}
