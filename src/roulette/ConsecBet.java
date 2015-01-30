package roulette;

import util.ConsoleReader;

public class ConsecBet extends Bet {
	private static int CONSEC;
	
	public ConsecBet() {
		super("Consecutive Numbers Bet", 35);
		CONSEC = ConsoleReader.promptRange("Enter 1, 2, or 3 as number of consecutive numbers", 1, 3);
		super.setOdds(35/CONSEC);
	}
	
	/**
     * Place the given bet by prompting user for specific information need to complete that bet.
     *
     * @param whichBet specific bet chosen by the user
     */
    public String placeBet () {
        return "" + ConsoleReader.promptRange("Enter first of " + CONSEC + " consecutive numbers", 1, Wheel.NUM_SPOTS - CONSEC);
    }

	public boolean betIsMade(Wheel myWheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (Math.abs(start - myWheel.getNumber()) < CONSEC);
	}

}
