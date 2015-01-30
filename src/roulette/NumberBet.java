package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet {

	public NumberBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public boolean checkWin(Wheel w, String choice) {
		int start = Integer.parseInt(choice);
		return (start <= w.getNumber() && w.getNumber() < start + 3);
	}

	@Override
	public String placeBet() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

}
