import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) {

		ArrayList<String> JeffsArray = new ArrayList<String>();
		JeffsArray.add("duck");
		JeffsArray.add("ducks");
		JeffsArray.add("frog");
		JeffsArray.add("frogs");
		JeffsArray.add("bird");
		JeffsArray.add("birds");
		JeffsArray.add("cat");
		JeffsArray.add("trout");
		
		
		System.out.println("Original list is: " + JeffsArray);
		System.out.println();
		
		removeEvenLength(JeffsArray);
		System.out.println("New list is with evens removed: " + JeffsArray);

	}
	
	public static void removeEvenLength(ArrayList<String> myList) {
		//walk through list while there is still something in it
		//if words in list are even (mod = 0) remove it
		//else keep walking through list
		int i = 0;
		while (i < myList.size()) {
			String element = myList.get(i);
			if(element.length() % 2 == 0) {
				myList.remove(i);
			} else {
				i++;
			}
		}
		
		

	}

}

