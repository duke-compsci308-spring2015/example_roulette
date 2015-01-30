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

We then refactored the Bet class by first making it abstract. 

We then subclassed Bet into RedBlackBet, OddEvenBet, and NumberBet. We first changed our initialization of our **Bet**s (at the top of **Game**) from 

```java
    private Bet[] myPossibleBets = { 
        new Bet("Red or Black", 1),
        new Bet("Odd or Even", 1),
        new Bet("Three in a Row", 11)
    };
```

to 

```java
    private Bet[] myPossibleBets = { 
        new RedBlackBet("Red or Black", 1),
        new OddEvenBet("Odd or Even", 1),
        new NumberBet("Three in a Row", 11)
    };
```

We shortened the series of if-statements into indexing into our array of **Bet**s. To be thorough, we decided to also check for bets made out of the array's length. Illustrated below:

```java

    private String placeBet (int whichBet) {
        System.out.println();
        
        if (isValid(whichBet))
    	{
        	 return myPossibleBets[whichBet].placeBet();
    	}
    	return "";     
    }
    
    private boolean betIsMade (int whichBet, String betChoice) {
    	
    	if (isValid(whichBet))
    	{
    		return myPossibleBets[whichBet].checkWin(myWheel, betChoice);
    	}
    	return false;
    }
    
    private boolean isValid(int whichBet)
    {
    	return (whichBet < myPossibleBets.length);
    }
```

Last but not least, we went ahead and moved the respective calls from the if-statements into methods in each subclass of **Bet**, and added the methods' abstract declarations in **Bet**.

```java
**Bet.java**
    public abstract boolean checkWin(Wheel w, String choice);
    public abstract String placeBet();

```

```java
**RedBlackBet.java**

	@Override
	public boolean checkWin(Wheel w, String choice) {
		return w.getColor().equals(choice);
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

```

```java
**OddEvenBet.java**
	@Override
	public boolean checkWin(Wheel w, String choice) {
		return (w.getNumber() % 2 == 0 && choice.equals("even")) ||
                (w.getNumber() % 2 == 1 && choice.equals("odd"));
	}

	@Override
	public String placeBet() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

```

```java
**NumberBet.java**

	@Override
	public boolean checkWin(Wheel w, String choice) {
		int start = Integer.parseInt(choice);
		return (start <= w.getNumber() && w.getNumber() < start + 3);
	}

	@Override
	public String placeBet() {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

```


