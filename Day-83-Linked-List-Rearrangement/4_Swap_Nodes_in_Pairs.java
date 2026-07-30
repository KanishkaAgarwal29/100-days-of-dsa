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
    public ListNode swapPairs(ListNode head) {
        if( head==null || head.next==null )return head;
        ListNode first = head;
        ListNode second = head.next;
        
        ListNode dn = new ListNode(-1);
        ListNode prev = dn;

        while(first!=null && second!=null){

            prev.next = second;
            first.next = second.next;
            second.next = first;
            prev = first;
            first = first.next;
            
            if(first==null) break;
            second = first.next;
            
        }

        if(first!=null){
            prev.next = first;
            prev=first;
            prev.next=null;
        }
        return dn.next;
    }
}
