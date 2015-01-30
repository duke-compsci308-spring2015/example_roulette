# example_roulette
Program to refactor that plays a game of roulette
Modified by Greg McKeon and Kaighn Kevlin (grm19 and kgk6)
Our refactored code is significantly shorter than the original.  The simplicity comes from the fact that methods which are common to all of the objects are handled by the specific Bet object implementation.  This removes the need for complex if trees, as a specific object just knows what to do based upon its implementation of the method.
We did have to trade off some readability to create these objects - since functionality was removed to subclasses, it is harder to tell exactly what a given run of the roulette program should return.  This may make the program harder to debug, particularly considering how the Wheel is passed around.
We prefer the refactored code.  It is significantly shorter and its methods more readable, simply because of the level of duplication we were able to remove.