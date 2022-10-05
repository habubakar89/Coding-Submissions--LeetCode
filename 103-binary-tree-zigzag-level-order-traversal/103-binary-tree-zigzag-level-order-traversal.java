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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null) return list;
        boolean flag = true;
        queue.offer(root);
        while(!queue.isEmpty()){
            int length = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0 ; i < length ; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                if(flag) tempList.add(queue.poll().val);
                else tempList.add(0 , queue.poll().val);
            }
            flag = !flag;
            list.add(tempList);
        }
        
        
        return list;
    }
}