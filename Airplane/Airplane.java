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
		double x = (theDist * Math.sin(Math.toRadians(theDir))) + (Mdist * Math.sin(Math.toRadians(Mdir)));
		double y = (theDist * Math.cos(Math.toRadians(theDir))) + (Mdist * Math.cos(Math.toRadians(Mdir)));
		NewDist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		NewDist = Math.round(NewDist * 100.0) / 100.0;
		
		double DoubleNewDir = Math.toDegrees(Math.atan2(x, y));
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
		if(theAlt < 1000)
		{
			NewAlt = 0;
		}
		else
		{
			NewAlt = theAlt - (howmany * 1000);
		}
	}
	
	public int getAlt()
	{
		return NewAlt;
	}
	
	public String toString()
	{
		String StrDir = String.format("%03d", theDir);
		allField = theCs + " - " + theDist + " miles away at bearing " + StrDir + "°, altitude " + theAlt + " feet";
		return allField;
	}
	
	public double distTo(Airplane other)
	{
		return CalcDist(theDist,theDir,other.theDist,other.theDir);
	}
	
	public double CalcDist(double Dist1, int Dir1, double Dist2, int Dir2)
	{
		double xDist = (Dist1 * Math.sin(Math.toRadians(Dir1))) - (Dist2 * Math.sin(Math.toRadians(Dir2)));
		double yDist = (Dist1 * Math.cos(Math.toRadians(Dir1))) - (Dist2 * Math.cos(Math.toRadians(Dir2)));
		double DistBt = Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
		DistBt = Math.round(DistBt * 100.0) / 100.0;
		return DistBt;
	}
	
	
	public int AltTo(Airplane other)
	{
		return CalcAlt(theAlt, other.theAlt);
	}
	
	public int CalcAlt(int Alt1, int Alt2)
	{
		int Height = Math.abs(Alt1 - Alt2);
		return Height;
	}
	
	public String NewPosition()
	{
		String StrDir = String.format("%03d", NewDir);
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
