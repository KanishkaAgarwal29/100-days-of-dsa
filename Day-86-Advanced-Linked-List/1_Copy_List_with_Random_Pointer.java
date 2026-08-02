/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        while(temp != null){
            Node forw = temp.next;
            Node node = new Node(temp.val);
            temp.next = node;
            node.next = forw;
            temp = forw;
        } 

        temp = head;
        while(temp != null){
            Node node = temp.next;
            Node ran = temp.random;
            if(ran!= null){
                node.random = ran.next;
            }
            temp = node.next;
        }

        Node newHead = new Node(-1);
        Node prev = newHead;
        temp = head;

        while(temp != null){
            prev.next = temp.next;
            temp.next = temp.next.next;
            prev = prev.next;
            temp = temp.next;
        }

        return newHead.next;
    }
}
