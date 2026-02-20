class Solution {
    public boolean isValid(String s) {
        Stack<Character> a= new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                a.push(s.charAt(i));
            }
           else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){
            if(a.isEmpty()) return false;
            char b=a.pop();
            if((c==')'&&b!='(')||(c=='}'&&b!='{')||c==']'&&b!='[') return false;
            }
        }
        return a.isEmpty();
    }
}