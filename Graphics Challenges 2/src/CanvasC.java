import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;


public class CanvasC extends Canvas
	{
	private static final long	serialVersionUID	= 1L;

		public static void main(String[] args)
		    {
		    CanvasC canvas = new CanvasC();
		    JFrame frame = new JFrame();
		    frame.setSize(1000,1000);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.getContentPane().add(canvas).setBackground(Color.white);
		    frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		    frame.setResizable(false);
		    frame.setVisible(true);		
		    }
		public void paint(Graphics graphics)
			{
			for(int pat=0 ; pat<1000; pat= pat+250)
				{
				graphics.setColor(Color.BLACK);
				graphics.fillRect(pat, 0, 125, 125);
				}
			for(int pat=125 ; pat<1000; pat= pat+250)
				{
				graphics.setColor(Color.BLACK);
				graphics.fillRect(pat, 125, 125, 125);
				}
			for(int pat=0 ; pat<1000; pat= pat+250)
				{
				graphics.setColor(Color.BLACK);
				graphics.fillRect(pat, 0, 375, 125);
				}
			for(int pat=125 ; pat<1000; pat= pat+250)
				{
				graphics.setColor(Color.BLACK);
				graphics.fillRect(pat, 500, 125, 125);
				}
			for(int pat=0 ; pat<1000; pat= pat+250)
				{
				graphics.setColor(Color.BLACK);
				graphics.fillRect(pat, 0, 125, 125);
				}
			for(int pat=125 ; pat<1000; pat= pat+250)
				{
				graphics.setColor(Color.BLACK);
				graphics.fillRect(pat, 125, 125, 125);
				}
			}
	}
	