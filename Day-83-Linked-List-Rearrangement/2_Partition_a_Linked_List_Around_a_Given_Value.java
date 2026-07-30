/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public Node partition(Node head, int x) {
        // code here
        Node first = new Node(-1);
        Node sec = new Node(-1);
        Node third = new Node(-1);
        Node f = first;
        Node s = sec;
        Node t = third;
        
        Node temp = head;
        
        while(temp != null){
            int val = temp.data;
            if(val < x){
                f.next = temp;
                f = f.next;
            }
            else if(val == x){
                s.next = temp;
                s = s.next;
            }
            else{
                t.next = temp;
                t = t.next;
            }
            
            temp = temp.next;
        }
        
        t.next = null;
        s.next = third.next;
        f.next = sec.next;
        
        return first.next;
    }
};
