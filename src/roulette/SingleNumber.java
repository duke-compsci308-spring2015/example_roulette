package roulette;

public class SingleNumber extends Bet {
	public SingleNumber(String description, int odds) {
		super (description,odds);
	}
	@Override
	protected String placeBet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean betIsMade(Wheel wheel, String betChoice) {
		// TODO Auto-generated method stub
		return false;
	}

}
