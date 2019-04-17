import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {

	public static void main (String [] args) throws FileNotFoundException {
		Set<String> stooges = new HashSet<String>();
		
		stooges.add("Larry");
		stooges.add("Moe");
		stooges.add("Curly");
		stooges.add("Moe");		//duplicate
		stooges.add("Shemp");
		stooges.add("Moe");		//duplicate
		
		//hashset has NO guaruntee for order, a tree set will.
		System.out.println(stooges.toString());
		
		
		
		//find unique words in a book
		//create a new instance of a set containing strings.
		Set<String> words = new HashSet<String>();
		//read the file
		Scanner in = new Scanner (new File("mobydick.txt"));
		//while you haven't got to end of file
		while(in.hasNext()) {
			//read a word from the file and store it in a string. each time "word" is over written.
			String word = in.next();
			//prevent duplicate or "unique" words 
			word = word.toLowerCase();
			//add the words from the file to the set we created
			//set will only retain unique words
			words.add(word);
		}
		System.out.println("Number of unique words: " + words.size());
		
		
		
		
		//iterate over a set - use Iterator
		Iterator<String> itr = stooges.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			name = name.toLowerCase();
			System.out.println("Iterating over a set..." + name);
		}
		
	}
}
