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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode ans = null;
        ListNode p = null;
        if(lists.length == 0){
            return ans;
        }
        
        for(int i = 0; i < lists.length; i++){
            ListNode temp = lists[i];
            // if(temp == null){
            //     break;
            // }
            while(temp != null){
                pq.add(temp.val);
                temp = temp.next;
            }
        }
        if(!pq.isEmpty()){
          int i = pq.remove();
        ans = new ListNode(i);
         p = ans;
        }
        
        while(!pq.isEmpty()){
            int i = pq.remove();
            ListNode node = new ListNode(i);
            p.next = node;
            p = node;  
        }
        return ans;
    }
}