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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int i = 0;
        ListNode check = curr;
        while(check.next != null && i < k - 1){
            i++;
            check = check.next;
        }
        
        if(i<k-1) return head;
        i = 0;
        while(curr != null && i < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        if(next != null){
            head.next = reverseKGroup(next, k);
        }
        return prev;
    }
}