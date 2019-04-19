import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Plays a lottery game with the user, reading
// the user's lottery numbers and printing how many
// matched a winning lottery ticket.



public class Lottery {
	
	public static final int NUMBERS = 6;
	public static final int MAX_NUMBER = 40;
	
	public static void main (String [] args) {
		//get winning number sand ticket numbers
		Set<Integer> winningNumbers = createWinningNumbers();
		Set<Integer> ticket = getTicket();
		System.out.println();
		
		//keep only winning numbers
		Set<Integer> intersection = new TreeSet<Integer>(ticket);
		intersection.retainAll(winningNumbers);
		
		//print results
		System.out.println("Your ticket number: " + ticket);
		System.out.println("Winning numbers: " + winningNumbers);
		System.out.println("You had " + intersection.size() + " numbers. ");
		System.out.println("The matched numbers are: " + intersection);
		
		//calculate prize
		double prize = 0;
		if (intersection.size() > 0) {
			prize = 100 * Math.pow(2, intersection.size());
		}
		System.out.println("Your prize is $ " + prize);
	}

	public static Set<Integer> createWinningNumbers() {
		Set<Integer> winningNumbers= new TreeSet<Integer>();
		Random r = new Random();
		
		while (winningNumbers.size() < NUMBERS) {
			int number = r.nextInt(MAX_NUMBER) + 1;
			winningNumbers.add(number);
		}
		
		return winningNumbers;
	}
	
	public static Set<Integer> getTicket() {
		Set<Integer> ticket = new TreeSet<Integer>();
		Scanner console = new Scanner(System.in);
		System.out.println("Type your " + NUMBERS + " unique lotto numbers");
		while (ticket.size() < NUMBERS) {
			int number = console.nextInt();
			ticket.add(number);
			
		}
		console.close();
		return ticket;
	}

	
}
























