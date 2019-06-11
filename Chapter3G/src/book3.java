import java.awt.*;

public class book3 {

	public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(1000, 600);
        panel.setBackground(Color.WHITE);
        Graphics g = panel.getGraphics();
        
        // draw three books at different locations/sizes
        drawBook(g,  20, 35, 100);
        drawBook(g, 150, 70,  60);
        drawBook(g, 300, 10, 200);
    }
	// Draws a book of the given size at the given position.
    public static void drawBook(Graphics g, int x, int y, int size) {
        g.setColor(Color.CYAN);            // cyan background
        g.fillRect(x, y, size, size);
        
        g.setColor(Color.BLACK);           // white "bjp" text
        g.drawString("BJP", x + size/2, y + size/5);

        g.setColor(new Color(191, 118, 73));
        for (int i = 0; i < 10; i++) {     // orange "bricks"
            g.fillRect(x,                  // x
                       y + size/10 * i,    // y
                       size/10 * (i + 1),  // width
                       size/10 - 1);       // height
        }
    }


}
