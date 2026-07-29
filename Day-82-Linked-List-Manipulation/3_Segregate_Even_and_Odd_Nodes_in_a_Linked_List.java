/* Structure of a Linked List Node
class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	Node divide(Node head) {
		// code here
		Node even = new Node(-1);
		Node odd = new Node(-1);
		Node e = even;
		Node o = odd;
		
		while (head != null) {
			if (head.data%2 == 0) {
				e.next = head;
				e = head;
			}
			else {
				o.next = head;
				o = head;
			}
			
			head = head.next;
		}
		
		o.next = null;
		e.next = odd.next;
		return even.next;
	}
}
