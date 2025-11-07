// Class that calculates all info and return the info

package javaPack;

public class Calculate 
{
	private double aGrade;
	
	public Calculate(double thegrade)
	{
		// constructor that gets the grade info 
		this.aGrade = thegrade;
	}
	
	public double GetGPA()
	{
		// calculate the GPA
		int GPA;
		double decimalGPA;
		GPA = (int) (aGrade * 4); // first multiply the grade by 4 and truncate the grade 
		decimalGPA = GPA / 100.0; // then convert to a 4.0 scale GPA by diving the grade by 100 and keep two decimal places
		return decimalGPA;
	}
	
	public String GetLetter()
	{
		int MyGrade = (int) aGrade / 10; // get the first or first two digit(s) of a grade  
		String letter;
		switch (MyGrade) // match the letter grade by its first or first two digit(s)
		{
	    case 10:
	    	letter = "A";
	        break; 
	    case 9:
	    	letter = "A";
	        break;
	    case 8:
	    	letter = "B";
	        break;
	    case 7:
	    	letter = "C";
	        break;
	    case 6:
	    	letter = "D";
	        break;
	    default: 
	    	letter = "F"; // first digit is 5 or less
		}
		return letter;
	}
}
