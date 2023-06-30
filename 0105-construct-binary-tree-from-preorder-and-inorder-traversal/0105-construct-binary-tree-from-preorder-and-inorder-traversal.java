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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            hm.put(inorder[i],i);
        }
        TreeNode ans = constructBinaryTree(hm,preorder, 0, preorder.length - 1,inorder, 0, inorder.length - 1);
        return ans;
    }
    public TreeNode constructBinaryTree(HashMap<Integer, Integer> hm,int[] preorder, int prestart, int preend,int[] inorder, int instart, int inend){
        if(prestart > preend || instart > inend)return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int inroot = hm.get(root.val);
        int numsleft = inroot - instart;
        root.left = constructBinaryTree(hm, preorder, prestart + 1, prestart + numsleft, inorder, instart,inroot -1);
        root.right = constructBinaryTree(hm, preorder,prestart + numsleft + 1,preend,inorder,inroot + 1, inend);
        return root;
    }
}