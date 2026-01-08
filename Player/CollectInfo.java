// Class that collect all info 
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
		Player p1 = new Player();
		System.out.println(p1.toString());
		System.out.println("Default player " + p1.getName() + " is created!");
		System.out.println("------------------------------");
		
		System.out.println("Please provide the name, x, y, and z coordinates for the 2nd player");
		name = Name();
		x = AskNum("x coordinate(enter an integer please): ");
		y = AskNum("y coordinate(enter an integer please): ");
		z = AskNum("z coordinate(enter an integer please): ");
		
		Player p2 = new Player(name,x,y,z);
		
		System.out.println(p2.toString());
		System.out.println("Player " + name + " is created!");
		System.out.println("------------------------------");
		
		System.out.println("Please provide the name, x, y, and z coordinates, health, and direction"
				+ " for the 3rd player");
		
		name = Name();
		x = AskNum("x coordinate(enter an integer please): ");
		y = AskNum("y coordinate(enter an integer please): ");
		z = AskNum("z coordinate(enter an integer please): ");
		hp = AskNum("health(enter an integer please): ");
		dir = AskNum("direction(enter an integer from 1-6 please): ");
		
		Player p3 = new Player(name,x,y,z,hp,dir);
		
		System.out.println(p3.toString());
		System.out.println("Player " + name + " is created!");
		System.out.println("------------------------------");
		
		
		//play the game
		System.out.println("The game is in progress...");
		p3.setHP(30);
		System.out.println(p3.getName() + "'s hp is set to " + p3.getHP());
		
		p1.setDirection(2);
		p2.setDirection(-2);
		System.out.println(p1.getName() + "'s direction is set to " + p1.getDirection());
		System.out.println(p2.getName() + "'s direction is set to " + p2.getDirection());
		
		p1.move(4, 2);
		p2.move(1, 33);
		System.out.println(p1.getName() + " moves 2 units to the west");
		System.out.println(p2.getName() + " moves 33 units to the north");
		
		p3.teleport(p2);
		System.out.println(p3.getName() + " is teleported to " + p2.getName() + " location.");
		
		System.out.println("distance between " + p3.getName() + " and the origin is " + p3.getDistance(0,0,0));
		System.out.println("distance between " + p1.getName() + " and " + p2.getName() + " is " + p1.getDistance(p2));
		
		p2.attack(p1,4);
		System.out.println(p2.getName() + " attempts to attack " + p1.getName());
		System.out.println(p2.getName() + " - hp: " + p2.getHP() + ", " + p1.getName() + " - hp: " + p1.getHP());
		p1.attack(p3,55);
		System.out.println(p1.getName() + " attempts to attack " + p3.getName());
		System.out.println(p1.getName() + " - hp: " + p1.getHP() + ", " + p3.getName() + " - hp: " + p3.getHP());
		
		
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
	
	public String Name()
	{
		String thename;
		System.out.print("name: ");
		thename = allinput.nextLine();
		truefalse = CheckEmpty(thename);
		if(truefalse == false)
		{
			System.out.println("Invalid input, please try again");
			return Name();
		}
		else
		{
			return thename;
		}
	}
	
	public boolean CheckEmpty(String string)
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
	
	public int AskNum(String question)
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
			int thenum = Integer.parseInt(strNum);
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
