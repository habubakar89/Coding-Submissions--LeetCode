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
    public int kthSmallest(TreeNode root, int k) {
        int[] temp = new int[1];
        temp[0] = k;
        TreeNode ans =  helper(root , temp);
        return ans.val;
    }
    public TreeNode helper(TreeNode root , int[] temp){
        if(root == null) return null;
        
        TreeNode left =  helper(root.left , temp);
        if(left != null) return left;
        temp[0]--;
        if(temp[0] == 0) return root;
        return helper(root.right , temp);
    }
}