package javaPack;

public class MainProgram {

	public static void main(String[] args) 
	{
		BubbleSort array = new BubbleSort();
		int[] myArray = array.Sort();
			
		//Output Result
		for(int n=0; n<myArray.length; n++)
		{
			System.out.print(myArray[n] + " ");
		}
	}
}
