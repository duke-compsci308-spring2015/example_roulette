package roulette;

import util.ConsoleReader;

public class HiLowBet extends Bet{

	public HiLowBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String placeBet() {
		// TODO Auto-generated method stub
		return ConsoleReader.promptOneOf("Please bet", "high", "low");
	}

	@Override
	public boolean checkWinConditions(Wheel myWheel, String betChoice) {
        return (betChoice.equals("High")&& myWheel.getNumber()>18)|| (betChoice.equals("low")&&myWheel.getNumber() <19);
	}

}
