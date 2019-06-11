
public class ListNode {
	
	public int data;		//data stored in the node
	public ListNode next;	//link to the next node in the list
	
	//constructs a node with a data and a null link
	public ListNode() {
		this(0,null);	
	}

	//constructs a node with a given data and null link
	public ListNode(int data) {
		this(data, null);
	}
	
	//constructs a node with a given data and given link	
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
	
}
