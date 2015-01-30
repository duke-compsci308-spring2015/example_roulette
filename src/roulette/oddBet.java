package roulette;

import util.ConsoleReader;

public class oddBet extends Bet {

    public oddBet (String description, int odds) {
        super(description, odds);
    }
    
    public String betPrompt(){
        return ConsoleReader.promptOneOf("Please bet", "even", "odd");
    }
    
    
    public boolean checkResult(String betChoice, Wheel myWheel){
        return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
    }
}
