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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        path(root,list);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size() - 1; i++){
            int diff = Math.abs(list.get(i) - list.get(i + 1));
            min = Math.min(min,diff);
        }
        return min;
    }
    public void path(TreeNode root,List<Integer> list){
        if(root == null) return;
        else{
            path(root.left,list);
            list.add(root.val);
            path(root.right,list);
        }
    }
}