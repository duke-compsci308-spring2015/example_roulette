package roulette;

import util.ConsoleReader;

public class HighLowBet extends Bet {

	public HighLowBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public String placeBetLogic() {
		return ConsoleReader.promptOneOf("Please bet", "high", "low");
	}

	@Override
	public boolean betIsMadeLogic(Wheel wheel, String s) {
		return (wheel.getNumber() < 19 && s.equals("low")) || 
				(wheel.getNumber() >= 19 && s.equals("high"));
	}

}
