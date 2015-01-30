package bet;

import roulette.Wheel;
import util.ConsoleReader;

public class BetRedBlack extends Bet {
	
	public BetRedBlack(String description, int odds){
		super(description, odds);
	}
	
	@Override
	public String placeBet() {
        return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	public boolean checkBet(Wheel myWheel, String betChoice) {
		return myWheel.getColor().equals(betChoice);
	}

}
