package javaPack;

public class DisplayJavaMenu
{
	public DisplayJavaMenu() 
	{
		// Title and decoration using escape sequences
		String title = "Welcome to Java Cafe \n";
		String line = "----------------------\n\n";
		
		// Menu section using \t for tab spacing
		String menu = "Menu:\n";
		menu += "\t1. Espresso\t$2.50\n";
		menu += "\t2. Latte\t$3.50\n";
		menu += "\t3. Cappuccino\t$4.00\n";
		
		//Quote using escape characters for double quotes
		String quote = "\"Drink coffee and code Java!\"\n\n";
		
		// File path with double backslashes
		String path = "Visit us at C:\\\\JavaCafe\\\\MainStreet";
		
		// Full Msg
		String fullMessage = title + line + menu + quote + path;
		
		// Print the Msg
		System.out.println(fullMessage);
	}
}
