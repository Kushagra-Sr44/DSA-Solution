//https://leetcode.com/problems/insertion-sort-list
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
    public ListNode insertionSortList(ListNode head) {
        ListNode sortedlist=head;
        head=head.next;
        sortedlist.next=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode next=temp.next;
            if(temp.val<=sortedlist.val){
                temp.next=sortedlist;
                sortedlist=temp;
            }
            else{
                ListNode prev=sortedlist;
                ListNode st=sortedlist.next;
                while(st!=null){
                    if(st.val>temp.val) break;
                    prev=st;
                    st=st.next;
                }
                temp.next=st;
                prev.next=temp;
            }
            temp=next;
           
        }
        return sortedlist;
    }
}
