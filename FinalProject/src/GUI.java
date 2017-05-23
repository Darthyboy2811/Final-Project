import java.awt.*;
import java.awt.event.*;    // access to WindowAdapter, WindowEvent 

import javax.swing.*;

public class GUI extends JFrame implements ActionListener
{
	//Instance variables
	private Image runner;
	private int counter;
	private int runnerX, runnerY;
	
	//Constructor
	public GUI()
	{
		super("Game name here");
		
		ClassLoader clder = this.getClass().getClassLoader();
		ImageIcon runnerIcon = new ImageIcon(clder.getResource("e5e33b7e37fd8a61bac7b658b5e9428d_funny-running-man-gifs-running-man-gif-clipart_300-300.gif"));
	runner = runnerIcon.getImage();
		
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
	}
	
	public static void main(String[] args)
	{
		GUI application = new GUI();
	}
}
