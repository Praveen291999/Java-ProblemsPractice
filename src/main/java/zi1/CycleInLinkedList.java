package zi1;

/*Slow Pointer(incremented by 1) and fast pointer(Incremented by 2): 
	if both the pointers meet ->Looped linked list*/

class CycleLinkedList {
	static class Node {
		int val;
		Node next;

		Node(int x) {
			val = x;
			next = null;
		}

	}
    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}