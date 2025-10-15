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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = new ListNode(0);
        p.next=head;
            ListNode prev=p;
            ListNode curr=head;
            
        while(curr!=null){
            while(curr.next!=null && curr.val==curr.next.val) curr=curr.next;
           if (prev.next == curr) {
                prev = prev.next;
            } else {
                // Skip all duplicates
                prev.next = curr.next;
            }

            curr = curr.next;

        }
        return p.next;
    }
}