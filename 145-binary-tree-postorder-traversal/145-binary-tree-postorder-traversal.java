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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        return postorder(root , list);
    }
    public List<Integer> postorder(TreeNode root , List<Integer> list){
        
        //Check if we have reached the leaf node
        if(root == null) return list;
        
        //Inorder traversal
        postorder(root.left , list);
        postorder(root.right , list);
        list.add(root.val);
        
        return list;
    }
}