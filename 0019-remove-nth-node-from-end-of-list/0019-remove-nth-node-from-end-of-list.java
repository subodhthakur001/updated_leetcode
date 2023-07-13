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
        ListNode p = start;
        ListNode q = start;
        int k = 0;;
        while(k < n){
            p = p.next;
            k++;
        }
        while(p.next != null){
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return start.next;
        
    }
    
}