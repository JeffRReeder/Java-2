
public class swap {

	public static void main(String[] args) {
		int a = 7;
		int b = 35;
		
		int[] result = swap(a,b);
		
		System.out.println("a=" + result[0] + " " + "b=" + result[1]);

		
		
	}
	
	public static int[] swap(int a, int b) {
		int temp = a; 
		a = b;
		b = temp;
		
		
		System.out.println("Inside swap function " + a + " " + b);
		int[] result = new int[2];
		result[0] = a;
		result[1] = b;
		return result;
	}
	
}
