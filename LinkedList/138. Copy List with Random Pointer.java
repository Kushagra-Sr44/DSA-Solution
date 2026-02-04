//https://leetcode.com/problems/copy-list-with-random-pointer
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node newhead = new Node(head.val);
        Node newtemp = newhead;
        Node temp = head.next;
        while (temp != null) {
            newtemp.next = new Node(temp.val);
            newtemp = newtemp.next;
            temp = temp.next;
        }
        temp = head;
        newtemp = newhead;
        while (temp != null) {
            Node tnode = newhead;
            if (temp.random != null)
            {
                while (tnode != null) {
                   if( tnode.val == temp.random.val &&
                    equal(tnode.next,temp.random.next))
                    break;
                    tnode = tnode.next;
                }
                newtemp.random = tnode; 
            }
              newtemp = newtemp.next;
                temp = temp.next;
        }
        return newhead;

    }
    public boolean equal(Node t1, Node t2){
        while(t1!=null&& t2!=null){
            if(t1.val!=t2.val) return false;
            t1=t1.next;
            t2=t2.next;
        }
        if(t1==null && t2==null)return true;
        return false;
    }
}
