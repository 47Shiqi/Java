// Collect all info and display all outputs
package javaPack;

import java.util.Scanner;

public class CollectInfo 
{
	String callsign;
	double distance = 0.0;
	int direction = 0;
	int altitude = 0;
	
	Scanner allinput = new Scanner(System.in);
	
	public CollectInfo()
	{
		AllInfo();
	}
	
	public void AllInfo()
	{
		Airplane planeinfo1 = new Airplane();
		Airplane planeinfo2 = new Airplane("AAA02", 15.8, 128, 30000);
		
		System.out.print("Enter the call-sign of the third airplane: ");
		callsign = allinput.nextLine();
		
		System.out.print("Enter its horizontal distance in miles from the tower (as a positive number): ");
		distance = allinput.nextDouble();
		
		System.out.print("Enter its bearing from the tower (as an integer): ");
		direction = allinput.nextInt();
		
		System.out.print("Enter its a positive altitude in feet (as an integer): ");
		altitude = allinput.nextInt();
		
		Airplane planeinfo3 = new Airplane(callsign, distance, direction, altitude);
		
		planeinfo1.gainAlt(3);
		planeinfo2.loseAlt(2);
		planeinfo3.loseAlt(4);
		planeinfo1.move(planeinfo2.distTo(planeinfo3), 65);
		planeinfo2.move(8.0, 135);
		planeinfo3.move(5.0, 55);
		
		System.out.println("\nInitial Positions");
        System.out.println("Airplane 1: " + planeinfo1.toString());
        System.out.println("Airplane 2: " + planeinfo2.toString());
        System.out.println("Airplane 3: " + planeinfo3.toString());
        
        System.out.println("\nInitial Distances");
		System.out.println("The distance between Airplane 1 and Airplane 2 is " + planeinfo1.distTo(planeinfo2) + " miles");
		System.out.println("The distance between Airplane 1 and Airplane 3 is " + planeinfo1.distTo(planeinfo3) + " miles");
		System.out.println("The distance between Airplane 2 and Airplane 3 is " + planeinfo2.distTo(planeinfo3) + " miles");
		
		System.out.println("\nInitial Height Differences");
		System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + planeinfo1.AltTo(planeinfo2) + " feet");
		System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + planeinfo1.AltTo(planeinfo3) + " feet");
		System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + planeinfo2.AltTo(planeinfo3) + " feet");
		
		
		System.out.println("\nNew Positions");
		System.out.println("Airplane 1: " + planeinfo1.NewPosition());
		System.out.println("Airplane 2: " + planeinfo2.NewPosition());
		System.out.println("Airplane 3: " + planeinfo3.NewPosition());
		
		System.out.println("\nNew Distances");
		System.out.println("The distance between Airplane 1 and Airplane 2 is " + planeinfo1.NewDistBt(planeinfo2) + " miles");
		System.out.println("The distance between Airplane 1 and Airplane 3 is " + planeinfo1.NewDistBt(planeinfo3) + " miles");
		System.out.println("The distance between Airplane 2 and Airplane 3 is " + planeinfo2.NewDistBt(planeinfo3) + " miles");
		
		System.out.println("\nNew Height Differences");
		System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + planeinfo1.NewHeight(planeinfo2) + " feet");
		System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + planeinfo1.NewHeight(planeinfo3) + " feet");
		System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + planeinfo2.NewHeight(planeinfo3) + " feet");
	}
}
