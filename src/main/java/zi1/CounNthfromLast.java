package zi1;

//Concept: Two pointers -> 1->head and 2-> nth position from head and increment by 1 
//till the second pointer reaches the null. Example n=5  

public class CounNthfromLast {
	static class Node {
		int val;
		Node next;

		Node(int x) {
			val = x;
			next = null;
		}

	}

	public int getNthFromLast(Node head, int n) {
		Node slow=head;
		Node fast = head;
		
		while (fast != null) {
			if (n == 0) {
				break;
			}
			//incerementing till n reaches 0
			fast = fast.next;
			n--;

		}
		//if suppose n=5 but the list is only 4 it comes out of loop based on n value:Check
		if (n > 0) {
			return -1;
		}
		
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow.val;
	}
}
