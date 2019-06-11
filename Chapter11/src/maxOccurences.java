import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class maxOccurences {

	public static void main(String[] args) {
		System.out.println("This program returns max number of occurences of a list of integers");
		System.out.println("Sample list is: 2,6,-4,15,2,2,6,37");

		//create a list to test
		List<Integer> testIntegers = new ArrayList<Integer>();
		testIntegers.add(2);
		testIntegers.add(6);
		testIntegers.add(-4);
		testIntegers.add(15);
		testIntegers.add(2);
		testIntegers.add(2);
		testIntegers.add(6);
		testIntegers.add(37);
		
		
		System.out.println(maxO(testIntegers));
		
			
		
		
	}

	public static int maxO(List<Integer> list) {
		
		if(list.size() == 0) {
			return 0;
		}
		Map<Integer, Integer> JeffMap = new TreeMap<Integer, Integer>();
		
		for(int listValue : list) {
			if(!JeffMap.containsKey(listValue)) {
				JeffMap.put(listValue, 1);
			} else {
				JeffMap.put(listValue, JeffMap.get(listValue) + 1);
			}
		}
		
	
		
		int count = 0;
		for(int totalnumberofoccurences : JeffMap.values()) {
			if(totalnumberofoccurences > count) {
				count = totalnumberofoccurences;
			} 
		}
		return count;
		
		
	}
}
