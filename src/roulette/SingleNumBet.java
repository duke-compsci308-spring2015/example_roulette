package roulette;

import util.ConsoleReader;

public class SingleNumBet extends Bet{

	public SingleNumBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String placeBet() {
		
		return "" + ConsoleReader.promptInt("Enter one number");
	}

	@Override
	public boolean betIsMade(Wheel w, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start == w.getNumber());
	}

}
