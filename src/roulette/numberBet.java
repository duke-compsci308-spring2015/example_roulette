package roulette;

import util.ConsoleReader;

public class numberBet extends Bet {

    public numberBet (String description, int odds) {
        super(description, odds);
    }
    public String betPrompt(){
        return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",1, Wheel.NUM_SPOTS - 3);
    }
    
    public boolean checkResult(String betChoice, Wheel myWheel){
        int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
    }
}
