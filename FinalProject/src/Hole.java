
public class Hole extends Floor
{
	private int FailCount;


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
