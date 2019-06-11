//simple binary tree that constructs a tree of ints, prints it, 
// prints the data using pre, in, post order traversal
// the nodes are numbered starting with 1 and sequentially level by level
// no gaps in the tree




public class IntTree {

	private IntTreeNode overallRoot;
	
	// pre: max nodes > 0
	//construct a sequential tree with a given number of nodes
	public IntTree(int max) {
		if(max <=0) {
			throw new IllegalArgumentException("Max: " + max);
		} 
		overallRoot = buildTree(1, max);
	}

	//return a sequential tree with n as its root unless n > max, in 
	//which case it will be an empty tree
	private IntTreeNode buildTree(int n, int max) {
		
		if(n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2*n + 1, max));
		}	
	}
	
	//prints the tree contents in pre-order traversal (root, left, right)
	public void printPreorder() {
		System.out.print("Pre-order");
		printPreorder(overallRoot);
		System.out.println();
	}

	//prints the tree using pre-order traversal with the given root (root, left, right)
	private void printPreorder(IntTreeNode root) {
		if(root != null) { // empty
			System.out.print(" " + root.data);
			printPreorder(root.left);
			printPreorder(root.right);
		}
		
	}
	
	//prints the tree using in-order traversal with the given root (left, root, right)
	public void printInorder() {
		System.out.print("in-order");
		printInorder(overallRoot);
		System.out.println();
	}
	
	//print in-order the tree with a given root
	private void printInorder(IntTreeNode root) {
		if(root != null) { // empty
			
			printInorder(root.left);
			System.out.print(" " + root.data);
			printInorder(root.right);
		}	
	
	}
	
	//prints the tree using Post-order traversal with the given root (left, right, root)
	public void printPostorder() {
			System.out.print("Post-order");
			printPostorder(overallRoot);
			System.out.println();
		}
		
	//print Post-order the tree with a given root
	private void printPostorder(IntTreeNode root) {
			if(root != null) { // empty
				
				printPostorder(root.left);
				printPostorder(root.right);
				System.out.print(" " + root.data);
			}	
		
		}
	
	//print in reversed order the tree indenting each line to a given level
	//to show the node depth. prints right to left
	public void printSideways() {
		printSideways(overallRoot, 0);
	}

	//print in reverse pre-order with the given root and indent each line to a level
	private void printSideways(IntTreeNode root, int level) {
		if(root != null) { //empty
			printSideways(root.right, level + 1);
			for(int i = 0; i < level; i++) {
				System.out.print("    ");
			}
			System.out.println(root.data);
			printSideways(root.left, level + 1);
		}
		
	}
	
	
	
	
	
	
}// end of class
