
public class Location implements Comparable<Location>
{
	private int XPos;
	private int YPos;
	
	public Location(int row, int col)
	{
		XPos = row;
		YPos = col;
	}
	
	public int getRow()
	{
		return XPos;
	}
	
	public int getCol()
	{
		return YPos;
	}
	
	public int compareTo(Location other)
	{
		return 0;
	}
	public Location getAdjacentLocation(int direction)
	{
		if (direction == 45)
		{
			return new Location(getRow() - 1, getCol() + 1);
		} else if (direction == 90)
		{
			return new Location(getRow(), getCol() + 1);
		} else if (direction == 135)
		{
			return new Location(getRow() + 1, getCol() + 1);
		} else if (direction == 180)
		{
			return new Location(getRow() + 1, getCol());
		} else if (direction == 225)
		{
			return new Location(getRow() + 1, getCol() - 1);
		} else if (direction == 270)
		{
			return new Location(getRow(), getCol() - 1);
		} else if (direction == 315)
		{
			return new Location(getRow() - 1, getCol() - 1);
		} else if (direction == 360 || direction == 0)
		{
			return new Location(getRow() - 1, getCol());
		} else return null;
		
	}
	
	public boolean equals(Object other)
	{
		Location temp = (Location) other;
		if (getRow() == temp.getRow() && getCol() == temp.getCol())
		{
			return true;
		} else return false;
	}
	
	public String toString()
	{
		return (XPos + "," + YPos);
	}
	
}
