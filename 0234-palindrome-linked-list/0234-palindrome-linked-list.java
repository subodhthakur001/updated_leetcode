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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int start = 0;
        int end = list.size() - 1;
        while(start < end){
            if(list.get(start++) != list.get(end--)){
                return false;
            }
        }
        return true;
    }
}