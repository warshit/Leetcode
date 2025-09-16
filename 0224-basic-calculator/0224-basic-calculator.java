class Solution {
    public int calculate(String s) {
        Stack<Integer> st= new Stack<>();
        int res=0,n=0,sign=1;
        for( char ch : s.toCharArray()){
            if(ch-'0'>=0 && ch-'0'<=9){
                n=n*10+(ch-'0');
            }
          else if(ch=='+'||ch=='-'){
                res+=n*sign;
                n=0;
                sign=(ch=='-')?-1:1;                
               
            }
          else if(ch=='('){
                    st.push(res);
                    st.push(sign);
                    res=0;
                    sign=1;
            }
          else if(ch==')'){
                res+=n*sign;
                res*=st.pop();
                res+=st.pop();
                // res+=n*sign;
                n=0;
            }
        }
        return res+n*sign; 
    }
}