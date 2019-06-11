
public class IntTreeClient {

	public static void main(String[] args) {
	
		//construct the new tree
		IntTree t = new IntTree(64);
		System.out.println("Tree structure: ");
		t.printPreorder();
		
		System.out.println();
		t.printInorder();
		
		System.out.println();
		t.printPostorder();
		
		System.out.println();
		t.printSideways();
		
	}

}
