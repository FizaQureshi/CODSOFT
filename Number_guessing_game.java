//TASK 1
//QUESTION: (NUMBER GAME) GENERATE A RANDOM NUMBER. ASK THE USER TO GUESS A NUMBER BETWEEN 1 TO 100 AND COMPARE THE NUMBER WITH THE RANDOM NUMBER GENERATED, PROVIDE FEEDBACK ON WHETHER THE GUESS MADE IS CORRECT OR NOT.

package Number_guessing;

import java.util.*;

public class Number_guessing_game 
{
	
	int n, x, round =1, won =0;
	static int count = 1;   //MAXIMUM FIVE CHANCES WILL BE PROVIDED IN EACH ROUND 
    
    static Scanner sc = new Scanner(System.in);

	//ASKING THE GUESSED NUMBER FROM THE USER
    
	int input()
	{
		n = sc.nextInt();
		return n;
	}
	
	//GENERATING A RANDOM NUMBER
	
	int random()
	{
		x = (int)(Math.random() * 100);
		return x;
	}
	
	//PERFORMING DIFFERENT OPERATIONS ACCORDING TO USER'S GUESS AND THE RANDOM NUMBER GENERATED
	
	void play()
	{
		int z,d;
		String s;
		
		d = random();
		
		do
		{
		    z = input();
			
			if(z > d)
			{
				System.out.println("Too high! Please guess a smaller number. \n");
				count++;
			}
			else if(z < d)
			{
				System.out.println("Too low! Please guess a higher number. \n");
				count++;
			}
			else if(z == d)
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
			
		}while((z != d) && (count <= 5));    
		
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
		  
		Number_guessing_game ob = new Number_guessing_game();
		
		System.out.println("You have five attempts to guess your number.");
		System.out.println("Please guess a number between 1 to 100");
		
		ob.play();
		
	}
	

}
