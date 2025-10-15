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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null||left==right) return head;
        ListNode p = new ListNode(0);
         p.next = head;
        ListNode prev = p;
       for(int i=0;i<left-1;i++){
            prev=prev.next;            
        }
        ListNode c = prev.next;
        // c=prev.next;
        for(int j=0;j<right-left;j++){
         ListNode ne = c.next;
                    c.next = ne.next;
                    ne.next = prev.next;
                    prev.next = ne;                
        }
    
         return p.next;
          
    }
}