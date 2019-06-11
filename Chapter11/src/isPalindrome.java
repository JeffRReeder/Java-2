
public class isPalindrome {

	public static void main(String[] args) {
		//isPalindrome
		//return true if the given string reads the same forwards/backwards
		//always true for 1 letter strings
		System.out.println(isPalindrome("radar"));
		System.out.println();
		System.out.println(isPalindrome("snow"));
		
		
	}
	
	public static boolean isPalindrome(String s) {
		if(s.length() < 2) {
			return true; //base case
		} else {
			char first = s.charAt(0); //gives first char in string
			System.out.println("first " + first);
			char last = s.charAt(s.length() -1);
			System.out.println("last " + last);
			
			if (first != last) {
				return false;
			}
			String middle = s.substring(1, s.length() - 1);
			System.out.println("middle " + middle);
			return isPalindrome(middle);
		}
	}

}
