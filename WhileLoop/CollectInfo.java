// Class that collects all info and display all results

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
		float numgrades; // initialize variables
		boolean yesorno; 
		
		System.out.print("How many grades will you be averaging? ");
		numgrades = allinput.nextFloat();
		yesorno = CheckNum(numgrades); // check the number of grades
		if (yesorno)
		{
			AskGrade(numgrades);
		}
		else
		{
			System.out.println("Invalid input, please enter an integer between 1 and 100");
			AskInfo(); // restart if the input is invalid
		}
	}
	
	public boolean CheckNum(float gradenum)
	{		
		float isyes = gradenum % 1;
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
		double grade; // initialize variables
		boolean yesorno;
		int howmany = (int) numberGrades;
		int count = howmany;
		double avg = 0;

		while (count > 0)
		{
			System.out.print("Enter your grade: ");
			grade = allinput.nextDouble();
			yesorno = CheckGrades(grade); // check the grade
			if (yesorno)
			{
				count = count - 1;
				Calculate gradeinfo = new Calculate(grade); // create an object for grade info
				System.out.println("GPA: " + gradeinfo.GetGPA()); // print grade info for this grade
				System.out.println("Letter Grade: " + gradeinfo.GetLetter());
				avg = avg + grade;
			}
			else
			{
				System.out.println("Please enter a grade between 0 and 100");
			}
		}
		DisplayAVG(avg,howmany);
	}
	
	public boolean CheckGrades(double thegrade)
	{

		if (thegrade < 0 || thegrade > 100)
		{
			return false; // not a number b/w 0-100
		}
		else
		{
			return true; // meets criteria;
		}
	}
	
	public void DisplayAVG(double average, int num)
	{
		int TruncateAverage = (int) (average / num * 100); // get the average and multiply by 100 and truncate
		average = TruncateAverage / 100.0; // keep two decimal places
		Calculate avginfo = new Calculate(average); // create an object for average info
		System.out.println("------------------------"); // print average info
		System.out.println("Average: " + average);
		System.out.println("Overall GPA: " + avginfo.GetGPA());
		System.out.println("Overall Letter Grade: " + avginfo.GetLetter());
	}
}
