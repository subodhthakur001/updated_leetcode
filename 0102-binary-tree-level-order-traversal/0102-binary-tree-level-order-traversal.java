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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < queueSize; i++){
                  TreeNode temp = queue.remove();
                   list.add(temp.val);
                 if(temp.left != null){
                     queue.add(temp.left);
                     
                 }
                if(temp.right != null){
                    queue.add(temp.right);
                    
                }
            }
            ans.add(list);
        }
        return ans;
    }
}