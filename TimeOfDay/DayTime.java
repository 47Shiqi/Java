package javaPack;

import java.util.Scanner;
//Extending the functionality of the MainProgram
//Gets info and prints the time of the day

public class DayTime extends MainProgram
{
	Scanner allinput = new Scanner(System.in);
	
	float hour;
	
	public void DayTime()
	{
		GetTime();
	}
	
	public void GetTime()
	{
		hour = allinput.nextFloat();
		if(hour % 1 != 0 || hour < 0 || hour >= 24) //Check if the input is a decimal or out of range
		{
			System.out.print("Incorrect value has been entered.\n");
			MainProgram.main(null); //Restarts the MainProgram
		}
		else
		{
			allinput.nextLine();
			int intHour = (int) hour;
			timeOfDay(intHour); // call the timeOfDay() method
		}
	}
	
	public void timeOfDay(int time)
	{
		if(time > 0 && time < 12) // check if the hour is within a range
		{
			System.out.println("morning");
		}
		else if(time > 12 && time < 18)
		{
			System.out.println("afternoon");
		}
		else if(time > 18 && time < 24)
		{
			System.out.println("evening");
		}
		else
		{
			switch(time) // check if the hour matches a case
			{
			case 0:
				System.out.println("midnight");
				break;
			case 12:
				System.out.println("noon");
				break;
			case 18:
				System.out.println("dusk");
				break;
			default:
				System.out.println("Invalid hour");
			}
		}
		MainProgram.main(null); 
	}
}
