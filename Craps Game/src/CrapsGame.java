import java.util.Scanner;

public class CrapsGame
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				//New Craps Game
				Scanner userInput = new Scanner (System.in);
				
				// Welcoming player to the new game
				System.out.println("Hello welcome to Craps. What is your name?");
				
				//Speaking Name
				String userName = userInput.nextLine();
				System.out.println("Hello " + userName + " Let\'s play a game of Craps!");
				System.out.println("The Dice are rolling!");
				
				//Rolling and creating the dice
				
				int diceOne = (int)(Math.random()*6 + 1);
				int diceTwo = (int)(Math.random()*6 + 1);
				int diceSum = diceOne + diceTwo;
				System.out.println(userName + ", your rolls are \n" + diceOne + "\n" + diceTwo + "\nThat is equal to \n" + diceSum);
				
				//Boolean for second round
				boolean playingSecondRound = false;
				
				// Checking on the first try.
				if (diceSum == 2 || diceSum == 12)
				{	
					System.out.println("You loose," + userName +"! Thanks for playing.");
					System.exit(0);
				}
				else if (diceSum == 7 || diceSum == 11)
				{
					System.out.println("You Win" + userName + "! Thanks for playing.");
					System.exit(0);
				}
				else
				{
					//This is setting for attempt 2
					System.out.println("Your points are " + diceSum + ". Rolling again to see if you win, " + userName + "!");
					playingSecondRound = true;
					
					//While loop to figure out next round
					while (playingSecondRound) 
					{
						int diceOneSecondRound = (int)(Math.random()*6 + 1);
						int diceTwoSecondRound = (int)(Math.random()*6 + 1);
						int diceSumSecondRound = diceOneSecondRound + diceTwoSecondRound;
						int userPoints = diceSum;
						
						//Stating rolling output
						
						System.out.println("Your point is " + userPoints + ", and you rolled a " + diceOneSecondRound + "and a " + diceTwoSecondRound + " for a total of " + diceSumSecondRound);
					}
					
				}

			}

	}
