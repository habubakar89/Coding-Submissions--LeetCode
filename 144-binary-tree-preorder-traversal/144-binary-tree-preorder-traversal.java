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
        
        //Define the DS to be used
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> preorder = new LinkedList<>();
        
        //Check for the edge case
        if(root == null) return preorder;
        
        //Push the root into the stack
        stack.push(root);
        
        //Iterate over the stack in a pre-order manner
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            
            //Add the root to the final list
            preorder.add(temp.val);
            
            //Check for the right and the left children of the current root
            if(temp.right != null) stack.push(temp.right);
            if(temp.left != null) stack.push(temp.left);
            
        }
        
        return preorder;
        
    }
}