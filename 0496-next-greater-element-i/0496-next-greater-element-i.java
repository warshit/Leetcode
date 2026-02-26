class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> st = new Stack<>();
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty()&&nums2[i]>=st.peek()) st.pop();
            if(!st.isEmpty()) map.put(nums2[i],st.peek());

            st.push(nums2[i]);    
       }
       int res[] = new int[nums1.length];
       int c=0;
       for(int i : nums1){
            res[c++]=map.getOrDefault(i,-1);
            // else res[c++]=-1;
        }
        return res;
    }
}