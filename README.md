# example_roulette
Program to refactor that plays a game of roulette

Leo Feldman
Sunjeev Devulapalli

In what ways is the refactored code simpler?
There is no more excess if/else if statement logic, so it is extremely easy to just add new kinds of bets.  This way, someone from the outside could easily add a bet type, because it extends Bet, and requires you to implement certain methods.  Now, you no longer have to know the specific methods in Game in which you need to add logic.

In what ways is the refactored code more complex?
There are now 6 more classes, and to create different types of bets, you now need to create another class, with a constructor and two methods.


What trade-offs did you make when refactoring your old code?
We do have a few extra lines of code.


Which code do you prefer and why?
The new code, because it is more easily extendable.