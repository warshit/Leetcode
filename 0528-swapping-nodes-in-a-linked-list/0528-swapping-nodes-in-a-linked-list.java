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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return head;
        ListNode q= head;
        for(int i=1;i<k;i++){
            q=q.next;
        }
        ListNode r= q;
        ListNode p= head;
        while(q.next!=null){
            p=p.next;
            q=q.next;
        }
        int t = p.val;
        p.val=r.val;
        r.val=t;
        return head;
    }
}