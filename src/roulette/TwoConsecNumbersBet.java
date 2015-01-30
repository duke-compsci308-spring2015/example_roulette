package roulette;

import util.ConsoleReader;

public class TwoConsecNumbersBet extends Bet {

	public TwoConsecNumbersBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public String placeBetLogic() {
		return "" + ConsoleReader.promptRange("Enter first of two consecutive numbers",
                1, Wheel.NUM_SPOTS - 2);
	}

	@Override
	public boolean betIsMadeLogic(Wheel wheel, String s) {
		 int start = Integer.parseInt(s);
         return (start <= wheel.getNumber() && wheel.getNumber() < start + 2);
	}

}
