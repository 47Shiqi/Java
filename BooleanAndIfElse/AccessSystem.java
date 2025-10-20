// check all info and return the message
package javaPack;

public class AccessSystem 
{
	private String anID; // initialize the variables
	private int anAge;
	private String aName;
	private int aTime;
	private String[] nameList = {"Alice", "Bob", "Lily"}; // banned list
	
	// constructor that gets all info
	public AccessSystem(String theID, int theAge, String theName, int theTime)
	{
		this.anID = theID;
		this.anAge = theAge;
		this.aName = theName;
		this.aTime = theTime;
	}
	
	public boolean CheckID() // check if the user has an ID
	{
		boolean hasID = false;
		if(anID.equalsIgnoreCase("y"))
		{
			hasID = true;
		}
		return hasID;
	}
	
	public boolean CheckAge() // check if the user's age is over 18
	{
		boolean Eligiblege = false;
		if(anAge > 18)
		{
			Eligiblege = true;
		}
		return Eligiblege;
	}
	
	public boolean CheckName() // check if the user's name is in the banned list
	{
		boolean NotBanned = true;
		for(int i = 0; i < nameList.length; i++) // check each name in the list using a for loop
		{
			if(nameList[i].equalsIgnoreCase(aName))
			{
				NotBanned = false;
			}
		}
		return NotBanned;
	}
	
	public boolean CheckTime() // check if the user is on time
	{
		boolean onTime = false;
		if(aTime >= 8 && aTime <= 18)
		{
			onTime = true;
		}
		return onTime;
	}
	
	public String FinalCheck() // check if the user is allowed to enter the building
	{
		String msg = "";
		
		// check if any "check" is false using De Morgan’s rewrite
		if(!CheckID() || !CheckAge() || !CheckName() || !CheckTime()) 
		{
			msg = "Sorry, you are not allowed to enter the building.";
		}
		else
		{
			msg = "Welcome!";
		}
		return msg;
	}
}
