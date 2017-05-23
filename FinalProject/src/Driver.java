
public class Driver 
{
	private Map grid;
	private Player play;
	private GUI g;
	
	
	public Driver()
	{
		grid = new Map(30, 30);
		Location startLoc = new Location(30,30);
		play = new Player(startLoc, false, grid);
		g = new GUI();
	}

}
