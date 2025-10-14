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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        // ListNode p= head;
        // ListNode q= head;

        // while(q.next!=null && q.next.next!=null){
        //     q=q.next;
        //     int t= q.val;
        //     q.val=p.val;
        //     p.val=t;
        //     p=q.next;
        //     if(q.next!=null) q=q.next;
        //     else break;
            
        // }
        // return head;
        ListNode p = new ListNode(0);
               p.next = head;
               ListNode q = p;

               
               while (q.next != null && q.next.next != null) {
                    ListNode f = q.next;
                    ListNode s = q.next.next;

                 
                    f.next = s.next;
                    s.next = f;
                    q.next = s;

                    
                    q = f;
               }

             
               return p.next;
    }
}