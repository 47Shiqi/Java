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
		
		Output ALLinfo = new Output();
		ALLinfo.printEverything(planeinfo1, planeinfo2, planeinfo3);
	}
}
