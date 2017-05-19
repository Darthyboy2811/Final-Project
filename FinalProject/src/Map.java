
public class Map
{
	private Object [][] MapDisplay;
	
	public Map(int numRows, int numCols)
	{
		MapDisplay = new Object [numRows][numCols];
	}
	
	public void put(Location loc, Object ob)
	{
		MapDisplay[loc.getRow()][loc.getCol()] = ob;
		
	}
	
	public void remove(Location loc)
	{
		MapDisplay[loc.getRow()][loc.getCol()] = null;
	}
}
