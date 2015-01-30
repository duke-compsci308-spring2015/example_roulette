package roulette;


/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public abstract class Bet {
    private String myDescription;
    private int myOdds;

    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds) {
        myDescription = description;
        myOdds = odds;
    }

    /**
     * @return odds given by the house for this kind of bet
     */
    public int getOdds () {
        return myOdds;
    }
    
    public abstract String placeBet();

    /**
     * @return name of this kind of bet
     */
    public String getDescription () {
        return myDescription;
    }
    
    public int returnWinningsAndPrintResults(Wheel myWheel, String betChoice){
    	if(checkWinConditions(myWheel, betChoice)){
    		System.out.println("*** Congratulations :) You win ***");
    		return this.getOdds();
    	}
    	else{
    		System.out.println("*** Sorry :( You lose ***");
    	return -1;
    }
    }
    public abstract boolean checkWinConditions(Wheel myWheel, String betChoice);
}
