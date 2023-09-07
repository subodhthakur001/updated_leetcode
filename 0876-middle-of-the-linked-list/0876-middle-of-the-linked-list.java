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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
             temp = temp.next;
             size++;
        }
        System.out.println(size);
        temp = head;
        int mid = size / 2;
        int i = 0;
        while(i < mid){
            temp = temp.next;
            i++;
        }
        return temp;
    }
}