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
       public ListNode reverse(ListNode s){
           ListNode curr = s;
           ListNode prev = null;
           ListNode temp = curr;
           while(temp != null){
               temp = temp.next;
               curr.next = prev;
               prev = curr;
               curr = temp;
           }
           return prev;
       }
    public boolean isPalindrome(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
         s.next = reverse(s.next);
         s = s.next;
        f  = head;
        while(s != null){
            if(s.val != f.val) return false;
            s = s.next;
            f = f.next;
        }
        return true;
    }
}