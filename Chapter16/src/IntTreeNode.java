
public class IntTreeNode {

	public int data;
	public IntTreeNode left;
	public IntTreeNode right;
	
	//construct a leaf node with given data
	public IntTreeNode(int data) {
		this(data, null, null);
	}

	//construct a branch node with data, left and right subtree
	public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	
	
}
