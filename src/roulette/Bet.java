package roulette;


/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public abstract class Bet {


    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds) {

    }

    /**
     * @return odds given by the house for this kind of bet
     */
    public abstract int getOdds();

    /**
     * @return name of this kind of bet
     */
    public abstract String getDescription();
    
    public abstract String placeBet();
    
    public abstract boolean betIsMade(Wheel myWheel, String betChoice);
}
