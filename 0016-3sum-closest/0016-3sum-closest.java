class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[2];
        int mindif=Math.abs(sum-target);
        for(int i=0;i<nums.length-2;i++){
        int low=i+1,high=nums.length-1;

        while(low<high){
            int c_sum=nums[i]+nums[low]+nums[high];
            int c_diff=Math.abs(c_sum-target);

            if(c_diff<mindif){
                mindif=c_diff;
                sum=c_sum;
            }
            else if(c_sum<target) low++;
            else if(c_sum>target) high--;
            else return target;
        }
        }
        return sum;
    }
}