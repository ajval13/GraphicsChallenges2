import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;


public class CanvasB extends Canvas
	{
	private static final long	serialVersionUID	= 1L;

		public static void main(String[] args)
			{
			CanvasB canvas = new CanvasB();
		    JFrame frame = new JFrame();
		    frame.setSize(1000, 1000);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.getContentPane().add(canvas).setBackground(Color.white);
		    frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		    frame.setResizable(false);
		    frame.setVisible(true);
			}
		public void paint(Graphics graphics)
		{
			
		}
	}

