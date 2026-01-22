class Solution {
    public int findMaxLength(int[] nums) {
        // if(nums.length<=1) return 0;
        // int i=0,j=1;
        // int sum=0;
        // int c=0;
        // HashMap<Integer,Integer> mpp= new HashMap<>(); 
        // for(i=0;i<nums.length;i++){
        //     if(nums[i]==0) nums[i]=-1;
        //     sum+=nums[i];
        //     if(sum==0)
        //     c=i+1;
        //     if(!mpp.containsKey(sum))   mpp.put(sum,i);
        //     else c=Math.max(i-mpp.get(sum),c);
        // }
       
        // return c;
         Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxlen = 0;
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            count = count + (nums[i] == 1 ? 1: -1);
            if(map.containsKey(count)){
                maxlen = Math.max(maxlen,i - map.get(count));
            }else
                map.put(count,i);
        }
        return maxlen;
    }
}