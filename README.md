### Analysis of Example_Roulette

By Jeremy Fox and Cosette Goldstein

#### Discussion of Bet Hierarchy
* We refactored methods in the Game Class to reflect different types of bets to eliminate if/else statements. Since there are currently 3 different types of Bets in the Game, we extended the Bets class to have different bets (red or black, odd or even, and three in a row), each of which had methods to have unique actions to replace if statements.

* We think this is a good design so we can add new types of bets without assigning arbitrary integers, and the Game Class is closed to adding a new type of bet. No if/else statements need to be added because of this. The Game Class is much simpler now, and changes can be made in the betString() and betResults() in the Bet subclasses opposed to convoluted Game class. 