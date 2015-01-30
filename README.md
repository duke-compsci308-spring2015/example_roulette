Names: Nathan Prabhu and Tom Puglisi

# example_roulette
Program to refactor that plays a game of roulette

1) In what ways is the refactored code simpler?

 The game class is more readable. We got rid of two now unnecessary methods with the Game class and outsourced them to each specific bet. Within those methods, there were bad "if" statements for each type of bet. These are no longer needed because of polymorphism of Bet, which allows us to call getPrompt() and getOutcome once for any type of bet.

  Our code is now more "open" because one can easily add more Bet types by simply adding to the Bet array.

2) In what ways is the refactored code more complex?

There are more classes to consider now. All the logic is spread out among the new subclasses, and so it might make it more difficult to find certain methods. 

3) What trade-offs did you make when refactoring your old code?

One trade-off we made is the spreading out of the logic. The old code had all logic for each bet type together, which made it easier to see the differences between bet types. To compare the logic now, one has to look at the corresponding methods in each subclass. 

4) Which code do you prefer and why?

We prefer the refactored code because it is simpler to add new Bets now. Although the logic is buried, the Game class is now far more readable and concise. In the old method, adding new bets would result in more and more booleans, which would not only take more time, but would result in cluttered code very quickly. The new code also reduces duplicated code.