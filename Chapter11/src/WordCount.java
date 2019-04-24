import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//use "Maps" to implement a word count to see which words occur most frequently

public class WordCount {
	//minimum number of occurrences needed to be printed
	public static final int OCCURRENCES = 2000;
	
	public static void main (String[] args) throws FileNotFoundException {
		
		System.out.println("This program displays the most");
        System.out.println("frequently occurring words from");
        System.out.println("the book Moby Dick.");
        System.out.println();
        
        //read the book into a map
        Scanner console = new Scanner(new File("mobydick.txt"));
		Map<String, Integer> wordCountMap = getCountMap(console);
		
		for(String word : wordCountMap.keySet()) {
			int count = wordCountMap.get(word); //reading final count
			if(count > OCCURRENCES) {
				System.out.println("The word: " + word + " occurs " + count + " times.");
			}
		}
		
	}

	private static Map<String, Integer> getCountMap(Scanner console) {
		Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();
		
		while (console.hasNext()) { //iterate over entire book

			String word = console.next().toLowerCase();

			if (!wordCountMap.containsKey(word)) { // never seen this word before
				// add it to the map
				wordCountMap.put(word, 1); // "count" is 1 for first time
			} else { // we have seen this word before, therefore change the count
				int count = wordCountMap.get(word); // get value based on the key
				wordCountMap.put(word, count + 1);
			}

		}//end of while loop
		
		return wordCountMap;
	}
}
