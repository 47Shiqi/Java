package javaPack;

import java.util.Scanner;

public class General_Information {

	public static void main(String[] args) 
	{
		CollectInfo();
	}
	
	private static void CollectInfo()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String first = input.nextLine();
		
		System.out.print("Enter your last name: ");
		String last = input.nextLine();
		
		System.out.print("Enter the year of your birth(Enter an integer that is less than 2025): ");
		int yr = input.nextInt();

		//Create a constructor to pass information using an object
		//to the class, Person
		Person personinfo = new Person(first,last,yr);
		
		System.out.println("Hello " + personinfo.Fullname());
		System.out.println("HELLO " + personinfo.FullnameUpper());
		System.out.println("hello " + personinfo.FullnameLower());
		System.out.println("Your name has " + personinfo.FullnameLength() + " letters");
		System.out.println("Your are " + personinfo.PersonAge() + " year(s) old");
	}
}
