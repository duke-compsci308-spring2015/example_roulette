package roulette;

import util.ConsoleReader;

public class OddEvenBet extends Bet {

	public OddEvenBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public boolean checkWin(Wheel w, String choice) {
		return (w.getNumber() % 2 == 0 && choice.equals("even")) ||
                (w.getNumber() % 2 == 1 && choice.equals("odd"));
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

}
