//TASK 1
//QUESTION: (NUMBER GAME) GENERATE A RANDOM NUMBER. ASK THE USER TO GUESS A NUMBER BETWEEN 1 TO 100 AND COMPARE THE NUMBER WITH THE RANDOM NUMBER GENERATED, PROVIDE FEEDBACK ON WHETHER THE GUESS MADE IS CORRECT OR NOT.

package codsoft;

import java.util.*;

public class NumberGuessingGame 
{
	
	int number, randomNum, round =1, won =0;
	static int count = 1;   
    
     Scanner sc = new Scanner(System.in);

	//Function to take a number guessed by the player/user as input
    
	int input()
	{
		number = sc.nextInt();
		return number;
	}
	
	//Function to generate a random number
	
	int random()
	{
		randomNum = (int)(Math.random() * 100);
		return randomNum;
	}
	
	//Function which provides appropriate feedback on the guessed number after comparing it with the random number
	
	void play()
	{
		int num, randomNumber;
		String s;
		
		randomNumber = random();
		
		do
		{
		    num = input();
			
			if(num > randomNumber)
			{
				System.out.println("Too high! Please guess a smaller number. \n");
				count++;
			}
			else if(num < randomNumber)
			{
				System.out.println("Too low! Please guess a higher number. \n");
				count++;
			}
			else if(num == randomNumber)
			{
				System.out.println("Congrats! You guessed the correct number. \n");
				won++;
				System.out.println("CURRENT SCORE \n Total Rounds played : "+ round + "\n Rounds Won : " + won);
				System.out.println(" To play another round please enter 1 and to exit enter 0.");
				int x =sc.nextInt();
				if(x == 1)
				{
					count =1;
					round++;
			    	System.out.println("You have five attempts to guess your number.");
					System.out.println("Please guess a number between 1 to 100");
			    	play();
				}
				else
				{
					System.exit(0);
				}
				
			}
			
		}while((num != randomNumber) && (count <= 5));      //maximum five chances are provided in each round  
		
		System.out.println("CURRENT SCORE \n Total Rounds played : "+ round + "\n Rounds Won : " + won);
		
		if(count > 5)
		{
			System.out.println("You lost the game!!!");
			
			System.out.println("To play another round please enter : TRY AGAIN");
			sc.nextLine();
			 s = sc.nextLine();
			 
			  
			    if(s.equalsIgnoreCase("TRY AGAIN"))
			    {
			    	count =1;
			    	round++;
			    	System.out.println("You have five attempts to guess your number.");
					System.out.println("Please guess a number between 1 to 100");
			    	play();
			    }
		}

	}
	
	

	public static void main(String[] args) 
	{
		  
		NumberGuessingGame ob = new NumberGuessingGame();
		
		System.out.println("You have five attempts to guess your number.");
		System.out.println("Please guess a number between 1 to 100");
		
		ob.play();
		
	}
	
}
