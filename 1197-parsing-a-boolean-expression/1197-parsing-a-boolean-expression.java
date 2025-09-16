class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> opd = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for(char ch : expression.toCharArray()){
            if(ch=='|' ||ch=='&'||ch=='!'){
                opr.push(ch);
            }
            else if(ch=='t'||ch=='f' || ch=='(')
            opd.push(ch);
            else if(ch==')') evaluate(opr,opd);
            else continue;
        }
return opd.peek()=='t';
    }
     void evaluate(Stack<Character> opr,Stack<Character> opd){
        char op=opr.pop();
        boolean res=false;
        if(op=='&'){
            res=true;
            while(opd.peek()!='(') {
                res&=opd.pop()=='t';
            }
            opd.pop();
        }
      else if(op=='|'){
            res=false;
            while(opd.peek()!='(') {
                res|=opd.pop()=='t';
            }
                opd.pop();
        }
       else if(op=='!'){
            res=opd.pop()=='t';
            res=!res;
            opd.pop();
        }
        if(res==true){
            opd.push('t');
        }
        else opd.push('f');
    }
}