package javaPack;

public class Airplane 
{
	private String theCs;
	private double theDist;
	private int theDir;
	private int theAlt;

	
	public Airplane(String cs, double dist, int dir, int alt)
	{
		this.theCs  = cs;
		this.theDist = dist;
		this.theDir = dir;
		this.theAlt = alt;
	}
	
	public int gainAlt()
	{
		return theAlt + 1000;
	}
}
