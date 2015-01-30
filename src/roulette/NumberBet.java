package roulette;

import util.ConsoleReader;

public class NumberBet extends Bet {

	public NumberBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	protected String placeBet() {
		// TODO Auto-generated method stub
		String result = ""
				+ ConsoleReader.promptRange(
						"Enter first of three consecutive numbers", 1,
						Wheel.NUM_SPOTS - 3);
		System.out.println();
		return result;
	}

	@Override
	protected boolean betIsMade(Wheel w, String betChoice) {
		// TODO Auto-generated method stub
		int start = Integer.parseInt(betChoice);
		return (start <= w.getNumber() && w.getNumber() < start + 3);

	}
}
