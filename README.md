# example_roulette

Georgia Tse and Kevin Delgado

Program to refactor that plays a game of roulette

We decided to make subclasses for each type of bet. The methods in Game calls a helper method whose implementation is unique to each class, but general method is common to bet and is thus an abstract method in Bet.

Design considerations included, whether Wheel should be passed in as a parameter and if the bet's value should be an instance variable in the bet subclass.
