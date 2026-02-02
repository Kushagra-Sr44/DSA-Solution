//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list
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
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null&& fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        prev.next=null;
        prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        int max=0;
        while(prev!=null|| head!=null){
            max=Math.max(max,prev.val+head.val);
            prev=prev.next;
            head=head.next;
        }
        return max;
    }
}
