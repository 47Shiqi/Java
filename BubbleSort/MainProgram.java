package javaPack;

public class MainProgram //main class that runs the program
{
	public static void main(String[] args) 
	{
		BubbleSort array = new BubbleSort();
		int[] myArray = array.Sort(); //use the method Sort from the class BubbleSort
			
		//Output Result
		for(int n=0; n<myArray.length; n++)
		{
			System.out.print(myArray[n] + " ");
		}
	}
}
