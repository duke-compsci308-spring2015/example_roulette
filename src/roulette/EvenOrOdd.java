package roulette;

import util.ConsoleReader;

public class EvenOrOdd extends Bet{

	public EvenOrOdd(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	public String getPrompt() {
		// TODO Auto-generated method stub
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	public boolean compareBet(Wheel wheel, String betChoice) {
		// TODO Auto-generated method stub
		return (wheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

}
