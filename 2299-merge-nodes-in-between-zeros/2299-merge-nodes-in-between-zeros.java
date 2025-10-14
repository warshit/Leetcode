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
    public ListNode mergeNodes(ListNode head) {
        if(head==null) return null;
        // ListNode p=head;
        ListNode p=new ListNode(0);
        ListNode q=p;
        head=head.next;
    int sum = 0;
        while(head!=null){
            if(head.val==0){
           q.next=new ListNode(sum);
           q=q.next;
            sum=0;
            // q=q.next;            
            }
           sum+=head.val;
                // r=r.next;
                head=head.next;
                // r.next.val=sum;
                // sum=0;
                // q=q.next;
            
        }
        return p.next;
    }
}