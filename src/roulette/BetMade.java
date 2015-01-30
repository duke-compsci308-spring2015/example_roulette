package roulette;

import util.ConsoleReader;

public abstract class BetMade {
	/**
	 * Place the given bet by prompting user for specific information need to
	 * complete that bet.
	 *
	 * @param whichBet
	 *            specific bet chosen by the user
	 */
	protected abstract String placeBet(int whichBet);

	// String result = "";
	// if (whichBet == 0) {
	// result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	// }
	// else if (whichBet == 1) {
	// result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
	// }
	// else if (whichBet == 2) {
	// result = "" +
	// ConsoleReader.promptRange("Enter first of three consecutive numbers",
	// 1, Wheel.NUM_SPOTS - 3);
	// }
	// System.out.println();
	// return result;

	/**
	 * Checks if the given bet is won or lost given user's choice and result of
	 * spinning the wheel.
	 *
	 * @param whichBet
	 *            specific bet chosen by the user
	 * @param betChoice
	 *            specific value user chose to try to win the bet
	 */
	protected abstract boolean betIsMade(int whichBet, String betChoice);
	// if (whichBet == 0) {
	// return myWheel.getColor().equals(betChoice);
	// }
	// else if (whichBet == 1) {
	// return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
	// (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	// }
	// else if (whichBet == 2) {
	// int start = Integer.parseInt(betChoice);
	// return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	// }
	// else {
	// return false;
	// }
	// }
}