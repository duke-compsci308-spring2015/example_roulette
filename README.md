# example_roulette
Program to refactor that plays a game of roulette

Pair Members
-------------
Emre Sonmez (ebs32)
Peter Moseley (plm17)

Discussion
-------------
**Design Comments** 

To remove the if statements in the Game.java class we decided to
create three separate classes that extend Bet.java. This allowed
us to write placeBet() and betIsMade() methods in each of the 
sub-classes to handle the different requirements of each game.

We also removed the ```System.out.println();``` line out of 
our subclasses so that it is not duplicated three times. We
placed this line in Play() in Game.java.
