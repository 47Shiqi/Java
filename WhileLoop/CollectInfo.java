package javaPack;

import java.util.Scanner;

public class CollectInfo 
{
	static Scanner allinput = new Scanner(System.in);
	
	public CollectInfo()
	{
		AskInfo();
	}
	
	public void AskInfo()
	{
		float numgrades;
		boolean yesorno;
		
		System.out.print("How many grades will you be averaging? ");
		numgrades = allinput.nextFloat();
		yesorno = CheckNum(numgrades);
		//System.out.print(yesorno);
		if (yesorno)
		{
			AskGrade(numgrades);
		}
		else
		{
			System.out.println("Invalid input, please enter an integer between 1 and 100");
			AskInfo();
		}
	}
	
	public boolean CheckNum(float gradenum)
	{
		//boolean boolstate = true;
		
		float isyes = gradenum % 1;
		//System.out.print(gradenum % 1);
		if (isyes > 0)
		{
			return false; // not an integer
		}
		else
		{
			if (gradenum < 1 || gradenum > 100)
			{
				return false; // not a number b/w 1-100
			}
			else
			{
				return true; // meets criteria;
			}
		}
	}
	
	public void AskGrade(float numberGrades)
	{
		float grade;
		boolean yesorno;
		int howmany = (int) numberGrades;
		
		while (howmany > 0)
		{
			System.out.print("Enter your grade: ");
			grade = allinput.nextFloat();
			yesorno = CheckGrades(grade);
			if (yesorno)
			{
				howmany = howmany - 1;
				Calculate gradeinfo = new Calculate(grade); 
			}
			else
			{
				System.out.println("Please enter a grade between 0 and 100");
			}
		}
	}
	
	public boolean CheckGrades(float thegrade)
	{
		//boolean boolstate = true;

		if (thegrade < 0 || thegrade > 100)
		{
			return false; // not a number b/w 0-100
		}
		else
		{
			return true; // meets criteria;
		}
	}
}
