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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        
        //Add root to the tree
        queue.offer(root);
        if(root == null) return list;
        
        while(!queue.isEmpty()){
            int num = queue.size();
            List<Integer> temp = new LinkedList<Integer>();
            for(int i = 0 ; i < num ; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                temp.add(queue.poll().val);
            }
            list.add(temp);
        }
        
        return list;
    }
}