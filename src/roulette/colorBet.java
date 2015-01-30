package roulette;

import util.ConsoleReader;

public class colorBet extends Bet{

    public colorBet (String description, int odds) {
        super(description, odds);
    }
    
    public String betPrompt(){
        return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
    }
    
    public boolean checkResult(String betChoice, Wheel myWheel){
        return myWheel.getColor().equals(betChoice);
    }
}
