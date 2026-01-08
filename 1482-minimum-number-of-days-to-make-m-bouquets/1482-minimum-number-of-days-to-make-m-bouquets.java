class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:bloomDay){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        int low=min,high=max;
        int ans=-1;
        if(((long)m*k)>bloomDay.length) return -1;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;

        }
        return ans;
    }
    private boolean possible(int[] nums,int day,int m,int k){
        int c=0,no_day=0;
        for(int i:nums){
            if(i<=day){
                c++;
            }
            else{
                no_day+=(c/k);
                c=0;
            }
        }
            no_day+=(c/k);
        return no_day>=m;
    }
}