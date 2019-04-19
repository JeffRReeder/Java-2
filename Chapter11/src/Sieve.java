import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Sieve {

	public static void main (String[] args) {
		
		System.out.println("This program will tell you all prime");
		System.out.println("numbers up to a given maximum.");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		System.out.println("Max number?");
		int max = console.nextInt();
		
		LinkedList<Integer> primes = sieve(max);
		
		System.out.println(primes);
		
	}
	
	//returns a list of primes up to a max number
	private static LinkedList<Integer> sieve(int max) {
		
		LinkedList<Integer> primes = new LinkedList<Integer>();
		
		LinkedList<Integer> originalnumbers = new LinkedList<Integer>();
		for(int i = 2; i <= max; i++) {
			originalnumbers.add(i);
			//System.out.println("original numbers: " + originalnumbers);
		}
		
		while (!originalnumbers.isEmpty()) {
			//remove prime number from the front
			
			int front = originalnumbers.remove(0);
			System.out.println("front is: "+ front);
			primes.add(front);
			
			//remove all multiples of this prime number
			Iterator<Integer> itr = originalnumbers.iterator();
			while (itr.hasNext()) {
				int current = itr.next();
				
				if(current % front == 0) {//front is not prime
					itr.remove();
				}
			}
			
		}
		
		
		return primes;
	}
	
}
