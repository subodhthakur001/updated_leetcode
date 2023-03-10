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
    public ListNode header;
    public Solution(ListNode head) {
        header = head;
    }
    
    public int getRandom() {
        int i = 0;
        ListNode temp = header;
        while(temp != null){
            i++;
            temp = temp.next;
        }
        Random random = new Random();
        int x = random.nextInt(i);
        temp = header;
        i = 0;
        while(i < x){
            i++;
            temp = temp.next;
        }
        return temp.val;
    }
    
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */