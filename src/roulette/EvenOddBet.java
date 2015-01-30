package roulette;

import util.ConsoleReader;

public class EvenOddBet extends Bet {

	public EvenOddBet() {
		super("Odd or Even", 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String promptConsole() {
		// TODO Auto-generated method stub
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	@Override
	protected boolean determineSuccess(Wheel wheel, String betChoice) {
		return (wheel.getNumber() % 2 == 0 && betChoice.equalsIgnoreCase("even")) ||
                (wheel.getNumber() % 2 == 1 && betChoice.equalsIgnoreCase("odd"));
	}

}
