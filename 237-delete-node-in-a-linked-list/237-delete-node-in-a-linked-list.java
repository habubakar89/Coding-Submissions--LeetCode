/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        //Assign the current node the value of the next node
        node.val  = node.next.val;
        
        //Skip the next node
        node.next = node.next.next;
        
        
    }
}