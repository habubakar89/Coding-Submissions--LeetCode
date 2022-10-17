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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head , fast = head , slowest = head;
        if(head == null || head.next == null) return null;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(slowest != slow){
                    slow = slow.next;
                    slowest = slowest.next;
                }
                return slow;
            }
        }
        return null;
    }
}