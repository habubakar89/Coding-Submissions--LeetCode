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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //Declare and define the starting node
        ListNode start = new ListNode();
        start.next = head;
        
        //Declare the slow and the fast pointers
        ListNode slow = start;
        ListNode fast = start;
        
        //Iterate the fast pointer
        for(int i = 1 ; i <= n ; i++) fast = fast.next;
        
        //Iterate both the pointers
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        //Delete the node next tot he slow pointer
        slow.next = slow.next.next;
        
        //Return the list
        return start.next;
    }
}