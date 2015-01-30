# example_roulette
Program to refactor that plays a game of roulette

Robert Vann (rcv4) and Sid Gopinath (sdg23)

It is relatively hard to add a new way to bet on the roulette game. In order to do so, you have hard code the specifics of the way of betting into the game class. That means adding if statements in the placeBet and betIsMade method. This makes it hard to extend while also not being completely closed to modification (since the if statements are just part of the game class).

In refactoring the code, we made the Bets class abstract and implemented sub methods for each type of Bet. As part of the bet class, we added abstract methods called `getPrompt` and `compareBet`. These methods contain the logic that was previously contained in the `placeBet` and `betIsMade` classes, respectively. With these methods implemented in the specific bet ways, we modify the game code to just call these methods on whichever respective class the user selects.

We also changed how the game class keeps track of the particular type of bet the user selects. Instead of using passing an integer into the `placeBet` and `betIsMade` methods, we use the users selection to set an instance variable `myCurrentBet` to an instance of a bet.