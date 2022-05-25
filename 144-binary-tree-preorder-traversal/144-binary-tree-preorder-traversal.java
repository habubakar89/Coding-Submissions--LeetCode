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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return preorder(root , list);
    }
    public List<Integer> preorder(TreeNode root , List<Integer> list){
        
        //Check if the last leaf is reached
        if(root == null) return list;
        
        //Add the root to the list
        list.add(root.val);
        
        //Traverse left then right
        preorder(root.left , list);
        preorder(root.right , list);
        
        return list;
    }
}