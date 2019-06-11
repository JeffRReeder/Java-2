
//the client "uses" the class. Needs to know the signatures of the methods supporting it.
public class SimpleArrayIntListClient {

	public static void main(String[] args) {
		
		SimpleArrayIntList sail = new SimpleArrayIntList();
		
		sail.add(1);
		sail.add(2);
		sail.add(3);
		sail.add(4);
		
		System.out.println(sail);
		
		//alternate version to print
		//System.out.println(sail.toString());

	}

}
