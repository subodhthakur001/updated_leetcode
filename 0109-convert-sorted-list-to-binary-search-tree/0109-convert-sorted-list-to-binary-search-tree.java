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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        return createList(list,0,list.size() -1);
    }
    public TreeNode createList(List<Integer> list, int s, int e){
        if(s>e){
            
            return null;
        }
          int mid = (s + e ) / 2;
        TreeNode temp = new TreeNode(list.get(mid));
          temp.left = createList(list,s,mid -1);
           temp.right = createList(list,mid + 1,e);
          return temp;
    }
}