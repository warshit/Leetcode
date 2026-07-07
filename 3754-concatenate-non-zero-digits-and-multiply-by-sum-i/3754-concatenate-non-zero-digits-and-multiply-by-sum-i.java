class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder a = new StringBuilder();
        long sum=0;
        while(n>0){
            int b=n%10;
            n/=10;
            if(b>0) a.append(b);
            sum+=b;
        }
        long x=0;
        String s=a.reverse().toString();
        for(int i=0;i<s.length();i++){
            x=(long)((x*10)+(s.charAt(i)-'0'));
        }
        return x*sum;

    }
}