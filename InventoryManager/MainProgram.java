package javaPack;

import java.util.Scanner;

public class MainProgram //main class that runs the program
{
	static Scanner allinput = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		AllInfo();
	}
	
	public static void AllInfo()
	{
		//declare variables
		int howmany;
		String pname;
		double pprice;
		int pquantity;
		
		howmany = Howmany(); //ask how many number and check
		
		Product[] allproduct = new Product[howmany]; //create an allproduct array with a length of howmany

						
		for (int i=0; i<howmany; i++)
		{
			pname = Name(i); //ask for inputs and check
			pprice = Price();  
			pquantity = Quantity(); 			
			
			allproduct[i] = new Product(pname,pprice,pquantity); //create a new Product object with the inputs and store at i index
		}
					
		//Output Result
		double total = 0;
		
		System.out.println("-----Inventory-----");
		for(int j=0; j<allproduct.length; j++)
		{
			System.out.println(allproduct[j].Name() + " - $" + allproduct[j].Price() + " - Quantity: " + allproduct[j].Quantity());
			total = total + allproduct[j].TotalValue();
		}
		//keep 2 decimal places
		int intTotal = (int) (total * 100);
		total = intTotal / 100.0;
		System.out.println("Total Value: $" + total);
		
		System.out.println("Would you like to restart(enter yes/y or no/n please)? ");
		Restart(); //check the user's answer to the above question
	}
	
	public static int Howmany()
	{
		System.out.println("How many products do you want to enter(enter a number between 1 and 20)?");
		String strnum = allinput.nextLine();
		boolean tORf = CheckHowmany(strnum);
		while(tORf == false)
		{
			System.out.println("Please enter an integer between 1 and 20");
			strnum = allinput.nextLine();
	        tORf = CheckHowmany(strnum);  //if invalid, call CheckHowmany again
		}
		return Integer.parseInt(strnum);
	}
	
	public static boolean CheckHowmany(String strhowmany)
	{
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
			int inthowmany = Integer.parseInt(strhowmany);
			if(inthowmany < 1 || inthowmany > 20)
			{
				return false; //check if it is within the range
			}
		}
		return true;
	}
	
	public static String Name(int index)
	{
		System.out.println((index+1) + ") Enter the name of the product: ");
		String strname = allinput.nextLine();
		
		boolean tORf = CheckName(strname);
		while(tORf == false)
		{
			System.out.println("Please enter a name");
			strname = allinput.nextLine();
			tORf = CheckName(strname); //if invalid, call CheckName again
		}
		return strname;
	}
	
	public static boolean CheckName(String strNum)
	{
		if(strNum.equals("")) //check if it is blank
		{
			return false;
		}
		else
		{	
			return true;
		}
	}
	
	public static double Price()
	{
		System.out.println("Enter the price:");
		String strprice = allinput.nextLine();
		
		boolean tORf = CheckPrice(strprice);
		while(tORf == false)
		{
			System.out.println("Please enter an positive number");
			strprice = allinput.nextLine();
			tORf = CheckPrice(strprice); //if invalid, call CheckPrice again
		}
		return Double.parseDouble(strprice);
	}
	
	public static boolean CheckPrice(String strNum)
	{
		int countDecimal = 0;
		if(strNum.equals("")) //check if it is blank
		{
			return false;
		}
		else
		{	
			int len = strNum.length();
			for (int i = 0; i < len ; i++) 
			{
				if(strNum.charAt(i) == '.')
				{
					countDecimal++; //store the number of decimals
				}
				else if(strNum.charAt(i) < '0' || strNum.charAt(i) > '9')
				{
					return false; //check if every char is a number or a decimal
				}
			}
		}
		if(countDecimal > 1) //no more than 1 decimal point
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static int Quantity()
	{
		System.out.println("Enter the quantity:");
		String strquantity = allinput.nextLine();
		
		boolean tORf = CheckQuantity(strquantity);
		while(tORf == false)
		{
			System.out.println("Please enter a positive integer");
			strquantity = allinput.nextLine();
			tORf = CheckQuantity(strquantity); //if invalid, call CheckQuantity again
		}
		return Integer.parseInt(strquantity);
	}
	
	public static boolean CheckQuantity(String strNum)
	{
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
		}
		
		return true;
	}
	
	public static void Restart()
	{
		String yesorno;
		yesorno = allinput.nextLine().toUpperCase();
		//check if the answer is yes or no
		if(yesorno.equals("YES") || yesorno.equals("Y"))
		{
			AllInfo();
		}
		else if(yesorno.equals("NO") || yesorno.equals("N"))
		{
			System.out.println("Thank you! Bye!");
			System.exit(0);
		}
		else
		{
			System.out.println("Enter yes/y or no/n please: ");
			Restart(); //ask and checks again
		}
	}
}
