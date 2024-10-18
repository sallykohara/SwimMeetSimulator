
public class InitialVsResult 
{
	private String name;
	private double initialTime;
	private double finalTime;
	

//	public InitialVsResult(String name2, double initialTime2, double finalTime2) 
//	{
//		
//	}

	public InitialVsResult(String name, double initialTime, double finalTime) 
	{
		this.name = name; 
		this.initialTime = initialTime;
		this.finalTime = finalTime;
	}
	
	public String getCountry()
	{
		return name;
	}
	public double getInitialTime()
	{
		return initialTime;
	}
	public double getFinalTime()
	{
		return finalTime;
	}
	public void setFinalTime(double finalTime)
	{
		this.finalTime = finalTime;
	}
	public boolean improved()
	{
		return finalTime < initialTime;
	}
	public String Result()
	{
		System.out.println("Initial Time: " +initialTime+ ", Final Time:" +finalTime);
		return name;
	}
	
}
