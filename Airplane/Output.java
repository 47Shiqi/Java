package javaPack;

public class Output 
{
	public void printEverything(Airplane p1, Airplane p2, Airplane p3) {
        System.out.println("\nInitial Positions");
        System.out.println("Airplane 1: " + p1.toString());
        System.out.println("Airplane 2: " + p2.toString());
        System.out.println("Airplane 3: " + p3.toString());
        
        System.out.println("\nInitial Distances");
		System.out.println("The distance between Airplane 1 and Airplane 2 is " + p1.distTo(p2) + " miles");
		System.out.println("The distance between Airplane 1 and Airplane 3 is " + p1.distTo(p3) + " miles");
		System.out.println("The distance between Airplane 2 and Airplane 3 is " + p2.distTo(p3) + " miles");
		
		System.out.println("\nInitial Height Differences");
		System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + p1.AltTo(p2) + " feet");
		System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + p1.AltTo(p3) + " feet");
		System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + p2.AltTo(p3) + " feet");
		
		
		System.out.println("\nNew Positions");
		System.out.println("Airplane 1: " + p1.NewPosition());
		System.out.println("Airplane 2: " + p2.NewPosition());
		System.out.println("Airplane 3: " + p3.NewPosition());
		
		System.out.println("\nNew Distances");
		System.out.println("The distance between Airplane 1 and Airplane 2 is " + p1.NewDistBt(p2) + " miles");
		System.out.println("The distance between Airplane 1 and Airplane 3 is " + p1.NewDistBt(p3) + " miles");
		System.out.println("The distance between Airplane 2 and Airplane 3 is " + p2.NewDistBt(p3) + " miles");
		
		System.out.println("\nNew Height Differences");
		System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + p1.NewHeight(p2) + " feet");
		System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + p1.NewHeight(p3) + " feet");
		System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + p2.NewHeight(p3) + " feet");
    }
}
