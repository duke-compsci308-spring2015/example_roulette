package bet;

import roulette.Wheel;
import util.ConsoleReader;

public class BetNumber extends Bet {

	public BetNumber(String description, int odds){
		super(description, odds);
	}
	
	@Override
	public String placeBet() {
        return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                                                1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	public boolean checkBet(Wheel myWheel, String betChoice) {
        int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

}
