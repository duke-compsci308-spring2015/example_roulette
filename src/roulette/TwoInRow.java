package roulette;

public class TwoInRow extends Bet {
	public TwoInRow(String description, int odds) {
		super(description,odds);
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
