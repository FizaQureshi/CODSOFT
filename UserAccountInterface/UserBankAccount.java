package codsoft;

import java.util.*;

public class UserBankAccount {
	
	static int accountBalance;

	public static int input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter account balance");
		accountBalance = sc.nextInt();
		
		return accountBalance;
	}
}
