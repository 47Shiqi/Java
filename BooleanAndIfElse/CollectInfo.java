// collect all info and print the message saying if the user is allowed to enter the building
package javaPack;

import java.util.Scanner;

public class CollectInfo 
{
	String ID; // initialize all variables
	int age;
	String name;
	int time;
	
	Scanner allinput = new Scanner(System.in);
	
	public CollectInfo()
	{
		Allinfo();
	}
	
	public void Allinfo()
	{
		// ask and collect info
		System.out.print("Do you have a valid ID(enter 'y' for yes or 'n' for no)? ");
		ID = allinput.nextLine();
		
		System.out.print("How old are you(enter an integer)? ");
		age = allinput.nextInt();
		allinput.nextLine();
		
		System.out.print("What is your name? ");
		name = allinput.nextLine();
		
		System.out.print("What time did you arrive(enter hour as an integer)? ");
		time = allinput.nextInt();
		
		// create a new AccessSystem object
		AccessSystem personInfo = new AccessSystem(ID,age,name,time);
		
		// print the message
		System.out.println(personInfo.FinalCheck());
	}
}
