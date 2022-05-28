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
        //Set each node as a pointer to itself, and if we find any such case, return true. 
        while(head != null){
            
            if(head == head.next) return true;
            
            ListNode temp = head.next;
            head.next = head;
            head = temp;
            
        }
        
        return false;
    }
}