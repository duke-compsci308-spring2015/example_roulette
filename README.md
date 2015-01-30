### example_roulette

Names: Andrew Sun (as515), Tony Qiao (zq8)

For this recitation, we refactored game, bet, and added new features by adding three additional types of bets to our code.

## Questions

1. In what ways is the refactored code simpler?
* The refactored code is simpler through getting rid of the duplicated if statement code by creating an inheritance heirarchy and putting that information from the game class to our extended bet classes.
* We also were able to combine three of the bets into one extended bet class called "Number" that takes any number of bets and the odds, which makes our code flexible

2. In what ways is the refactored code more complex?
* The refactored code is "more complex" because it has more classes, which is not necessarily a bad thing for design purposes.

3. What trade-offs did you make when refactoring your old code?
* Creating new classes takes more memory.

4. Which code do you prefer and why?
* We definitely prefer the refactored code because we can easily make new bets through creating an inheritance heirarchy, and our code is more protected. We got rid of duplicated code.
