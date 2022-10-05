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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        
        insert(root, 1, val, depth);
        
        return root;
    }
    
    private void insert(TreeNode node, int currentDepth,int val, int depth){
        if(node == null) return; 
        
        if(currentDepth == depth -1){
            TreeNode newNode = node.left; 
            node.left = new TreeNode(val);
            node.left.left = newNode;
            
            newNode = node.right;
            node.right = new TreeNode(val);
            node.right.right = newNode;
            
            
            
        }else {
            insert(node.left, currentDepth+1, val, depth);
            insert(node.right, currentDepth+1, val, depth);
        }
    }
}