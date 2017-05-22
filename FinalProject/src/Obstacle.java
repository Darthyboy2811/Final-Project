import java.awt.Polygon;
public class Obstacle implements Encounterable
{
	private int[] x, y;
	private int n;
	
	public Obstacle(int[] xPoint, int[] yPoint, int vert)
	{
		super(xPoint, yPoint, vert);
		x = xPoint;
		y = yPoint;
		n = vert;
	}
	
	public int[] getX()
	{
		return x;
	}
	
	public int[] getY()
	{
		return y;
	}
	
	public int getVertices()
	{
		return n;
	}
	
	public void putSelfInGrid(Map grid, Location loc)
	{
		grid.put(loc, new Obstacle(x,y,n));
	}
	
}
