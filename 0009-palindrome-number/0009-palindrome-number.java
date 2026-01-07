class Solution {
    public boolean isPalindrome(int x) {
        int ans=0,o=x;
       if(x>0){
        while(x>0){
            ans=ans*10+(x%10);
            x=x/10;
        }
       } 
       return ans==o;
    }
}