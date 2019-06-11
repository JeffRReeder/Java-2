import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class PolygonTest {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(250, 200);
		Graphics g = panel.getGraphics();
		        
		g.setColor(Color.BLUE);
		for (int i = 1; i <= 10; i++) {
		    g.fillOval(15 * i, 15 * i, 30, 30);
		    panel.sleep(100);
		}

		
		
		

	}
}
