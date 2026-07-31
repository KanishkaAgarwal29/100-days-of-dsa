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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode curr = list1;
        for (int i = 0;i < a - 1;i++) curr = curr.next;

        ListNode temp = curr.next;
        curr.next = list2;

        while(curr.next != null) curr = curr.next;

        for (int i = a;i < b;i++) temp = temp.next;
        
        ListNode next = temp.next;
        temp.next = null;
        curr.next = next;

        return list1;
    }
}
