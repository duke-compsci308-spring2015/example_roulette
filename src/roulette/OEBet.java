package roulette;

import util.ConsoleReader;

public class OEBet extends Bet {

	public OEBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String placeBet() {
		// TODO Auto-generated method stub
		String result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
    System.out.println();
    return result;
	}

	@Override
	protected boolean betIsMade(Wheel w, String betChoice) {
		// TODO Auto-generated method stub
		return (w.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (w.getNumber() % 2 == 1 && betChoice.equals("odd"));
		
	}
}
