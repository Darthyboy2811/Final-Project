
public class Map<E>
{
	private Object[][] MapDisplay;
	
	public Map(int numRows, int numCols)
	{
		MapDisplay = new Object [numRows][numCols];
	}
	
	public E put(Location loc, Object ob)
	{
		MapDisplay[loc.getRow()][loc.getCol()] = ob;
		return null;
	}
}
