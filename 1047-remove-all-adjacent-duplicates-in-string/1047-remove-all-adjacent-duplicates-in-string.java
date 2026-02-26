class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==i) st.pop();
            else st.push(i);
          
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()) res.append(st.pop());
        return res.reverse().toString(); 
    }
}