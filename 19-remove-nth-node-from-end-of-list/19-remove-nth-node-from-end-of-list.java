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
    public ListNode removeNthFromEnd(ListNode head, int N) {
        
        //Assign a dummy node here
        ListNode dummy = head;
        
        int counter = 0;
        
        while(dummy != null){
            dummy = dummy.next;
            counter++;
        }
        
        //Remove the head if it is to be removed
        if(counter == N) return head.next;
        
        dummy = head;
        
        for(int i = 0 ; i < (counter - N - 1) ; i++){
                dummy = dummy.next;
        }
        
        dummy.next = dummy.next.next;
        
        return head;
    }
}