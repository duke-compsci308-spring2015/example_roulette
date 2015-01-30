package roulette;

import util.ConsoleReader;

public class OddEvenBet extends Bet{

	public OddEvenBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String placeBet() {
		
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	@Override
	public boolean betIsMade(Wheel w, String betChoice) {
		return (w.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (w.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

}
