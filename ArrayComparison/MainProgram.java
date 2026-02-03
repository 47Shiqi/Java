package javaPack;

public class MainProgram //main class that starts the program
{ 
	public static void main(String[] args) 
	{
		ArrayCompare array = new ArrayCompare();
		System.out.println("The word(s) with the shortest length will be printed");
		
		String[] arrayWords = array.Compare(); //get the array returned by the method Compare
		for(int i=0; i<arrayWords.length; i++) //print all values in the array
		{
			System.out.println(arrayWords[i]); 
		}
	}
}
