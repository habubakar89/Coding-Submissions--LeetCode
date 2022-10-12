/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        //Check for the edge case
        if(head == null || head.next == null) return false;
        
        while(head.next != null){
            if(head.next == head) return true;
            ListNode temp = head.next;
            head.next = head;
            head = temp;
        }
        return false;
    }
}