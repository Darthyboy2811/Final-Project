import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;


public class Controller
{

	private Player myPlayer;
	private GUI myGUI;
	private ArrayList<Location> myLocs;
	
	public Controller(Player p, GUI g, ArrayList<Location> locs)
	{
		myPlayer = p;
		myGUI = g;
		myLocs = locs;
		g.addKeyListener(new KeyHandler());
	}
	
	

	
	
	
	
}
