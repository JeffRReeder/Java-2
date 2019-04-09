import java.awt.*; // so I can use Graphics

public class MickeyEars {

	public static void main(String[] args) {
		 	DrawingPanel panel = new DrawingPanel(1000, 1000);
	        Graphics g = panel.getGraphics();
	        
	        //background color
	        panel.setBackground(Color.yellow);

	    	// "mickey ears" (Left)
	        g.setColor(Color.BLUE);
	        g.fillOval(250, 250, 200, 200);
	        
	        // "mickey ears" (Right)
	        g.setColor(Color.BLUE);
	        g.fillOval(650, 250, 200, 200);
	        
	        // inner red fill
	        g.setColor(Color.RED);
	        g.fillRect(350, 350, 400, 400);

	        // black outline
	        g.setColor(Color.BLACK);
	        g.drawRect(350, 350, 400, 200);
	}
}