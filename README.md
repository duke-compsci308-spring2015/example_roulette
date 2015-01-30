# example_roulette
Program to refactor that plays a game of roulette
Written by: James Mosca and Kyle Milden

**Analysis**

1. Eliminating the if statements in Game reduces complications for adding futher types of bets. We don't need to add more else if statements etc. We added a new class for each new type of bet that could be made. 

2. While this makes it easier to add future bet classes, there are more classes in our program than there were to begin with. Each of these classes required us to Override methods betIsMade, placeBet, getOdds, and getDescription.

3. We had to add more classes in order to create our implementation. This makes the overall program look more complicated. However, our changes made it easier to add classes for bets in the future. Also, the code is more readable in the Game class because the betIsMade and placeBet methods are shorter. 

4. I prefer the new way, because it is easier to add new types of bets in the future. The code in Game.java looks nicer. While it might not necessarily be worth the additional 3 classes now, if 5 or 6 more classes were added then the payoff would be clear.