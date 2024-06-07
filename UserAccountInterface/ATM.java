/*Task 3
Question (ATM interface): design a user interface to deal with account balance and functions 
like withdraw money, deposit money, and to check balance in account.*/

package codsoft;

import java.util.*;

public class ATM {
	UserBankAccount account = new UserBankAccount();
	private static Scanner sc = new Scanner(System.in);

	// function to set up account details
	public void initializeAccountDetails() {

		System.out.println("Enter Account details:");
		System.out.println("Enter username");

		String username = sc.nextLine();
		account.setUserName(username);

		System.out.println("Enter mobileNumber");
		long mobileNumber = sc.nextLong();
		account.setMobileNumber(mobileNumber);

		System.out.println("Enter accountNumber");
		long accountNumber = sc.nextLong();
		account.setAccountNumber(accountNumber);

	}

	//function to check balance
	
	public void displayBalance() {
		System.out.println("Current Balance is: " + String.format("%.2f", account.getBalance()));
	}

	
	//function to withdraw money
	
	public void withdraw() {

		System.out.println("Enter amount to be withdrawn");
		double amount = sc.nextDouble();

		double balance = account.getBalance();
		if (balance < amount) {
			System.out.println("Sorry money cannot be withdrawn! Balance is less than the withdrawl amount.");
			return;
		}
		if(balance < 2000)
		{
			System.out.println("Insufficient balance!!!");
			return;
		}
		balance -= amount;
		account.setBalance(balance);
		System.out.println("Transaction successfull");
		displayBalance();
	}

	
	//function to deposit money
	
	public void deposit() {
		System.out.println("Enter amount to be deposited");
		double amount = sc.nextDouble();
		double balance = account.getBalance();
		balance += amount;
		account.setBalance(balance);
		System.out.println("Transaction successfull");
		displayBalance();
	}

	
	//main method
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.initializeAccountDetails();
		int choice = 0;

		do {
			System.out.println("Options:");
			System.out.println("Press 1 for withdrawing money");
			System.out.println("Press 2 for depositing money");
			System.out.println("Press 3 for checking account balance");
			System.out.println("Press 0 for exit");
			choice = sc.nextInt();

			//performing different operations according to user's choice
			
			switch (choice) {

			case 0:
				break;
			case 1:
				atm.withdraw();
				break;
			case 2:
				atm.deposit();
				break;
			case 3:
				atm.displayBalance();
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 0);

	}

}
