package javaPack;

import java.util.Scanner;

public class BubbleSort extends MainProgram //Class that sorts the numbers in the array
{
	static Scanner allinput = new Scanner(System.in);
	private int[] arr;
	
	public BubbleSort(int[] inputArr)
	{
		this.arr = inputArr;
	}
	
	public int[] Sort()
	{		
		//THE ALGORITHM
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = 0; j < arr.length - i - 1; j++)
			{
				//Task: Compare and Swap
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	public void Restart()
	{
		String yesorno;
		yesorno = allinput.nextLine().toUpperCase();
		//checks if the answer is yes or no
		if(yesorno.equals("YES") || yesorno.equals("Y"))
		{
			System.out.println("-------------------------------------");
			MainProgram.main(null);
		}
		else if(yesorno.equals("NO") || yesorno.equals("N"))
		{
			System.out.println("Thank you! Bye!");
			System.exit(0);
		}
		else
		{
			System.out.println("Enter yes/y or no/n please: ");
			Restart(); //asks and checks again
		}
	}
}
