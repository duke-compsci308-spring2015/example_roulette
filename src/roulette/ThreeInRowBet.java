package roulette;

import util.ConsoleReader;

public class ThreeInRowBet extends Bet{

	public ThreeInRowBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String placeBet() {
		
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	public boolean betIsMade(Wheel w, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= w.getNumber() && w.getNumber() < start + 3);
	}

}
