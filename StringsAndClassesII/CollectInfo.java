package javaPack;

import java.util.Scanner;

public class CollectInfo 
{
	String fname, lname;
	int birthyear = 0;
	Scanner allinput = new Scanner(System.in);
	
	public CollectInfo() 
	{
		AllInfo();
	}
	
	public void AllInfo()
	{
		System.out.print("Enter your first name: ");
		fname = allinput.nextLine();

		System.out.print("Enter your middle initial: ");
		String midinit = allinput.nextLine();
		
		fname = fname + midinit;
		
		System.out.print("Enter your last name: ");
		lname = allinput.nextLine();
		
		System.out.print("Enter your year of birth: ");
		birthyear = allinput.nextInt();
		
		Person collectpers = new Person(fname,lname,birthyear);
		String fullname = collectpers.Fullname();
		int persdob = collectpers.PersonAge();
		
		System.out.println("Hello " + collectpers.Fullname() + ". " + "I see you are " + persdob + "years old.");
	}
}
