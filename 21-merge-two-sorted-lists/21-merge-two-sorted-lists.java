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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        //Check for the edge cases
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        //Smaller to be l1
        if(l1.val > l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        
        ListNode result = l1;
        
        while(l1 != null && l2 != null){
            //Maintain the sorted list
            ListNode prev = null;
            while(l1 != null && l1.val <= l2.val){
                prev = l1;
                l1 = l1.next;
            }
            prev.next = l2;
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        
        return result;
    }
}