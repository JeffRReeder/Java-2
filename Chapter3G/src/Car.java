import java.awt.Color;
import java.awt.Graphics; // so I can use Graphics


public class Car {

	public static void main(String[] args) {
		 	DrawingPanel panel = new DrawingPanel(500, 500);
	        Graphics g = panel.getGraphics();
	        
	        //background color
	        panel.setBackground(Color.GRAY);
	        
	        
	        // inner red fill
	        g.setColor(Color.BLACK);
	        g.fillRect(10, 30, 100, 50);

	        g.setColor(Color.RED);
	        g.fillOval(20, 70, 20, 20);
	        g.fillOval(80, 70, 20, 20);
	        
	        g.setColor(Color.CYAN);
	        g.fillRect(80, 40, 30, 20);

	        
	        

	}
}
