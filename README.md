# example_roulette

Contributors: Sierra Smith, Michael Mendelsohn

All of the if statements in Game.java were very ugly and cluttering the program.  To eliminate them, we created a hierarchy of bets.  Each specific type of bet extends Bet, and implements the abstract methods in Bet according to their specific functionality.  These abstract methods replace the methods in Game that had ugly if statements based on the type of bet.  

The new code is simpler because it is easier to read and there are no if-statement trees.  However, it could also be considered more complex because we have more classes and, in the current implementation, we have to keep track of one instance of each type of bet at all times. It would also take more memory to create multiple types of bets, rather than having just one.