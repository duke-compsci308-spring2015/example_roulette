###Names

Kei Yoshikoshi (ky52) and Nina Sun (nrs15)

###Explanation

The placeBet and betIsMade methods make sense as behaviors as a Bet hierarchy. Each type of bet was made into a subclass of Bet with their own versions of placeBet and betIsMade. The Game class creates an array myPossibleBets declaring each kind of bet subclass.

We started three new Bet subclasses called HighLow, TwoInRow, and SingleNumber, but these are incomplete. They demonstrate the ease of creating new kinds of Bets.