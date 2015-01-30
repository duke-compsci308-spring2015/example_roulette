# example_roulette
Program to refactor that plays a game of roulette

mba13 and rrw12

We made Bet into an abstract class and defined two new methods: placeBet
and betisMade. Then we created new Bet classes that extended Bet called
ColorBet, OddEvenBet, SequenceBet. Each of these classes implemented the
abtract methods. We deleted the placeBet and betisMade methods from the
game class, and changed whichBet to point to the actual Bet instead of
an int representation of the Bet.

We implemented getOdds and getDescription in the Bet superclass. We also
moved the betChoice variable from the Game class to the Bet superclass. 

