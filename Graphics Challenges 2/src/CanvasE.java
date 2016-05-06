import java.awt.*;

import javax.swing.*;
 
public class CanvasE extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        CanvasE canvas = new CanvasE();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    	public void paint(Graphics graphics)
    		{
    		for (int i = 0; i < 350; i++)
    	       {
    		    graphics.setColor(Color.blue);
    		    graphics.fillRect(i, 300, 50, 50);
    		        
    		    delay();
    		        
    		    graphics.setColor(Color.white);
    		    graphics.fillRect(i, 300, 50, 50);
    	        }
    		}
    	public void delay()
			{
	        try
					{
					Thread.sleep(10);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
	}