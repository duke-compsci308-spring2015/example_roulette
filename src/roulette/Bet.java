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

    /**
     * @return name of this kind of bet
     */
    public String getDescription () {
        return myDescription;
    }

    /**
     * Implement with what should appear on the console to prompt user to type in their bet
     * 
     * @return user input
     */
    public abstract String placeBetPrompt ();

    /**
     * Returns whether the user's bet wins during the current roll
     * 
     * @param wheel Wheel object
     * @param choice string of the user's bet choice
     * @return true if the user wins this round
     */
    public abstract boolean betWins (Wheel wheel, String choice);
}
