
public class Obstacle implements Encounterable
{
	private int len, wid, x, y;
	private Location loc;
	private ArrayList<Location> arr;
	
	public Obstacle(int xPoint, int yPoint, int Length, int Width)
	{
		len = Length;
		wid = Width;
		x = xPoint;
		y = yPoint;
		loc = new Location(x,y);
	}
	
	public int getWidth()
	{
		return wid;
	}
	
	public int getLength()
	{
		return len;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public Location getLocation()
	{
		return loc;
	}
	
	public void putSelfInGrid(Map<Location> grid, Location loc)
	{
		
	}
	
	public void interact()
	{
		
	}
	
}
