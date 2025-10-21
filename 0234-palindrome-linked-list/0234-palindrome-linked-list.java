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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode s=head,f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode p=null,c=s;
        while(c!=null){
            ListNode n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        ListNode sec=p,fir=head;
        while(sec!=null){
            if(sec.val!=fir.val)  return false;
            sec=sec.next;
            fir=fir.next;
        }
        return true;
    }
}