import java.awt.*;
import java.awt.event.*;    // access to WindowAdapter, WindowEvent 

import javax.swing.*;

public class GuiForGame extends JFrame implements ActionListener
{
	//Instance variables
	private Image runner;
	private Image counter;
	private int runnerX, runnerY;
	
	//Constructor
	public GuiForGame()
	{
		super("Game name here");
		
		ClassLoader clder = this.getClass().getClassLoader();
		ImageIcon runnerIcon = new ImageIcon(clder.getResource("runner.gif"));
		//runner = runnerIcon.getImage();
		
		//Allows for exit from game
		addWindowListener(new java.awt.event.WindowAdapter()
		{
			public void windowClosing(WindowEvent evt)
			{
				System.exit(0);
			}
		});
		
		runnerX = 300;
		runnerY = 40;
		
		setSize( 500, 500);
		setVisible(true);
		
		Timer timer = new javax.swing.Timer(200, this);
		timer.start();
	}
	
	public void paint (Graphics g)
	{
		super.paint(g);
		g.drawImage(runner, runnerX, runnerY, this);
	}
	
	
	public void actionPerformed( ActionEvent evt)
	{
		if (runnerX < 500)
		{
			runnerX += 50;
		}
		else
		{
			runnerX = 300;
		repaint();
		counter++;
		
		System.out.println("time is" + counter);
	}
	
	public static void main(String[] args)
	{
		GuiForGame application = new GuiForGame();
	}
}
