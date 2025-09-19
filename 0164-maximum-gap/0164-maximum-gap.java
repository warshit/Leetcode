class Solution {
    public int maximumGap(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i]-nums[i+1])>ans) ans=Math.abs(nums[i]-nums[i+1]);
        }
        return ans;
    }
}