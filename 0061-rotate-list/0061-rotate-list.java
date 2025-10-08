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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) return head;
        // if(head.next==null) return head;
        // if(k==0) return head;
        ListNode p=head;
         int c=1;
         while(p.next!=null){
            p=p.next;
            c++;

         }
         p.next=head;
            k=k%c;
            k=c-k;
            while(k-->0){
                p=p.next;//moving p by k positions
            }
           head = p.next;
           p.next=null;
        return head;

    }
}