# example_roulette

We did an awesome job today in recitation on January 30th, 2015.

We successfully refactored the Bet class' use inside of Game.java.

Previously, we encountered a series of clunky and inextensible if and else-if statements, illustrated below:
```java
if (whichBet == 0) {
            result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
        }
        else if (whichBet == 1) {
            result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
        }
        else if (whichBet == 2) {
            result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                                                    1, Wheel.NUM_SPOTS - 3);
        }
```


