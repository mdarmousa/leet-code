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
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<List<Integer>>();
       
       if(root == null){
          return result;
       }
       
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
       queue.offer(root);
       
       int curL = 0;
       while(!queue.isEmpty()){
           List<Integer> levelRs = new ArrayList<Integer>(); 
           curL = queue.size();
           for(int i=0;i<curL;i++){
               TreeNode peek = queue.poll();
               levelRs.add(peek.val);
               if(peek.left!=null){
                   queue.offer(peek.left);
               }
               if(peek.right!=null){
                   queue.offer(peek.right);
               }
           }
           result.add(levelRs);
       }
       
       return result;
    }  
}