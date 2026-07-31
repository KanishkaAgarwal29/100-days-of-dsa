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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy Node
        ListNode node=new ListNode(-1);
        ListNode curr=node;

        int sum=0;
        int car=0;

        while(l1!=null || l2!=null){
            sum=0;

            if(l1!=null){
                sum=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=car;
            ListNode n=new ListNode(sum%10);
            curr.next=n;
            curr=curr.next;
            car=sum/10;
        }

            if(car>0){
                ListNode n=new ListNode(car);
                curr.next=n;
                curr=curr.next;
            }
            
            
        return node.next;
    }
}
