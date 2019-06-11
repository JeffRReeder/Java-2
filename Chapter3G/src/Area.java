
public class Area {

	public static void main(String[] args) {
		
		int result = RectArea(5,6);
		
		System.out.println("Area of rectangle is: " + result);

	}

	public static int RectArea(int x, int y) {
		
		int answer = x * y;
		return answer;
	
	}
}