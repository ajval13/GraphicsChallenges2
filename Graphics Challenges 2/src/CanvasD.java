import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;


public class CanvasD extends Canvas
	{
	private static final long	serialVersionUID	= 1L;
		
		public static void main(String[] args)
			{
				CanvasD canvas = new CanvasD();
				JFrame frame = new JFrame();
				frame.setSize(100, 100);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.white);
				frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
				frame.setResizable(false);
				frame.setVisible(true);	
			}
		public void paint(Graphics graphics)
			{
			graphics.setColor(Color.black);
			graphics.fillRect(0, 0, 20, 20);	
			}
	}
