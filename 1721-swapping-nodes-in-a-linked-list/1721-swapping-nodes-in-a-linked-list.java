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
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        ListNode s = head;
        ListNode f = head;
        int i = 1;
        while(i < k){
            s = s.next;
            i++;
        }
        int j = 0;
        while(j < size - k){
            f = f.next;
            j++;
        }
        int c = s.val;
        s.val = f.val;
        f.val = c;
        return head;
    }
}