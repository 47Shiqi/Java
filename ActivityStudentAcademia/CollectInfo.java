package javaPack;

import java.util.Scanner;

public class CollectInfo 
{
	String thefname, thelname, ans;
	int thegrade = 0;
	int thePreGPA = 0;
	int theCurGPA = 0;
	Scanner allinput = new Scanner(System.in);
	
	public CollectInfo() 
	{
		AllInfo();
	}
	
	public void AllInfo() 
	{
		System.out.print("Enter your first name: ");
		thefname = allinput.nextLine();
		
		System.out.print("Enter your last name: ");
		thelname = allinput.nextLine();
		
		System.out.print("Enter your grade level: ");
		thegrade = allinput.nextInt();
		
		System.out.print("Enter your GPA for last grade level(100 scale): ");
		thePreGPA = allinput.nextInt();
		
		System.out.print("Enter your GPA for current grade level(100 scale): ");
		theCurGPA = allinput.nextInt();
		
		Student studentinfo = new Student(thefname,thelname,thegrade,thePreGPA,theCurGPA);
		
		
		System.out.println("Student Name: " + studentinfo.GetName());
		System.out.println("Grade Level: " + thegrade);
		System.out.println("Previous GPA(100 scale): " + thePreGPA);
		System.out.println("Previous GPA(4.0 scale): " + studentinfo.GetpGpa());
		System.out.println("Current GPA(100 scale): " + theCurGPA);
		System.out.println("Current GPA(4.0 scale): " + studentinfo.GetcGpa());
		System.out.println("Updated GPA(100 scale): " + studentinfo.updateGpa_100());
		System.out.println("Updated GPA(4.0 scale): " + studentinfo.updateGpa_4());
		
		if(studentinfo.promote() == true)
		{
			System.out.println("You have been promoted to Grade " + studentinfo.GetGrade() 
			+ " because your current GPA is above 2.6 (or 65 on a 100 point scale).");
		}
		else
		{
			System.out.println("You will remain in Grade " + thegrade + ", as you did not "
					+ "meet the promotion requirement of a minimum current GPA of 2.6 (or 65 on a 100 point scale).");
		}
		
		if(studentinfo.isHonorRoll() == true)
		{
			System.out.println("You are in the Honor Roll because your current GPA is abovr 3.5!");
		}
	}
}
