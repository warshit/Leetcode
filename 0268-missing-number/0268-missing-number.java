class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // if(nums[0]!=0){
        //     return 0;
        // }
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return nums.length;
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        int n = nums.length;
        int sum1=(n*(n+1))/2;

        return sum1-sum;
    }
}