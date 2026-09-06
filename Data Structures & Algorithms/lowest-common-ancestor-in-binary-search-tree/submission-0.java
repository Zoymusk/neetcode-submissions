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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode c= root;
        while(c!=null){
            if(p.val<c.val && q.val<c.val){
                c=c.left;
            }else if(p.val>c.val && q.val>c.val){
                c=c.right;
            }else{
                return c;
            }
        }
        return null;
    }
}
