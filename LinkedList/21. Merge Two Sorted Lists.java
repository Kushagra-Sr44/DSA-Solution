//https://leetcode.com/problems/merge-two-sorted-lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1==null) return list2;
       else if(list2==null)return list1;
       ListNode temp=list1;
       ListNode temp2=list2;
        while(temp2!=null){
            ListNode next=temp2.next;
            temp=list1;
            ListNode prev=null;
            while(temp!=null && temp.val<=temp2.val){
                prev=temp;
                temp=temp.next;
            }
            if(prev==null){
                 temp2.next=list1;
                 list1=temp2;
                 }
                 else{
                    prev.next=temp2;
                    temp2.next=temp;
                 }
                 temp2=next;

        }
        return list1;
    }
}
