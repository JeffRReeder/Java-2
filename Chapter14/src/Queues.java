import java.util.Queue;
import java.util.LinkedList;

public class Queues {

	public static void main(String[] args) {
		
		//work with queue
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(12);
		q.add(-33);
		q.add(8);
		q.add(4);
		q.add(12);
		
		
		int value = 12;
		removeAll(q,value);
		

	}
	
	//remove all occurences of a value from a queue
	public static void removeAll(Queue<Integer> q, int value) {
		int oldSize = q.size();
		for(int i = 0; i < oldSize; i++) {
			int n = q.remove();
			if(n!=value) {
				q.add(n);
			}
			System.out.println(q.toString());
		}
		
	}

}
