package roulette;

import util.ConsoleReader;

public class EvenAndOdd extends Bet {

	public EvenAndOdd(String description, int odds, Wheel wheel) {
		super(description, odds, wheel);
		// TODO Auto-generated constructor stub
	}
	public String placeBet () {
		String result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		System.out.println();
		return result;
	}

    public boolean betIsMade (String betChoice) {
        return (this.getWheel().getNumber() % 2 == 0 && betChoice.equals("even")) ||
                   (this.getWheel().getNumber() % 2 == 1 && betChoice.equals("odd"));
        }

}
