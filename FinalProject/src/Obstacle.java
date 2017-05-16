
public class Obstacle implements Encounterable
{
	private boolean touched;
	private Player thing;
	
	public Obstacle(Player thing1)
	{
		touched = false;
		thing = thing1;
	}
	
	public boolean isTouching()
	{
		if (thing.getAdjacentLocation().equals(thing.getLoc()) )
		{
			touched = true;
		}
		return touched;
	}
	
	public void interact()
	{
		
	}
	
}
