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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if(root == null) return res;
        List<TreeNode> candidates = new LinkedList<TreeNode>();
        candidates.add(root);
        // DFS: A variation of this question is to print a tree one level at a time.
        while(!candidates.isEmpty()) {
            List<TreeNode> temp = new LinkedList<TreeNode>();
            res.add(candidates.get(0).val);
            for(TreeNode curr : candidates) {
                if(curr.right != null)
                    temp.add(curr.right);
                if(curr.left != null)
                    temp.add(curr.left);
            }
            candidates = temp;
        }
        return res;
    }
}