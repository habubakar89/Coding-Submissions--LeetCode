/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        //Check for edge cases
        if(head == null || head.next == null) return head;
        
        //Two-pointer Approach
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
       while(fastPointer != null && fastPointer.next != null){
           
           slowPointer = slowPointer.next;
           fastPointer = fastPointer.next.next;
       
       }
            
        
        return slowPointer;
    }
}