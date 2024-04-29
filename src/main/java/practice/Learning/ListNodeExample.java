package practice.Learning;

//A single node in a linked list is called the List Node.
//A Single LinkedList is called linked list.
//In list node we need to explicitly map one node to another

//It has pre-defined class to implement the ListNode :: LinkedNode 
class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class ListNodeExample {
	public static void main(String[] args) {
		// Creating a linked list: 10 -> 20 -> 30
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20);
		ListNode node3 = new ListNode(30);
		node1.next = node2;
		node2.next = node3;
		
		// Traversing the linked list and printing the values
		System.out.println("Linked List:");
		while (node1 != null) {
			System.out.println(node1.val);
			node1 = node1.next;
		}
	}
}