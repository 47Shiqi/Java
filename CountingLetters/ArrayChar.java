package javaPack;

import java.util.Scanner;
//ArrayChar class is the subclass
//ArrayChar is extending the functionality of the MainProgram
//Gets info and prints each character of a string n times
public class ArrayChar extends MainProgram
{
	Scanner allinput = new Scanner(System.in);
	//Globalize variables
	int wordlen;
	float numletters;
	char[] wordarray;
	
	public void ArrayChar()
	{
		AcceptInfo();
	}
	
	public void AcceptInfo()
	{
		numletters = allinput.nextFloat();
		if(numletters % 1 != 0 || numletters <= 0) //Check if the input is a decimal or <= 0
		{
			System.out.print("Incorrect value has been entered.\n");
			MainProgram.main(null); //Restarts the MainProgram
		}
		else
		{
			allinput.nextLine();
			System.out.print("Enter a word: ");
			String wordent = allinput.nextLine();
			CheckWord(wordent);
			Output();
		}
	}
	
	private void CheckWord(String entword)
	{
		wordlen = entword.length();
		if(wordlen == 0)
		{
			MainProgram.main(null); //Restarts the MainProgram
		}
		else
		{
			wordarray = new char[wordlen]; //set the array to the length of the word
			for(int i=0; i<wordlen; i++)
			{
				wordarray[i] = entword.charAt(i); // assign each char in the string to the array
				if((int)wordarray[i] <= 96 || (int)wordarray[i] >= 123) // check each char in the string
				{
					System.out.print(wordarray[i] + " is not a letter!\n");
				}
				else
				{
					System.out.print(wordarray[i] + " is a letter!\n");
				}
			}
		}
	}
	
	private void Output()
	{
		for(int i=0; i<wordlen; i++) //for each char in the array
		{
			for(int j=0; j<numletters; j++) //print n times
			{
				System.out.print(wordarray[i]);
			}
		}
	}
}
