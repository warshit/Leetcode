class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        while(n>=5){
            n=n/5;
            c+=n;
        }
        return c;
    }
}