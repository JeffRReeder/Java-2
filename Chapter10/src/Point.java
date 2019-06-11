
public class Point implements Comparable<Point> {
    private int x;
    private int y;
   
    public Point(int x, int y) {
    	this.x = x;
    	this.y = y;
    }

    // sort by x and break ties by y
    public int compareTo(Point other) {
        if (x < other.x) {
            return -1;
        } else if (x > other.x) {
            return 1;
        } else if (y < other.y) {
            return -1;   // same x, smaller y
        } else if (y > other.y) {
            return 1;    // same x, larger y
        } else {
            return 0;    // same x and same y
        }
    }
}


