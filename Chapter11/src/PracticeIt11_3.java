import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

public class PracticeIt11_3 {

	public static void main(String[] args) {
		//Practice it exercise 11.3 Remove in range
		//list (0,0,2,0,4,0,6,0,8,0,10,0,12,0,14,0,16) removeInRange(list,0,5,13)
		//takes out zeros list(0,0,2,0,4,6,8,10,12,0,14,0,16)
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);
		list.add(0);
		list.add(2);
		list.add(0);
		list.add(4);
		list.add(0);
		list.add(6);
		list.add(0);
		list.add(8);
		list.add(0);
		list.add(10);
		list.add(0);
		list.add(12);
		list.add(0);
		list.add(14);
		list.add(0);
		list.add(16);
		
		System.out.println(list);
		removeInRange(list,0,5,13);
		System.out.println(list);
	}
	
	

	public static void removeInRange(LinkedList<Integer> list, int value, int min, int max) {
		//look through list for "value" between "min" index and "max" index
	    //and remove "value" from original list and make new list without "value" in it
	   Iterator<Integer> itr = list.iterator();
	    for (int i = 0; i < min; i++){
	        itr.next();
	    }
	    for (int i = min; i < max; i++){
	        if (itr.next() == value) {
	            itr.remove();
	        }
	    }
	}

}
