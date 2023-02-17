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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(list,root);
        int diff = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i++){
            diff = list.get(i) - list.get(i -1);
            min = Math.min(min,diff);
        }
        return min;
    }
    public void  inorder(List<Integer> list,TreeNode root){
          if(root == null) return;
          inorder(list,root.left);
          list.add(root.val);
          inorder(list,root.right);
          
    }
}