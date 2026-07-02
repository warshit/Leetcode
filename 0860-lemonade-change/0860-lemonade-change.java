class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a=0;
        int b=0;
        for(int i:bills){
            if(i==5)a++;
            if(i==10) {
                if(a>=1){

                a--;
                b++;
                }
                else return false;
            } 
            // else return false;
            if(i==20){
                if(b>=1 && a>=1) {
                    a--;
                    b--;
                }
                else if(a>=3) a-=3;
                else return false;
            }
        }
        return true;
    }
}