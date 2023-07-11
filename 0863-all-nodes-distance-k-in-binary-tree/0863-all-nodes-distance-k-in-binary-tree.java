/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans  = new ArrayList<>();
        HashMap<TreeNode , TreeNode> map = new HashMap<>();
        Queue<TreeNode> q =new LinkedList<>();
        HashMap<TreeNode,Boolean> hm = new HashMap<>();
        q.add(root);
        while(!q.isEmpty()){
            int k1 = q.size();
            for(int i = 0 ;i<k1 ;i++){
                TreeNode node = q.remove();
            if(node.left!=null){
              map.put(node.left,node);
                q.add(node.left);
            }
            if(node.right!=null){
                map.put(node.right,node);
                q.add(node.right);
            }
          }
            
            
        }
        // System.out.println("size"+map.size());
        //     for(TreeNode n : map.keySet()){
        //         System.out.println(n.val + "->"+map.get(n).val);
        //     }
        Queue<TreeNode> qe = new LinkedList<>();
          qe.add(target);
        int d =0;
        hm.put(target,true);
        while(d<k){
            int k2 = qe.size();
            for(int i = 0;i<k2;i++){
                TreeNode node1 = qe.remove();
                if(node1.left!=null && !hm.containsKey(node1.left)){
                    qe.add(node1.left);
                    hm.put(node1.left,true);
                }
                 if(node1.right!=null && !hm.containsKey(node1.right)){
                    qe.add(node1.right);
                    hm.put(node1.right,true);
                }
                 if(map.containsKey(node1) && !hm.containsKey(map.get(node1))){
                    qe.add(map.get(node1));
                    hm.put(map.get(node1),true);
                }
            }
            System.out.println(qe.size()+"size at "+d);
            d++;
        }
        System.out.println(qe.size());
        while(!qe.isEmpty()){
            ans.add(qe.remove().val);
        }
        return ans;
    }
}