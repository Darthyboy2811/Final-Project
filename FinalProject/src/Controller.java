import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


public class Controller implements KeyListener
{

	private Player myPlayer;
	private GUI myGUI;
	private ArrayList<Location> myLocs;
	
	public Controller(Player p, GUI g, ArrayList<Location> locs)
	{
		myPlayer = p;
		myGUI = g;
		myLocs = locs;
		g.addKeyListener(this);
	}
	
	

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_UP);
		myPlayer.jump();
		
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void updateScreen()
	{
		//Figure out once GUI has been at least partially completed.
	}
	
	
	
}
