package javaPack;

public class MainProgram //Parent class that starts the program by creating a new DayTime object
{

	public static void main(String[] args) 
	{
		DayTime time = new DayTime();
		System.out.print("Enter the hour of the day: ");
		time.GetTime(); // run the method GetTime
	}

}
