
public class Controller 
{
	private int myTimer;
	private Player myPlayer;
	private GUI myGUI;
	private ArrayList<Location> myLocs;
	
	public Controller(Player p, GUI g, ArrayList<Location> locs)
	{
		myPlayer = p;
		myGUI = g;
		myLocs = locs;
		myTimer = 0;
		
	}

	public int updateTimer()
	{
		myTimer++;
		return myTimer;
	}
	
	
}
