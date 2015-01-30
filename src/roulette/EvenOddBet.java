package roulette;

import util.ConsoleReader;

public class EvenOddBet extends Bet {

	public EvenOddBet() {
		super("Even/Odd Bet",1);
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Place the given bet by prompting user for specific information need to complete that bet.
     *
     * @param whichBet specific bet chosen by the user
     */
    public String placeBet () {
        return ConsoleReader.promptOneOf("Please bet", "even", "odd");
    }
    
    /**
     * Checks if the given bet is won or lost given user's choice and result of spinning the wheel.
     *
     * @param whichBet specific bet chosen by the user
     * @param betChoice specific value user chose to try to win the bet
     */
    public boolean betIsMade (Wheel myWheel, String betChoice) {
            return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                   (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
    }

}
