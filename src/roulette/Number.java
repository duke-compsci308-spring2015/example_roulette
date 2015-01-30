package roulette;

import util.ConsoleReader;

public class Number extends Bet {
	int myNum;

	public Number(int num, int odds) {
		super(num + "number", odds);
		myNum = num;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean betIsMade(String choice, Wheel wheel) {
		int start = Integer.parseInt(choice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + myNum);
	}

	@Override
	public String placeBet() {
		return  "" + ConsoleReader.promptRange("Enter first of " + myNum + " consecutive numbers",
                1, Wheel.NUM_SPOTS - myNum);
	}

}
