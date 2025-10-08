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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode p = new ListNode(0);
        // ListNode q=p;
        // int carry=0; 
        // while(l1!=null || l2!=null|| carry!=0){
        //     int d1=(l1!=null)?l1.val:0;
        //     int d2=(l2!=null)?l2.val:0;
            
        //     int s= d1+d2+carry;
        //     int d=s%10;
        //     ListNode r = new ListNode(d);
        //     q.next=r;
        //     carry=s/10;
        //     q=q.next;
        //     l1=(l1!=null)? l1.next:null;
        //     l2=(l2!=null)? l2.next:null;

        // }
        // return p.next;
        ListNode temp = new ListNode(-1);
        ListNode dummy = temp;

        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry > 0) {
            dummy.next = new ListNode(carry);
        }

        return temp.next;
    }
}