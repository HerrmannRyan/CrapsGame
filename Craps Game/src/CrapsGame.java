import java.util.Scanner;

public class CrapsGame
	{
		//Uploaded from Home 8-23-2019 @ 16:30
		//New Craps Game
		static Scanner userInput = new Scanner (System.in);
		static String userName;
		static String enterToRollDice;
		static int diceOne;
		static int diceTwo;
		static int diceSum;
		static int secondRoundDiceOne;
		static int secondRoundDiceTwo;
		static int secondRoundDiceSum;
		static boolean playingSecondRound = false;
		static int userPoints;

		public static void main(String[] args)
		{
			greetPlayer();
			rollRoundOneDice();
			evaluateRoundOne();
			while (playingSecondRound)
			{
				rollSecondRound();
				evaluateSecondRound();
			}
			
		}
				
		public static void greetPlayer()
		{
			// Welcoming player to the new game
			System.out.println("Hello welcome to Craps. What is your name?");
			
			//Speaking Name
			userName = userInput.nextLine();
			System.out.println("Hello " + userName + " Let\'s play a game of Craps! Press enter to roll the die!");
			enterToRollDice = userInput.nextLine();
			System.out.println("The Dice are rolling!\n");
		}
		
		public static void rollRoundOneDice()
		{
			//Rolling and creating the dice
			diceOne = (int)(Math.random()*6 + 1);
			diceTwo = (int)(Math.random()*6 + 1);
			diceSum = diceOne + diceTwo;
		}
		
		public static void evaluateRoundOne()
		{
			System.out.println(userName + ", your rolls are " + diceOne + " and " + diceTwo + " That is equal to " + diceSum + "\n");
			

			// Checking on the first try.
			if (diceSum == 2 || diceSum == 12)
			{	
				System.out.println("You loose," + userName +"! Thanks for playing.");
				System.exit(0);
			}
			else if (diceSum == 7 || diceSum == 11)
			{
				System.out.println("You win " + userName + "! Thanks for playing.");
				System.exit(0);
			}
			else
			{
				//This is setting for attempt 2
				System.out.println("Your points are " + diceSum + ". Roll again to see if you win, " + userName + "!");
				enterToRollDice = userInput.nextLine();
				playingSecondRound = true;
			}
		
		}
		
		public static void rollSecondRound()
		{
			//Creating dice for second round
			secondRoundDiceOne = (int)(Math.random()*6 + 1);
			secondRoundDiceTwo = (int)(Math.random()*6 + 1);
			secondRoundDiceSum = secondRoundDiceOne + secondRoundDiceTwo;
			userPoints = diceSum;
			
		}
		
		public static void evaluateSecondRound()
		{
			
			System.out.println("Your point is " + userPoints + ", and you rolled a " + secondRoundDiceOne + " and a " + secondRoundDiceTwo + " for a total of " + secondRoundDiceSum );
			
			//This is the checking to win on second round
			if(secondRoundDiceSum == userPoints)
			{
				System.out.println("\nYou win " + userName + "!!!!");
				playingSecondRound = false;
			}
			if(secondRoundDiceSum == 7)
			{
				System.out.println("\nYou LOOSE " + userName + "!!!!");
				playingSecondRound = false;
			}
			
			else
			{
			System.out.println("Press enter to Roll again!");
			enterToRollDice = userInput.nextLine();
			}
		
		}

	}

	
