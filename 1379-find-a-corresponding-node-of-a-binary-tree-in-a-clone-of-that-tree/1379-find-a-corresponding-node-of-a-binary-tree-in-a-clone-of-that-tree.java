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
    TreeNode ans;
    public void inorderTraversal(TreeNode o, TreeNode c, TreeNode target) {
        if(ans!= null) return;
        if (o != null) {
            inorderTraversal(o.left, c.left, target);
            if (o == target) {
                ans = c;    
            }
            inorderTraversal(o.right, c.right, target);    
        }
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inorderTraversal(original, cloned, target);
        return ans;
    }
}