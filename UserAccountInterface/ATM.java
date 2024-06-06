/*Task 3
Question (ATM interface): design a user interface to deal with account balance and functions 
like withdraw money, deposit money, and to check balance in account.*/

package codsoft;

import java.util.*;

public class ATM {
	static int accountBalance;
	
	 static Scanner sc = new Scanner(System.in);
	 
	 //function for withdrawing money
	 
	 public static int withdraw(int amount)
	 {
		 if(accountBalance < 2000)
		 {
			 System.out.println("Minimum amount limit reached. Sorry money cannot be withdrawn");
			 
			 return 0;
		 }
		  accountBalance = accountBalance - amount;
		  System.out.println("Transaction successfull");
		  
		 return accountBalance;
	 }
	 
	 //function to deposit money
	 
	 public static int deposit(int amount)
	 {
		 if(amount > 50000)
		 {
			 System.out.println("Maximum fifty thousand rupees can be deposited at once.");
			 
			 return 0;
		 }
		 accountBalance = accountBalance + amount;
		 System.out.println("Transaction successfull");
		 
		 return accountBalance;
	 }
	 
	 //function to check account balance
	 
	 public static int checkBalance()
	 {
		 return accountBalance;
	 }
	 
	 

	 //main method
	 
	public static void main(String[] args) 
	{	
		//creating constructor of UserBankAccount class
		
		UserBankAccount balance = new UserBankAccount();
		
		//calling input function from UserBankAccount class
		
		accountBalance = balance.input();
		
		
		System.out.println("For display panel press 1 for exit press 0");
		int choice = sc.nextInt();
		
		if(choice == 0)
		{
			System.exit(0);
		}
		
		
		while(choice == 1)
		{
			System.out.println("Press 1 for withdrawing money");
			System.out.println("Press 2 for depositing money");
			System.out.println("Press 3 for checking account balance");
			System.out.println("Press 0 for exit");
			
			int option = sc.nextInt();
			
			if(option == 1)
			{
				System.out.println("Enter amount to be withdrawn");
				
				int amount = sc.nextInt();
				
				int withdrawAmount = withdraw(amount);
				System.out.println("Current account balance : "+ withdrawAmount);
			}
			
			if(option == 2)
			{
				System.out.println("Enter amount to be deposited");
				
				int amount = sc.nextInt();
				
				int depositAmount = deposit(amount);
				System.out.println("Current account balance : "+ depositAmount);
			}
			
			if(option == 3)
			{
				int currentBalance = checkBalance();
				System.out.println("Current account balance : "+ currentBalance);
			}
			
			if(option == 0)
			{
				System.exit(0);
			}
		}
		

	}

}
