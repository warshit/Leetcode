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
     private ListNode reverseList(ListNode head) {
               ListNode p = null;
               ListNode c = head;
               while (c != null) {
                    ListNode n = c.next;
                    c.next = p;
                    p = c;
                    c = n;
               }
               return p;
          }

          public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
               l1 = reverseList(l1);
               l2 = reverseList(l2);

               ListNode d = new ListNode(0);
               ListNode tail = d;
               int c = 0;

               while (l1 != null || l2 != null || c != 0) {
                    int d1 = (l1 != null) ? l1.val : 0;
                    int d2 = (l2 != null) ? l2.val : 0;

                    int sum = d1 + d2 + c;
                    int di = sum % 10;
                    c = sum / 10;

                    ListNode ne = new ListNode(di);
                    tail.next = ne;
                    tail = ne;

                    l1 = (l1 != null) ? l1.next : null;
                    l2 = (l2 != null) ? l2.next : null;
               }

               return reverseList(d.next);
          }
}