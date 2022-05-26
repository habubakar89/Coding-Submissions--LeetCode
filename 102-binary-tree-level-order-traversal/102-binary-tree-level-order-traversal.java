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
        //Declare the DS
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        
        //Check for the edge case
        if(root == null) return list;
        
        //Add the root to the queue
        queue.offer(root);
        
        //Iterate the current level of the queue
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> temp = new LinkedList<>();
            
            //Iterating through the children of the current queue
            for(int i = 0 ; i < queueSize ; i++){
                
                //Check and add the children if they exist
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                
                //Add the root value to the list
                temp.add(queue.poll().val);
            }
            list.add(temp);
        }
        
        return list;
    }
}