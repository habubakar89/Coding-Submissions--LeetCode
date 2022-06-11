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
        
        //Declare the DS
        List<Integer> list = new LinkedList<>();
        
        dfs(root , list , 0);
        
        return list;
    }
    
    public void dfs(TreeNode root , List<Integer> list , int level){
        
        //Check for the edge + base cases
        if(root == null) return;
        
        //Check if this is the first element on the current level
        if(level == list.size()) list.add(root.val);
        
        //Traverse right and left
        dfs(root.right , list , level + 1);
        dfs(root.left , list , level + 1);
    }
}