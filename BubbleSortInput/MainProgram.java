package javaPack;

import java.util.Scanner;

public class MainProgram //main class that runs the program
{
	static Scanner allinput = new Scanner(System.in);
	public static void main(String[] args) 
	{
		AskInfo();
	}
	
	static void AskInfo()
	{
		System.out.println("How many numbers do you want to sort?");
		int howmany = allinput.nextInt();
		int[] numbers = new int[howmany];
		
		for (int i=0; i<howmany; i++)
		{
			System.out.println("Enter a number:");
			int intNum = allinput.nextInt();
			numbers[i] = intNum;
		}
		
		BubbleSort array = new BubbleSort(numbers);
		
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
	
	/*
	static boolean CheckNum()
	{
		System.out.println("Enter a number:");
		String num = allinput.nextLine();
		if(num.equals(""))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	*/
}
