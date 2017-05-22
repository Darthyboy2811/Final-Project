
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
	
	public Location getLocation(Object ob)
	{
		for (int row = 0; row < MapDisplay.length;)
		{
			for (int col = 0; col < MapDisplay[0].length;)
			{
				if(MapDisplay[row][col] == ob)
				{
					return new Location(row, col);
					
				}
				
			}
		}
		return null;
	}
	
	public void updateArray()
	{
		for (int row = 0; row < MapDisplay.length;)
		{
			for (int col = 0; col < MapDisplay[0].length;)
			{
				if(col == 0)
					MapDisplay[row][col] = null;
				else
					{
					MapDisplay[row][col-1] = MapDisplay[row][col];
					MapDisplay[row][col] = null;
					}
			}
		}
			
		
		
	
	}


	
}
