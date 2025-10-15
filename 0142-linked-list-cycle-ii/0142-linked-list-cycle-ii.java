/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f= head;
        ListNode s= head;
        int c=0;
        while(f.next!=null&&f!=null){
            f=f.next.next;
            s=s.next;
                c++;
            if(f==s){
                break;               
            }
        }
            if(f==null||f.next==null) return null;
            while(head!=s){
                head=head.next;
                s=s.next;
            }
        return head;
    }
}