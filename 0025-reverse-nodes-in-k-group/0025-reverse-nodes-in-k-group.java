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
    public ListNode reverseKGroup(ListNode head, int k) {
        // if(head==null||k==1){
        //     return head;
        // }
        // ListNode val= new ListNode(0);
        // val.next=head;
        // ListNode prev=val; 
        // ListNode curr=head;
        // int c=0;
        // while(curr!=null){
        //     c++;
        //     curr=curr.next;
        // }
        // while(c>=k){
        //     curr=prev.next;
        //    ListNode next=curr.next;
        //     for(int i=1;i<k;i++){
        //         curr.next=next.next;
        //         next.next=prev.next;
        //         prev.next=next;
        //         next=curr.next;
        //     }
        //     prev=curr;
        //     c-=k;
        // }

        // return val.next;
         if (head == null) return head;
        ListNode prev = new ListNode();
        final ListNode newHead = prev;
        outer: while (head != null) {
            ListNode next = head;
            for (int i = 0; i < k; ++i) {
                if (next == null) {
                    break outer;
                }
                next = next.next;
            }
            final ListNode rev = reverse(head, k);
            prev.next = rev;
            prev = head;
            head.next = next;
            head = next;
        }
        return newHead.next;
    }

    private ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode next = null;
        for (int i = 0; i < k; ++i) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
            }
}