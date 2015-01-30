package roulette;

import util.ConsoleReader;

public class RbBet extends Bet{

	public RbBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String placeBet() {
		// TODO Auto-generated method stub
		String result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		System.out.println();
		return result;
	}

	@Override
	protected boolean betIsMade(Wheel w, String betChoice) {
		// TODO Auto-generated method stub

		return w.getColor().equals(betChoice);
		
	}


}
