package roulette;

import util.ConsoleReader;

public class HighLowBet extends Bet{

	public HighLowBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "high", "low");
		
		
	}

	@Override
	public boolean betIsMade(Wheel w, String betChoice) {
		return (w.getNumber() >18 && w.getNumber()<37 && betChoice.equals("high")) ||
               (w.getNumber() >0 && w.getNumber()<19 && betChoice.equals("low"));
	}

}
