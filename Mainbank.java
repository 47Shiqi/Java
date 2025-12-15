package javaPack;

import java.util.Scanner;

public class MainBank {
	static Scanner allinput = new Scanner(System.in);
	
	//private String accountHolder;
	//private String balance;
	
	public static void main(String[] args)
	{
		//Object and constructor creation
		DisplayMain();
		}
	
	static void DisplayMain()
	{
		//Set the mutators to set the data
		BankAccount myAccount = new BankAccount();
		
		System.out.println("Enter the account holder's name: ");
		String accountHolder = allinput.nextLine();
		
		myAccount.setAccountHolder("Mr. Pigis");
		myAccount.setBalance(1000000);
		
		System.out.println("User: " + myAccount.getAccountHolder());
		System.out.println("Balance: $" + myAccount.getBalance());
	}

}
