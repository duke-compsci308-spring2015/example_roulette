package roulette;

import util.ConsoleReader;

public class ThreeInARowBet extends Bet{

	public ThreeInARowBet() {
		super("Three in a Row", 11);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String promptConsole() {
		// TODO Auto-generated method stub
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	protected boolean determineSuccess(Wheel wheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}

}
