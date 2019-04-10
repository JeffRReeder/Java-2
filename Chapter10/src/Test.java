
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Marty Stepp");
		names.add("Stuart Reges");
		names.add("john Smith");
		names.add(2,"Darth Vader");
		names.add("Alan Turning");
		names.add("Ada lovelace");

		for (int i = 0; i < names.size(); i++) {
		    if (names.get(i).startsWith("A")) {
		    	System.out.println("Name starts with A!");
		    }
		}

		if (names.contains("Stuart Reges")) {
			System.out.println("Hi Reges");
		}
		
		System.out.println(names.toString());
		System.out.println(names);
		
		ArrayList<String> allWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("words.txt"));
		while (input.hasNext()) {
		    String word = input.next();
		    allWords.add(word);
		}
		System.out.println(allWords);
		
		// remove all plural words
		for (int i = 0; i < allWords.size(); i++) {
		    String word = allWords.get(i);
		    if (word.endsWith("s")) {
		        allWords.remove(i);
		        i--;
		    }
		}
		System.out.println();
		System.out.println(allWords);

	}

}
