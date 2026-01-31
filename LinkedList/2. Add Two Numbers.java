//https://leetcode.com/problems/add-two-numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        int b=0;
        ListNode prev=null;
        while(temp1!=null &&temp2 !=null){
            int v=temp1.val+temp2.val+b;
             b=v/10;
            temp1.val=v%10;
            prev=temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp2!=null){
            prev.next=temp2;
        }
        if(prev.next!=null)
        prev=prev.next; 
        else if(b>0){
            prev.next=new ListNode(b);
           return l1;
            }
        while(prev!=null && b!=0){
            int v=prev.val+b;
             b=v/10;
            prev.val=v%10;
            if(prev.next==null && b>0){
            prev.next=new ListNode(b);
            break;
            }
            prev=prev.next;
        }
    

        return l1;
    }
}
