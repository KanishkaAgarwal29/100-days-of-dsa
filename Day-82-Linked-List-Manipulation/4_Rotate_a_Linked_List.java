/*
class Node {
	int data;
	Node next;
	
	Node(int d) {
		data = d;
		next = null;
	}
}
*/

class Solution {
	
	public Node rotate(Node head, int k) {
		// code here
		int count = 0;
		Node temp = head;
		Node last = null;
		
		while (temp != null) {
			count++;
			if (temp.next == null) {
				last = temp;
			}
			temp = temp.next;
		}
		
		k = k % count;
		
		if (k == 0)return head;
		temp = head;
		
		for (int i = 0; i < k - 1; i++) {
			temp = temp.next;
		}
		last.next = head;
		head = temp.next;
		temp.next = null;
		
		return head;
	}
}
