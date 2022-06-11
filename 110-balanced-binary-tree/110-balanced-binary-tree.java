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
    
    public int dfsHeight(TreeNode root){
        
        //Check for the edge and the base cases 
        if(root == null) return 0;
        
        //Check for the left child/subtree
        int left = dfsHeight(root.left);
        if(left == -1) return -1;
        
        //Check for the right child/subtree
        int right = dfsHeight(root.right);
        if(right == -1) return -1;
        
        //Base case for checking the difference
        if(Math.abs(left - right) > 1) return -1;
        
        //Return the height
        return (1 + Math.max(left , right));
        
    }
    
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }
}