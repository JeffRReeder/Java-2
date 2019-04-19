import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main (String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("seal");
		animals.add("Wolverine");
		animals.add("horse");
		
		System.out.println(longest(animals));
		
		
		System.out.println(animals);
		
		removeEvenLength(animals);
		
		System.out.println(animals);
		
	}//end of main
	
		//improved RemoveEvenLengths uses LinkedList and iterator
		public static void removeEvenLength(LinkedList<String> list) {
			Iterator<String> i = list.iterator();
			while(i.hasNext()) {
				String element = i.next();
				if (element.length() % 2 == 0) {
					//is even
					i.remove();
				}
			}
			
		}
		
		
		//return longest string in a list
		public static String longest(List<String> list) {
			Iterator<String> i =  list.iterator();
			String result = i.next();  //store in a var to avoid advancing
			System.out.println("result (outside loop): " + result);
			while(i.hasNext()) {
				String next = i.next();
				System.out.println("result(inside loop): " + result);
				System.out.println("next (inside loop) " + next);
				if(next.length() > result.length()) {
					result = next;
				}
			}
			return result;
		}
	
		
}//end of TestLinkedList

