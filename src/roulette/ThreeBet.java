package roulette;

import util.ConsoleReader;

public class ThreeBet extends Bet{

	public ThreeBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

	@Override
	public String placeBet(int whichBet) {
		// TODO Auto-generated method stub
		return "\n" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

}
