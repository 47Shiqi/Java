package javaPack;

public class MainBank {

	public static void main(String[] args)
	{
		//Object and constructor creation
		DisplayMain();
		}
	
	static void DisplayMain()
	{
		//Set the mutators to set the data
		BankAccount myAccount = new BankAccount();
		myAccount.setAccountHolder("Mr. Pigis");
		myAccount.setBalance(1000000);
		
		System.out.println("User: " + myAccount.getAccountHolder());
		System.out.println("Balance: $" + myAccount.getBalance());
	}

}
