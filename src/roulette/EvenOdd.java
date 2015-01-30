package roulette;

/**
 * 
 * @author Kei Yoshikoshi & Nina Sun
 *
 */
public class EvenOdd extends Bet {
	public EvenOdd(String description, int odds){
		super(description, odds);
	}

	protected String placeBet () {
		return print("even","odd");
	}

	protected boolean betIsMade (Wheel wheel, String betChoice) {
		return (wheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
				(wheel.getNumber() % 2 == 1 && betChoice.equals("odd"));

	}
}
