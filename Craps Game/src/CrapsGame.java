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
				System.out.println("Hello " + userName + " Let\'s play a game!");
				System.out.println("Press 1 to roll the dice!");
				
				//Rolling and creating the dice
				
				int diceOne = (int)(Math.random()*6 + 1);
				int diceTwo = (int)(Math.random()*6 + 1);

			}

	}
