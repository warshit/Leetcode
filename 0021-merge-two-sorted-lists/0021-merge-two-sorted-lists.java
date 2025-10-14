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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) return null;
        ListNode ans= new ListNode(0);
        // ListNode l1= list1;
        // ListNode l2= list2;
        ListNode ans1=ans;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                ans.next=l1;    
                l1=l1.next;            
            }
            else{
                ans.next=l2;
                l2=l2.next;
            }
            ans=ans.next;
        }
        if(l1!=null) ans.next=l1;
        else ans.next=l2;
        return ans1.next;
        
    }
}