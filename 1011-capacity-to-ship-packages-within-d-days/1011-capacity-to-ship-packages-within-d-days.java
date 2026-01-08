class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // int c=-1,sum=0;
        // for(int i=0;i<weights.length;i++){
        //     c= Math.max(c,weights[i]);
        //     sum+=weights[i];
        // }
        // int daycount=1;
        // for(int i=c;i<sum;i++){
        //     for(int )
        // }
        int l=1,h=0;
        // int days=1;
        for(int w:weights){
        l=Math.max(l,w);
        h+=w;
        } 
        while(l<h){
            int mid=(l+h)/2;
            int r=1,curr=0;
            for(int w:weights){
                if(curr+w>mid){
                    curr=0;
                    r++;
                }
                curr+=w;
            }
            if(r>days) l = mid+1;
            else h=mid;
            // else return l;
        }
        return l;
    }
}