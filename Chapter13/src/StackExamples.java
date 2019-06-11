import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackExamples {

	public static void main(String[] args) {
		
		String[] data = {"to", "be", "or", "not", "to", "bes"};
		
		Stack<String> s = new Stack<String>();
		
		for(String str : data) {
			s.push(str); //push onto the stack (while there is still data)
		}
		System.out.println("stack = " + s);
		System.out.println("size = " + s.size());
		System.out.println("peek = " + s.peek());
		
		while(!s.isEmpty()) {
			System.out.println(s.pop() + " "); //stack is now empty after this
		}
		System.out.println();
		
		System.out.println("stack = " + s); //proof that stack is now empty
		
		s.push ("hello");
		System.out.println("new stack " + s);
		System.out.println("Now testing a queue of strings");
		System.out.println();
		
		
		String[] data1 = {"to", "be", "or", "not", "to", "beJ"};//queue conveyor belt is moving LEFT
		
		Queue<String> q = new LinkedList<String>();
		
		for(String str : data1) {
			q.add(str);
		}
		System.out.println("queue " + q);;
		System.out.println("size = " + q.size());
		System.out.println("peek = " + q.peek());
		
		while(!q.isEmpty()) {
			System.out.println(q.remove() + " "); // "to" or 1st thing will "drop off" first.
		}
		System.out.println("queue is now empty");
		System.out.println("queue " + q);;
	}

}
