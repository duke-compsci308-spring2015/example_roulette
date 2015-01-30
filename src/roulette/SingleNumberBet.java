package roulette;

import util.ConsoleReader;

public class SingleNumberBet extends Bet{

	public SingleNumberBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String placeBetLogic() {
		return "" + ConsoleReader.promptRange("Choose a number",
                0, Wheel.NUM_SPOTS - 1);
	}

	@Override
	public boolean betIsMadeLogic(Wheel wheel, String s) {
		return wheel.getNumber() == Integer.parseInt(s);
	}

}
