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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        q.add(root);
        int ans = 0;
        int level = 1;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            while(size>0){
                TreeNode curr = q.remove();
                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                size--;
            }
            if(max<sum(list)){
                ans = level;
                max = sum(list);
            }
            level++;
        }
        return ans;
        
    }
    public int sum(List<Integer> ls){
        int sum = 0;
        for(int i : ls){
            sum += i;
        }
        return sum;
    }
}