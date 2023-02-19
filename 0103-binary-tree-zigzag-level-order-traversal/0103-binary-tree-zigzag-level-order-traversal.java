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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int h = 1;
        while(!q.isEmpty()){
            int k = q.size();
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < k; i++){
                TreeNode temp = q.remove();
                res.add(temp.val);
                    if(temp.left != null){
                        q.add(temp.left);  
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                    }
            }
            if(h%2==0){
                Collections.reverse(res);
            }
            ans.add(res);
            h++; 
        }
        return ans;
    }
}