
public class ListClient1 {

	public static void main(String[] args) {
		
		LinkedIntList list = new LinkedIntList();
		
		list.add(18);
		list.add(27);
		list.add(42);
		list.add(109);
		list.add(-5);
		list.add(3);
		
		
		
		System.out.println(list.toString());
		System.out.println("Size is currently: " + list.size());
		System.out.println("Get is currently: " + list.get(2));
		list.add(5, 77);
		System.out.println(list);
		
		
		System.out.println();
		list.remove(1);
		System.out.println(list.toString());
		System.out.println("Size is currently: " + list.size());
		System.out.println("Get is currently: " + list.get(2));
		
		
	}

}
