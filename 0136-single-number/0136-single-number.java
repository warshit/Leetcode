class Solution {
    public int singleNumber(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
       
            // for(int i=0;i<n-1;i+=2){
            //     if(nums[i]!=nums[i+1]){
            //         return nums[i];
            //     }
            //     }
        
        //          return nums[n-1];
              int res=0;    
            for(int i:nums){
                res^=i;
            }
            return res;
    }
}