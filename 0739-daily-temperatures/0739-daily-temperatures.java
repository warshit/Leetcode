class Solution {
    public int[] dailyTemperatures(int[] tem) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[tem.length];
        int j=0;
        for(int i=0;i<tem.length;i++){
          while(!st.isEmpty() && tem[i]>tem[st.peek()]){
            j=st.pop();
            res[j]=i-j;
          }
            st.push(i);
        }
        return res;
    }
}