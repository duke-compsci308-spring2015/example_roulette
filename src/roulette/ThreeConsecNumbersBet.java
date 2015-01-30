package roulette;

import util.ConsoleReader;

public class ThreeConsecNumbersBet extends Bet {

	public ThreeConsecNumbersBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public String placeBetLogic() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	public boolean betIsMadeLogic(Wheel wheel, String s) {
		 int start = Integer.parseInt(s);
         return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}

}
