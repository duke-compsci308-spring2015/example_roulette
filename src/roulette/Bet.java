package roulette;



/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
abstract class Bet {
    private int myOdds;
    private String myDescription;

    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String desc, int odds) {
    	myDescription = desc;
        myOdds = odds;
    }

    /**
     * @return odds given by the house for this kind of bet
     */
    public int getOdds () {
        return myOdds;
    }
    
    public String getDescription(){
    	return myDescription;
    }
    
    public void setOdds(int odds) {
    	myOdds = odds;
    }

    /**
     * Place the given bet by prompting user for specific information need to complete that bet.
     *
     * @param whichBet specific bet chosen by the user
     */
    public abstract String placeBet ();
    
    /**
     * Checks if the given bet is won or lost given user's choice and result of spinning the wheel.
     *
     * @param whichBet specific bet chosen by the user
     * @param betChoice specific value user chose to try to win the bet
     */
    public abstract boolean betIsMade (Wheel myWheel, String betChoice);

}
