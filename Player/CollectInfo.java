// Class that collects and display all info 
package javaPack;

import java.util.Scanner;

public class CollectInfo extends runner_Player
{
	// declare and initialize variables
	String name;
	int x;
	int y;
	int z;
	int hp;
	int dir;
	boolean truefalse;
	
	Scanner allinput = new Scanner(System.in);
	
	public CollectInfo()
	{
		AllInfo();
	}
	
	public void AllInfo()
	{
		Player p1 = new Player(); //use default constructor to create a player
		System.out.println(p1.toString());
		System.out.println("\nDefault player " + p1.getName() + " is created!");
		System.out.println("------------------------------");
		
		System.out.println("Please provide the name, x, y, and z coordinates for the next player"); //get the second player's info
		name = Name();
		x = AskNum("x coordinate(enter an integer please): ");
		y = AskNum("y coordinate(enter an integer please): ");
		z = AskNum("z coordinate(enter an integer please): ");
		
		Player p2 = new Player(name,x,y,z); //create a second player using the user inputs
		
		System.out.println(p2.toString()); 
		System.out.println("\nPlayer " + name + " is created!");
		System.out.println("------------------------------");
		
		System.out.println("Please provide the name, x, y, and z coordinates, health, and direction"
				+ " for the next player"); //get the third player's info
		
		name = Name();
		x = AskNum("x coordinate(enter an integer please): ");
		y = AskNum("y coordinate(enter an integer please): ");
		z = AskNum("z coordinate(enter an integer please): ");
		hp = AskNum("health(enter an integer please): ");
		dir = AskNum("direction(enter an integer from 1-6 please): ");
		
		Player p3 = new Player(name,x,y,z,hp,dir); //create a third player using the user inputs
		
		System.out.println(p3.toString());
		System.out.println("\nPlayer " + name + " is created!");
		System.out.println("------------------------------");
		
		
		//play the game using the mutators
		System.out.println("The game is in progress..." + "\n");
		
		p2.setHP(30);
		System.out.println(p2.getName() + "'s hp is set to " + p2.getHP());
		
		System.out.println(p1.getName() + " - hp: " + p1.getHP() + ", " + p2.getName() + " - hp: " + p2.getHP() + ", " + p3.getName() + " - hp: " + p3.getHP());
		p2.attack(p1,4);
		System.out.println(p2.getName() + " attempts to attack " + p1.getName());
		System.out.println(p1.getName() + " - hp: " + p1.getHP() + ", " + p2.getName() + " - hp: " + p2.getHP() + ", " + p3.getName() + " - hp: " + p3.getHP());
		p1.attack(p3,55);
		System.out.println(p1.getName() + " attempts to attack " + p3.getName());
		System.out.println(p1.getName() + " - hp: " + p1.getHP() + ", " + p2.getName() + " - hp: " + p2.getHP() + ", " + p3.getName() + " - hp: " + p3.getHP() + "\n");
		
		p1.setDirection(2);
		p3.setDirection(-2);
		System.out.println(p1.getName() + "'s direction is set to " + p1.getDirection());
		System.out.println(p3.getName() + "'s direction is set to " + p3.getDirection());
		
		p1.move(4, 2);
		p2.move(1, 33);
		System.out.println(p1.getName() + " moves 2 units down");
		System.out.println(p2.getName() + " moves 33 units to the north");
		
		p3.teleport(p2);
		System.out.println(p3.getName() + " is teleported to " + p2.getName() + "'s location.");
		
		System.out.println("distance between " + p3.getName() + " and the origin is " + p3.getDistance(0,0,0));
		System.out.println("distance between " + p1.getName() + " and " + p2.getName() + " is " + p1.getDistance(p2));
		
		System.out.println("------------------------------");
		System.out.println("Result:");

		//print the final state of all the players
		System.out.println(p1.toString());
		System.out.println("------------------------------");
		System.out.println(p2.toString());
		System.out.println("------------------------------");
		System.out.println(p3.toString());
		System.out.println("------------------------------");
	}
	
	public String Name() //ask the user to enter a name
	{
		String thename;
		System.out.print("name: ");
		thename = allinput.nextLine();
		truefalse = CheckEmpty(thename); //check if the user enters anything
		if(truefalse == false)
		{
			System.out.println("Invalid input, please try again");
			return Name(); //ask the name again
		}
		else
		{
			return thename;
		}
	}
	
	public boolean CheckEmpty(String string) //check if a string is blank 
	{
		if(string.equals(""))
		{
			return false;
		}
		else
		{
			return true;
		}
		 
	}
	
	public int AskNum(String question) //ask the user to enter a integer
	{
		String strNum;
		System.out.print(question);
		strNum = allinput.nextLine();
		truefalse = CheckEmpty(strNum);
		if(truefalse == false)
		{
			System.out.println("Invalid input, please try again");
			return AskNum(question);
		}
		else
		{
			int thenum = Integer.parseInt(strNum); //convert the string to integer
			return thenum;
		}
	}
	
	public void Restart()
	{
		String yesorno;
		yesorno = allinput.nextLine().toUpperCase();
		//checks if the answer is yes or no
		if(yesorno.equals("YES") || yesorno.equals("Y"))
		{
			System.out.println("------------------------------");
			runner_Player.main(null);
		}
		else if(yesorno.equals("NO") || yesorno.equals("N"))
		{
			System.out.println("Thank you! Bye!");
			System.exit(0);
		}
		else
		{
			System.out.print("Enter yes/y or no/n please: ");
			Restart(); //asks and checks again
		}
	}
}
