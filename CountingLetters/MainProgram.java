package javaPack;

public class MainProgram //Parent class that starts the program
{
	public static void main(String[] args) 
	{
		ArrayChar arrchar = new ArrayChar();
		System.out.println("Welcome to my letter counting words!");
		System.out.print("This program will print out each "
				+ "letter of a word n amount of times\n"
				+ "Enter a number: ");
		arrchar.AcceptInfo(); //runs the function AcceptInfo
	}

}
