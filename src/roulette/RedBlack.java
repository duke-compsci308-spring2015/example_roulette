package roulette;

/**
 * 
 * @author Kei Yoshikoshi & Nina Sun
 *
 */

public class RedBlack extends Bet {
	public RedBlack(String description, int odds){
		super(description, odds);
	}
	protected String placeBet () {
        return print("black", "red");
    }
	
	protected boolean betIsMade (Wheel wheel, String betChoice) {
            return wheel.getColor().equals(betChoice);
	}
	
}
