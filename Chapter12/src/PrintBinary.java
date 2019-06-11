
public class PrintBinary {

	public static void main(String[] args) {
		
		Binary(5000);

	}
	
	public static void Binary(int n) {
		//base case
		if(n<2) {
			System.out.print(n);
		} else {
			//recursive case. break the number apart
			Binary(n / 2);
			Binary(n % 2);
		}
	}

}
