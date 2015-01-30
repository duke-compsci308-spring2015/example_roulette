# example_roulette
Program to refactor that plays a game of roulette
jz113 yzz2

##Refactor the code
1.  A Bet class should have a placeBet method that prompts the user to make an appropriate input according to the kind of bet, ie. either odd or even for an EvenBet. It should also have a betIsMade boolean to check according to the rules of the bet whether or not the bet is a winning bet.
2. We could've made a new method to prompt the user to get the bet amount and close that for modification. 
3. We can completely implement the getOdds and the getDescription methods in the Bet superclass, but the subclasses have to implement betIsMade and placeBet.
4. The game decides on which Bet subclass to be made using the myPossibleBets array.

##Add new features
1. The refactored code is simpler because there is less repeated code and long if statements due to our inheritance hierarchy. 
2. The refactored classes are more complex because we have more parameters being passed in.
3. Because the refactored subclasses have access to objects like the Wheel class, they arguably work with data that it shouldn't necessarily need to have access to. Also there is some duplicated code and we have more lines in total.
4. We prefer the refactored code because it was much easier to extend and add the new bet classes, using the knowledge of the properties of the bet.
