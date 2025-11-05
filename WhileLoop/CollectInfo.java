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
			Calculate gradeinfo = new Calculate(numgrades);
		}
		else
		{
			System.out.println("Invalid input, please enter an integer between 1 and 100");
			AskInfo();
		}
	}
	
	public boolean CheckNum(float gradenum)
	{
		boolean boolstate = true;
		
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
	
	public void AskGrade()
	{
		float grade;
		System.out.print("Enter your grade: ");
		grade = allinput.nextFloat();
	}
}
