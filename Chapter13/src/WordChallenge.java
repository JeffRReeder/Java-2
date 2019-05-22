import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordChallenge {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Welcome to the Scrabble word challenge!");
		
		//read the sorted dictionary file into a list
		Scanner in = new Scanner(new File("words.txt"));
		
		List<String> words = new ArrayList<String>();
		while(in.hasNext()) {
			String word = in.next();
			words.add(word);
		}

		//binary search for words in the list
		Scanner console = new Scanner(System.in);
		System.out.println("Word to challenge? (Enter to quit) ? ");
		String target = console.nextLine();
		
		while(target.length() > 0) {
			int index = Collections.binarySearch(words, target);
			if(index >=0) {
				System.out.println("\"" + target + "\" is word # " + index + " of " + words.size());
			} else {
				System.out.println("\"" + target + "\" is not found");
			}
			
			System.out.println("Word to challenge? (Enter to quit) ? ");
			target = console.nextLine();
			
		}//end of while loop
		
		
		
	}

}
