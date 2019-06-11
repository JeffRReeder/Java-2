
public class Recurrsion {

	public static void main(String[] args) {
		
		printStars(6);
		System.out.println();
		System.out.println("Power function using recursion: " + pow(2,4));
	}

	public static void printStars(int n) {
		//base case
		if(n==1) {
			System.out.println("*");
		} else { //recursive case
			System.out.println(n);
			printStars(n-1);
		}
	}
	
	
	public static int pow(int base, int exponent) {
		//base case
		if(exponent == 0) {
			return 1; //any number to zero power = 1
		} else {
			//recursive caes x^y = x *x(y-1)
			return base * pow(base, exponent - 1);
		}
		
		
	}
}
