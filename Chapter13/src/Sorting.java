import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		String[] words = {"foo", "bar", "baz", "ball"};
		Arrays.parallelSort(words);
		System.out.println("foo, bar, baz, ball: is changed to");
		System.out.println(Arrays.toString(words));
		
		
		List<String> words2 = new ArrayList<String>();
		for(String word : words) {
			words2.add(word);
		}
	
		Collections.sort(words2);
		System.out.println(words2);

	}

}
