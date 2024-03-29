//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node reverse(Node head){
        Node returnFinal = head;
        Node prev = null;
        while(head != null){
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
      head = reverse(head);
      head = add(head);
      return reverse(head);
    }
    public static Node add(Node head){
        int sum = 0 , carry = 1;
        Node temp = null , result = head;
        while(head != null){
            sum = carry + (head.data);
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            head.data = sum;
            
            temp = head;
            head = head.next;
        }
        if(carry > 0) temp.next = new Node(carry);
        return result;
    }
    
}
