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
    public boolean isCompleteTree(TreeNode root) {
      boolean check = false;
      Queue<TreeNode> q = new LinkedList();
       q.offer(root);
    while(!q.isEmpty()){
        TreeNode temp = q.poll();
        if(temp == null) {
            check = true;
        }
        else{
            if(check) return false;
            q.offer(temp.left);
            q.offer(temp.right);
        }
    }
   return true;    
}
    
}