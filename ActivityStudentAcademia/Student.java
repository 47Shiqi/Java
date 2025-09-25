package javaPack;

public class Student 
{
	private String firstname, lastname;
	private int grade;
	private int pGPA;
	private int cGPA;
	
	public Student(String sFName, String sLName, int sGrade, int spGPA, int scGPA)
	{
		this.firstname = sFName;
		this.lastname = sLName;
		this.grade = sGrade;
		this.pGPA = spGPA;
		this.cGPA = scGPA;
	}
	
	public String GetName()
	{
		String fullname = firstname + " " + lastname;
		return fullname;
	}
	
	public Integer GetGrade()
	{
		grade = grade + 1;
		return grade;
	}
	
	public Double GetpGpa()
	{
		double pGPA_4_scale = pGPA / 100.0 * 4.0;
		return pGPA_4_scale;
	}
	
	public Double GetcGpa()
	{
		double cGPA_4_scale = cGPA / 100.0 * 4.0;
		return cGPA_4_scale;
	}
	
	public Double updateGpa_100()
	{
		double avg_100 = (pGPA + cGPA) / 2.0;
		return avg_100;
	}
	
	public Double updateGpa_4()
	{
		double avg_4 = updateGpa_100() / 100.0 * 4.0;
		return avg_4;
	}
	
	public Boolean promote()
	{
		boolean ifPromote = false;
		if(GetcGpa() >= 2.6)
		{
			ifPromote = true;
		}
		return ifPromote;
	}
	
	public Boolean isHonorRoll()
	{
		boolean ifHonor = false;
		if(updateGpa_4() >= 3.5)
		{
			ifHonor = true;
		}
		return ifHonor;
	}
}
