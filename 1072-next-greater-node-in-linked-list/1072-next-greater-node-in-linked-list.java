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
    public int[] nextLargerNodes(ListNode head) {
         List<Integer> v = new ArrayList<>();
        while (head != null) {
            v.add(head.val);
            head = head.next;
        }

        int n = v.size();
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();  

        for (int i = 0; i < n; i++) {
            int cu = v.get(i);

            while (!st.isEmpty() && v.get(st.peek()) < cu) {
                int in = st.pop();
                ans[in] = cu;
            }

            st.push(i);
        }
            return ans;}
    
}