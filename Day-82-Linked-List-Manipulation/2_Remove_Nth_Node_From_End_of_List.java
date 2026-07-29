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
    public int position(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        count = count - n + 1;
        return count;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int pos = position(head, n);
        if (pos == 1) {
            return head.next;
        }

        ListNode temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            if (pos - 1 == c) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}
