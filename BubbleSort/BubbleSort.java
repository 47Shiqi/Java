package javaPack;

public class BubbleSort 
{
	public BubbleSort()
	{
		Sort();
	}
	
	public int[] Sort()
	{
		int[] arr = {25, 10, 7, 32, 5};
		
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
}
