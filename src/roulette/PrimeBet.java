package roulette;

import java.util.ArrayList;
import java.util.Collections;

import util.ConsoleReader;

public class PrimeBet extends Bet{
	private ArrayList<Integer> primes = new ArrayList<Integer>();
	public PrimeBet() {
		super("Prime or Non-prime", 3);
		Collections.addAll(primes, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
	}

	@Override
	protected String promptConsole() {
		return ConsoleReader.promptOneOf("Please bet", "Prime", "Non-prime");
	}

	@Override
	protected boolean determineSuccess(Wheel wheel, String betChoice) {
		return (primes.contains(wheel.getNumber()) && betChoice.equalsIgnoreCase("prime")) ||
				(!primes.contains(wheel.getNumber()) && betChoice.equalsIgnoreCase("non-prime"));
	}

}
