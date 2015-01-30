package roulette;

import util.ConsoleReader;

public class RedAndBlack extends Bet{
	
	public RedAndBlack(String description, int odds,Wheel wheel) {
		super(description, odds,wheel);
		// TODO Auto-generated constructor stub
	}
	
	public String placeBet () {
		String result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		return result;
	}

    public boolean betIsMade (String betChoice) {
        return this.getWheel().getColor().equals(betChoice);
    }
}
