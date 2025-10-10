// Class to get airplane data and perform movement and distance calculations
package javaPack;

public class Airplane 
{
	// declare variables
	private String theCs;
	private double theDist;
	private int theDir;
	private int theAlt;
	
	// Updated values after movement
	private int NewAlt = 0;
	private double NewDist = 0.0;
	private int NewDir = 0;
	
	// string representation of airplane status
	private String allField;

	public Airplane()
	{
		// Default constructor Airplane - assigns values to the first default plane
		this.theCs  = "AAA01";
		this.theDist = 1.0;
		this.theDir = 0;
		this.theAlt = 0;
	}
	
	public Airplane(String cs, double dist, int dir, int alt)
	{
		// Constructor that collects info for the other planes 
		this.theCs  = cs.toUpperCase();
		this.theDist = AbsDouble(dist);
		this.theDir = CheckDir(dir);
		this.theAlt = AbsInt(alt);
	}
	
	public double AbsDouble(double num)
	{
		// return the absolute double value
		if(num < 0)
		{
			num = -num;
		}
		return num;
	}
	
	public int AbsInt(int num)
	{
		// return the absolute integer value
		if(num < 0)
		{
			num = -num;
		}
		return num;
	}
	
	public int CheckDir(int d)
	{
		// make direction to stay within 0-360
		d = d % 360;
		if(d < 0)
		{
			d = d + 360;
		}
		return d;
	}
	
	public void move(double Mdist, int Mdir)
	{
		// Calculate the new distance of a plane after it moves
		
		// new position = original position (distance) + the distance moved
		// x is the total horizontal(east-west) displacement
		// y is the total vertical(north-south) displacement
		double x = (theDist * Math.sin((theDir) * Math.PI / 180.0)) + (Mdist * Math.sin((Mdir) * Math.PI / 180.0));
		double y = (theDist * Math.cos((theDir) * Math.PI / 180.0)) + (Mdist * Math.cos((Mdir) * Math.PI / 180.0));
		// pythagorean theorem
		NewDist = Math.sqrt(x*x + y*y);
		NewDist = Math.round(NewDist * 100.0) / 100.0;
		// use inverse tangent to get the angle (direction)
		double DoubleNewDir = (Math.atan2(x, y)) * 180.0 / Math.PI;
		NewDir = (int)DoubleNewDir;
		// if direction is negative, convert the negative angle to its positive equivalent
		NewDir = CheckDir(NewDir);
	}
	
	public void gainAlt(int howmany)
	{
		// increase the plane's altitude by "howmany * 1000" where "howmany" represent the number of times the plane will move up
		NewAlt = theAlt + (howmany * 1000);
	}
	
	public void loseAlt(int howmany)
	{
		// decrease the plane's altitude by "howmany * 1000" where "howmany" represent the number of times the plane will move down
		NewAlt = theAlt - (howmany * 1000);
		if(NewAlt < 0)
		{
			NewAlt = 0;
		}
	}
	
	public int getAlt()
	{
		// return the new altitude after increasing/decreasing its height
		return NewAlt;
	}
	
	public String toString()
	{
		// Output all info for a plane before updating
		String StrDir = ThreePlaces(theDir);
		allField = theCs + " - " + theDist + " miles away at bearing " + StrDir + "°, altitude " + theAlt + " feet";
		return allField;
	}
	
	public String ThreePlaces(int dir)
	{
		// Convert the value of direction into a three digit number
		String strDirection = "";
		if(dir < 10)
		{
			strDirection = "00" + dir;
		}
		else if(dir < 100)
		{
			strDirection = "0" + dir;
		}
		else
		{
			strDirection = "" + dir;
		}
		
		return strDirection;
	}
	
	public double distTo(Airplane other)
	{
		// return the distance between two planes before updating
		return CalcDist(theDist,theDir,other.theDist,other.theDir);
	}
	
	public double CalcDist(double Dist1, int Dir1, double Dist2, int Dir2)
	{
		// Calculate the distance between two planes
		
		// xDist is the difference in east-west displacement between two planes
		// yDist is the difference in north-south displacement between two planes
		double xDist = (Dist1 * Math.sin((Dir1) * Math.PI / 180.0)) - (Dist2 * Math.sin((Dir2) * Math.PI / 180.0));
		double yDist = (Dist1 * Math.cos((Dir1)* Math.PI / 180.0)) - (Dist2 * Math.cos((Dir2)* Math.PI / 180.0));
		double DistBt = Math.sqrt(xDist*xDist + yDist*yDist);
		DistBt = Math.round(DistBt * 100.0) / 100.0;
		return DistBt;
	}
	
	public int AltTo(Airplane other)
	{
		// return the difference in height between two planes before updating
		return CalcAlt(theAlt, other.theAlt);
	}
	
	public int CalcAlt(int Alt1, int Alt2)
	{
		// calculate the difference in height between two planes
		int Height = Alt1 - Alt2;
		Height = AbsInt(Height);
		return Height;
	}
	
	public String NewPosition()
	{
		// Output all info for a plane after updating
		String StrDir = ThreePlaces(NewDir);
		allField = theCs + " - " + NewDist + " miles away at bearing " + StrDir + "°, altitude " + getAlt() + " feet";
		return allField;
	}
	
	public double NewDistBt(Airplane other)
	{
		// return the distance between two planes after updating
		return CalcDist(NewDist,NewDir,other.NewDist,other.NewDir);
	}
	
	public int NewHeight(Airplane other)
	{
		// return the difference in height between two planes after updating
		return CalcAlt(NewAlt, other.NewAlt);
	}
}
