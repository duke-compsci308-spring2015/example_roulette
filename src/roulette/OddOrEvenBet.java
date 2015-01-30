package roulette;

import util.ConsoleReader;

public class OddOrEvenBet extends Bet{

	public OddOrEvenBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public String placeBetLogic() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	@Override
	public boolean betIsMadeLogic(Wheel wheel, String s) {
		return (wheel.getNumber() % 2 == 0 && s.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && s.equals("odd"));
	}

	

}
