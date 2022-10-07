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
    public List<String> binaryTreePaths(TreeNode root) {
        String string = "";
        List<String> list = new ArrayList<>();
        helper(root , "" , list);
        
        return list;
    }
    public boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
    public void helper(TreeNode node , String string , List<String> list){
        if(node == null) return;
        string += (node.val + "");
        if(isLeaf(node)) list.add(string);
        string += "->";
        helper(node.left , string , list);
        helper(node.right , string , list);
    }
}