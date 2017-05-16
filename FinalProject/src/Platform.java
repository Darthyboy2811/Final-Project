
public class Platform extends Floor 
{
	private int FailCount;
	private Floor flo;
	
	public Platform(Location loc)
	{
		FailCount = 0;
		flo = new Floor(loc);
		
	}
	
	public int getFails()
	{
		return FailCount;
	}
}
