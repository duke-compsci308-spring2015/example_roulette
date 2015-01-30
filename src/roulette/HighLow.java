package roulette;


public class HighLow extends Bet {
	public HighLow(String description, int odds){
		super(description, odds);
	}

	@Override
	protected String placeBet() {
		return print("high", "low");
	}

	@Override
	protected boolean betIsMade(Wheel wheel, String betChoice) {
		// TODO Auto-generated method stub
		return false;
	}

}
