package javaPack;

public class Calculate 
{
	private float aGrade;
	private float totalGrade;
	
	public Calculate(float thegrade)
	{
		this.aGrade = thegrade;
	}
	
	public double GetGPA()
	{
		double GPA;
		GPA = aGrade/100 * 4.0;
		return GPA;
	}
	
	public String GetLetter()
	{
		int MyGrade = (int) aGrade;
		String letter;
		switch (MyGrade) 
		{
	    case MyGrade <= 100 && MyGrade >=90:
	    	letter = "A";
	        break; // Optional: exits the switch block
	    case MyGrade < 90 && MyGrade >=80:
	    	letter = "B";
	        break;
	    
	    default: 
	    	letter = "Sorry, something went wrong for letter grade";
		}
	}
}
