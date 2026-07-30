/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node reverse(Node head){
        Node temp=head;
        Node prev=null;

        while(temp!=null){
            Node forw=temp.next;
            temp.next=prev;
            prev=temp;
            temp=forw;
        }
        return prev;
    }


    public void reorderList(Node head) {
        // code here
        if(head.next==null)return;

        Node slow=head;
        Node fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node orgHead = head;
        Node newHead=reverse(slow.next);
        slow.next=null;

        while(newHead!=null){
            Node first = head.next;
            Node sec = newHead.next;
            head.next=newHead;
            newHead.next=first;
            head=first;
            newHead=sec;   
        }

        head=orgHead;
    }
}
