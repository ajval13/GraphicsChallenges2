import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;


public class CanvasB extends Canvas
	{
	private static final long	serialVersionUID	= 1L;
		static int sizeHeight;
		static String color;
		static int sizeWidth;
		public static void main(String[] args)
			{
			makeSquare();
			CanvasB canvas = new CanvasB();
		    JFrame frame = new JFrame();
		    frame.setSize(500, 500);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.getContentPane().add(canvas).setBackground(Color.white);
		    frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		    frame.setResizable(false);
		    frame.setVisible(true);		    
			}
		
		public static void makeSquare()
		   {
			Scanner userInput = new Scanner (System.in);
			System.out.println("How tall you want the square. Must Be less than 500.");
			sizeHeight = userInput.nextInt();
			Scanner userInput3 = new Scanner (System.in);
			System.out.println("How wide you want the square. Must Be less than 500.");
			sizeWidth = userInput3.nextInt();
			Scanner userInput2 = new Scanner (System.in);
			System.out.println("Want it to be red or blue?");
			color = userInput2.nextLine();
		   }
		public void paint(Graphics graphics)
		    {
		    if (color.equals("red"))
		    	{
		    	graphics.setColor(Color.red);
		    	graphics.fillRect(0, 0,sizeWidth,sizeHeight);
		    	}
		    else if (color.equals("blue"))
		    	{
		    	graphics.setColor(Color.blue);
		    	graphics.fillRect(0, 0,sizeWidth,sizeHeight);
		    	}
		    }
	}