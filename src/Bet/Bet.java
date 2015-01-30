package Bet;

import roulette.Wheel;


/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public abstract class Bet {
    private String myDescription;
    private int myOdds;
    protected Wheel myWheel;

    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds) {
        myDescription = description;
        myOdds = odds;
        myWheel = new Wheel();
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
    
    public abstract String askBet();
    public abstract boolean winOrLose(String betChoice);
}
