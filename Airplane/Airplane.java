package javaPack;

public class Airplane 
{
	private String theCs;
	private double theDist;
	private int theDir;
	private int theAlt;
	
	private int NewAlt;
	private double NewDist;
	private int NewDir;
	private String allField;

	public Airplane()
	{
		this.theCs  = "AAA01";
		this.theDist = 1.0;
		this.theDir = 0;
		this.theAlt = 0;
	}
	
	public Airplane(String cs, double dist, int dir, int alt)
	{
		this.theCs  = cs.toUpperCase();
		this.theDist = dist;
		this.theDir = dir;
		this.theAlt = alt;
		if(dir > 360)
		{
			this.theDir = dir % 360;
		}
	}
	
	public void move(double Mdist, int Mdir)
	{
		double x = (theDist * Math.sin((theDir) * Math.PI / 180.0)) + (Mdist * Math.sin((Mdir) * Math.PI / 180.0));
		double y = (theDist * Math.cos((theDir) * Math.PI / 180.0)) + (Mdist * Math.cos((Mdir) * Math.PI / 180.0));
		NewDist = Math.sqrt(x*x + y*y);
		NewDist = Math.round(NewDist * 100.0) / 100.0;
		
		double DoubleNewDir = (Math.atan2(x, y)) * 180.0 / Math.PI;
		NewDir = (int)DoubleNewDir;
		if(NewDir < 0)
		{
			NewDir = 360 + NewDir;
		}
	}
	
	public void gainAlt(int howmany)
	{
		NewAlt = theAlt + (howmany * 1000);
	}
	
	public void loseAlt(int howmany)
	{
		NewAlt = theAlt - (howmany * 1000);
		if(NewAlt < 0)
		{
			NewAlt = 0;
		}
	}
	
	public int getAlt()
	{
		return NewAlt;
	}
	
	public String toString()
	{
		String StrDir = ThreePlaces(theDir);
		allField = theCs + " - " + theDist + " miles away at bearing " + StrDir + "°, altitude " + theAlt + " feet";
		return allField;
	}
	
	public String ThreePlaces(int dir)
	{
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
		return CalcDist(theDist,theDir,other.theDist,other.theDir);
	}
	
	public double CalcDist(double Dist1, int Dir1, double Dist2, int Dir2)
	{
		double xDist = (Dist1 * Math.sin((Dir1) * Math.PI / 180.0)) - (Dist2 * Math.sin((Dir2) * Math.PI / 180.0));
		double yDist = (Dist1 * Math.cos((Dir1)* Math.PI / 180.0)) - (Dist2 * Math.cos((Dir2)* Math.PI / 180.0));
		double DistBt = Math.sqrt(xDist*xDist + yDist*yDist);
		DistBt = Math.round(DistBt * 100.0) / 100.0;
		return DistBt;
	}
	
	
	public int AltTo(Airplane other)
	{
		return CalcAlt(theAlt, other.theAlt);
	}
	
	public int CalcAlt(int Alt1, int Alt2)
	{
		int Height = Alt1 - Alt2;
		if(Height < 0)
		{
			Height = -Height;
		}
		return Height;
	}
	
	public String NewPosition()
	{
		String StrDir = ThreePlaces(NewDir);
		allField = theCs + " - " + NewDist + " miles away at bearing " + StrDir + "°, altitude " + getAlt() + " feet";
		return allField;
	}
	
	public double NewDistBt(Airplane other)
	{
		return CalcDist(NewDist,NewDir,other.NewDist,other.NewDir);
	}
	
	public int NewHeight(Airplane other)
	{
		return CalcAlt(NewAlt, other.NewAlt);
	}
}
