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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        int c=1;       

        while(c<lists.length){
          for(int i=0;i<lists.length-c;i+=c*2){
            lists[i] = merge(lists[i],lists[i+c]);
           }
            c*=2;
        }
        return lists[0];
    }
    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode ans= new ListNode(0);
       
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