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
    public ListNode removeElements(ListNode head, int val) {
        ListNode p = new ListNode(0);
        ListNode q=p;
        p.next=head;
        while(p.next!=null){
            if(p.next.val==val) p.next=p.next.next;
            // skip the p.next node which head to be deleted
            else p=p.next;//move p to next node 
        }
        return q.next;


    }
}