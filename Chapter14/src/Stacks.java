import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stacks {

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
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		int[] s1Data = {2,4,6,8,42};
		int[] s2Data = {2,4,6,8,10};
		
		
		for(Integer num : s1Data) {
			s1.push(num);
		}
		
		for(Integer num : s2Data) {
			s2.push(num);
		}
		
		System.out.println("Same pattern: " + sameParityPattern(s1, s2));
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
	
	// compare stacks for similarity of parity (even vs. odd)
	public static boolean sameParityPattern(Stack<Integer> s1, Stack<Integer> s2) {
		Stack<Integer> s3 = new Stack<Integer>();
		boolean same = true;
		if (s1.size() != s2.size()) {
		} else {

			while (same && !s1.isEmpty()) {
				int num1 = s1.pop();
				int num2 = s2.pop();
				if (num1 % 2 != num2 % 2) {
					same = false;
				}
				s3.push(num1);
				s3.push(num2);

			}

			while (!s3.isEmpty()) {
				s2.push(s3.pop());
				s1.push(s3.pop());
			}

		}

		return same;
	}

}