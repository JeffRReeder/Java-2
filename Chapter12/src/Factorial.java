
public class Factorial {

	public static void main(String[] args) {
		System.out.println("This program calculates Factorial of a given number.");
		System.out.println("Using Recursion.");
		
		int i;
		int fact = 1;
		int number = 6;
		for(i=1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Fact with a loop: " + fact);
		System.out.println("Face with recursion: " + fact(6));
	}
	
	//recursive factorial
	public static int fact(int n) {
		if(n == 1) {
		return 1;
		} else {
			//method recursively calls itself
			return (n * fact(n-1));
		}
	}
	
}
