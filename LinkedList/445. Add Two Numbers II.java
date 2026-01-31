//https://leetcode.com/problems/add-two-numbers-ii
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
        ListNode revl1=reverse(l1);
        ListNode revl2=reverse(l2);
        ListNode temp=revl1;
        int b=0;
        ListNode prev=null;
        while(temp!=null&& revl2!=null){
            int v=temp.val+revl2.val+b;
            temp.val=v%10;
            b=v/10;
            prev=temp;
            temp=temp.next;
            revl2=revl2.next;
        }
        if(revl2==null && b!=0 && prev.next==null){
            prev.next=new ListNode(b);
            return reverse(revl1);
        }
        else if(revl2!=null){
            prev.next=revl2;
        }
        prev=prev.next;
        while(prev!=null && b!=0){
              int v=prev.val+b;
              prev.val=v%10;
              b=v/10;
              if(prev.next==null && b!=0){
               prev.next=new ListNode(b);
               break;
              }
              prev=prev.next;
        }
        return reverse(revl1);


    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr= head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
