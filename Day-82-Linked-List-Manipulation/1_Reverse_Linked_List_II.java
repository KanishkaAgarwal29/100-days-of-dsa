/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head, ListNode end){
        ListNode prev = null;
        ListNode temp = head;
        while(temp != end){
            ListNode forw = temp.next;
            temp.next = prev;
            prev = temp;
            temp = forw;
        }

        return prev;
    }
    public ListNode reverseBetween(ListNode head, int l, int r) {
        ListNode temp = head;
        ListNode left = null;
        ListNode right = null;
        int count = 0;
        while (temp!=null){
            count++;
            if(count == l-1){
                left = temp;
            }
            if(count == r+1){
                right = temp;
            }
            temp = temp.next;
        }
        ListNode newHead = null;
        ListNode Tail = null;
        if(left!=null){
            Tail = left.next;
            newHead = reverse(Tail, right);
            left.next = newHead;
        }
        else{
            Tail = head;
            newHead = reverse(head, right);
            head = newHead;
        }
        Tail.next = right;
        return head;
    }
}
