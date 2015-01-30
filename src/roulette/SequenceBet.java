package roulette;

import util.ConsoleReader;

public class SequenceBet extends Bet {

	public SequenceBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void placeBet() {
        betChoice =  "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	public boolean betIsMade(Wheel myWheel) {
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}
}
