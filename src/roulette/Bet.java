package roulette;


/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public class Bet {
    private String myDescription;
    private int myOdds;
    private Wheel myWheel;


    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds,Wheel wheel) {
        myDescription = description;
        myOdds = odds;
        myWheel = wheel;
    }

    public Wheel getWheel(){
    	return myWheel;
    }
    
    /**
     * @return odds given by the house for this kind of bet
     */
    public int getOdds () {
        return myOdds;
    }

    /**
     * @return name of this kind of bet
     */
    public String getDescription () {
        return myDescription;
    }
    
    /**
     * Place the given bet by prompting user for specific information need to complete that bet.
     *
     * @param whichBet specific bet chosen by the user
     */
    public String placeBet() {
		System.out.println();
		return null;
    }
    
    public boolean betIsMade (String betChoice) {
    	return false;
    }

}
