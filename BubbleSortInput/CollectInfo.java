package javaPack;

import java.util.Scanner;

public class CollectInfo 
{
	//declare variables
	int howmany;
	int[] numbers;
	
	static Scanner allinput = new Scanner(System.in);
	
	public CollectInfo()
	{
		AllInfo();
	}
	
	public void AllInfo()
	{
		boolean tORf = CheckHowmany(); //ask how many number and check
		while(tORf == false)
		{
			System.out.println("Please enter an integer between 2 and 20");
			tORf = CheckHowmany(); //if invalid, call CheckHowmany again
		}
		numbers = new int[howmany]; //array with a length of howmany

						
		for (int i=0; i<howmany; i++)
		{
			boolean tf = CheckNum(i); //ask a number and check
			while(tf == false)
			{
				System.out.println("Please enter a whole number");
				tf = CheckNum(i); //if invalid, call CheckNum again
			}
		}
		
		BubbleSort array = new BubbleSort(numbers); //create a constructor BubbleSort
		
		int[] myArray = array.Sort(); //use the method Sort from the class BubbleSort
			
		//Output Result
		for(int n=0; n<myArray.length; n++)
		{
			System.out.print(myArray[n] + " ");
		}
		System.out.println();
		
		System.out.println("Would you like to restart(enter yes/y or no/n please)? ");
		array.Restart(); //check the user's answer to the above question
	}
	
	public boolean CheckHowmany()
	{
		System.out.println("How many numbers do you want to sort(enter a number between 2 and 20)?");
		String strhowmany = allinput.nextLine();
		if(strhowmany.equals("")) //check if it is blank
		{
			return false;
		}
		else
		{	
			int len = strhowmany.length();
			for (int i = 0; i < len ; i++) 
			{
				if(strhowmany.charAt(i) < '0' || strhowmany.charAt(i) > '9')
				{
					return false; //check if every char is a number
				}
			}
			howmany = Integer.parseInt(strhowmany);
			if(howmany < 2 || howmany > 20)
			{
				return false; //check if it it within the range
			}
		}
		return true;
	}
	
	public boolean CheckNum(int index)
	{
		System.out.println((index+1) + ") Enter a whole number:");
		String strNum = allinput.nextLine();
		if(strNum.equals("")) //check if it is blank
		{
			return false;
		}
		else
		{	
			int len = strNum.length();
			for (int i = 0; i < len ; i++) 
			{
				if(strNum.charAt(i) < '0' || strNum.charAt(i) > '9')
				{
					return false; //check if every char is a number
				}
			}
			//insert the new number to the corresponding index position
			numbers[index] = Integer.parseInt(strNum);
		}
		
		return true;
	}
}
