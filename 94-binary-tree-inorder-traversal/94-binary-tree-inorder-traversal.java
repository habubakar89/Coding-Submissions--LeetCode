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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        return inorder(root , list);
    }
    public List<Integer> inorder(TreeNode root , List<Integer> list){
        
        //Check if we have reached the leaf node
        if(root == null) return list;
        
        //Inorder traversal
        inorder(root.left , list);
        list.add(root.val);
        inorder(root.right , list);
        
        return list;
    }
}