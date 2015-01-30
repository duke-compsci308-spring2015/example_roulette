# example_roulette
Program to refactor that plays a game of roulette

//authors: Brandon Choi, Danny Oh

What methods would make sense as behaviors of a Bet hierarchy (i.e., make bets open to extension)?<br> 
boolean winOrLose()- return whether player wins or loses bet<br>
String askBet()- ask the player what his/her bet is

What methods would help improve the code in the Game's methods (i.e., close it to modification)?<br>
The play method is rather lengthy in Game. Therefore, splitting up the code into separate helper methods that set up the questions and user interaction would improve the readability of code.

What methods can be completely implemented in the Bet super-class (i.e., are common across the hierarchy), and which completely in the Bet sub-classes (i.e., vary across the hierarchy)?<br>
The methods defined in question 1 are unique to each sub-class and must be implemented separately. The others are universal across the hierarchy super-class.

How should the Game class create the correct Bet subclass? <br>
In Game, an array of myPossibleBets is created and all three specific types are initialized. This would not be adaptable for our CellSociety project.

In what ways is the refactored code simpler?<br>
The if statements are gone in placeBet() and betIsMade() in Game. Furthermore, it is much simpler to extend the program by adding another bet.

In what ways is the refactored code more complex?<br>
The number of classes in the project is higher and so there is technically more classes to read for any viewer. There is also an added hierarchy.

What trade-offs did you make when refactoring your old code?<br>
In order to make the program more extendible, we created more classes.

Which code do you prefer and why?<br>
I prefer our rendition of the roulette project. The methods in Game are much more readable and are not inundated with a lot of if statements. Furthermore, it is extendible.