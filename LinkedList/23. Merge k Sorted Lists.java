// https://leetcode.com/problems/merge-k-sorted-lists
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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=new ListNode(0,null);
        ListNode temp=head;
        boolean ch=true;
        while(ch){
            int min=Integer.MAX_VALUE;
            int j=-1;
             for(int i=0;i<lists.length;i++){
                if(lists[i]!=null && lists[i].val<min){
                min=lists[i].val;
                j=i;
                }
              }
              if(j==-1) ch=false;
              else{
                temp.next=new ListNode(min,null);
                temp=temp.next;
                lists[j]=lists[j].next;
              }
              }
             
         return head.next;
        }
    
}
