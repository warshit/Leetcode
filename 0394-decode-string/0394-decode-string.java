class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> st=new Stack<>();
        Stack<Integer> c=new Stack<>();
        StringBuilder currs=new StringBuilder();
        int currn=0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(Character.isDigit(a)) currn=currn*10+(a-'0');
            else if(a=='['){
                c.push(currn);
                st.push(currs);
                 currn=0;
                 currs=new StringBuilder();

            }
            else if(a==']'){
                int re = c.pop();
                StringBuilder pre = st.pop();
                for(int j=0;j<re;j++) pre.append(currs);
                currs = pre;
            }
            else currs.append(a);
        }
        return currs.toString();

    }
    // public static String decode(String s){

    // }

}