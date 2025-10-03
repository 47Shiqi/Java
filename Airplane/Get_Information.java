package javaPack;

public class Get_Information 
{
	String callsign = "AAA01";
	double distance = 1;
	int direction = 0;
	int altitude = 0;
	
	public Get_Information()
	{
		AllInfo();
	}
	
	public void AllInfo()
	{
		Airplane planeinfo = new Airplane(callsign, distance, direction, altitude);
		
		System.out.println(planeinfo.gainAlt());
	}
}
