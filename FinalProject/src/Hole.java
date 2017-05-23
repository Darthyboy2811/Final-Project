
public class Hole extends Floor
{
	private int FailCount;
	private Floor flo;


public Hole(Location loc)
{
	FailCount = 0;
	flo = new Floor(loc);
	
}

public int getFails()
{
	return FailCount;
}

}
