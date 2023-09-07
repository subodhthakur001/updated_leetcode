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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode s = start;
        ListNode f = start;
        int k = 0;
        while(k < n){
            s = s.next;
            k++;
        }
        while(s.next != null){
            s = s.next;
            f = f.next;
        }
        f.next = f.next.next;
        return start.next;
    }
}