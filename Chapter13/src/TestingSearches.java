import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestingSearches {

	public static void main(String[] args) {
		
		//test list
		List<String> list = new ArrayList<String>();
		list.add("c");
		list.add("b");
		list.add("h");
		list.add("d");
		list.add("f");
		list.add("e");
		list.add("a");
		
		//sequential search for a word using indexOf
		int index = list.indexOf("h");
		if (index >=0) {
			System.out.println("h is a word with index " + index); 
		} else {
			System.out.println("h not found.");
		}

		//binary search for an array
		int[] numbers = {-3, 2, 8, 12, 17, 29, 44, 58, 79};
		int index1 = Arrays.binarySearch(numbers, 29);
		System.out.println("29 was found at index " + index1);

		//Collections binary search
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		int index2 = Collections.binarySearch(intList, 5);
		System.out.println("5 was found at index " + index2);
		
		//Arrays sort
		String [] strings = {"c","b","g","h","d","f","e","a"};
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
		
		//Collections.sort
		Collections.sort(list);
		System.out.println(list);
		
		//Collections.shuffle 
		String[] ranks = {"2","3","4", "5","6","7","8","9","10", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
		
		List<String> deck = new ArrayList<String>();
		for (String rank: ranks) {
			for (String suit: suits) {
			deck.add(rank + " of " + suit);
		}
		}
		Collections.shuffle(deck);
		System.out.println("Top Card = " + deck.get(0));	
		
		

		
	}

}
