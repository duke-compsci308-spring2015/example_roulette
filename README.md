# example_roulette
Program to refactor that plays a game of roulette
1. The code removes if-statemts, making the code easier to read.
2. The refactored code required the creation of many more classes so from a purely line count perspective, the code got lengthier.
3. Originally, the wheel needed to be passed in to the Bet class to get the result of spinning the wheel. We decided that that was too much information given to the Bet class. As a result, we decided to pass in the results of the wheel spinning rather than passing in the wheel itself and allowing the specific bet to choose which result of the wheel it needs.
4. I prefer the latter implementation as this is more flexible and removes unnecssary if statements from the game class.

