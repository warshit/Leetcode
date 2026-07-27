class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        int max1=0,max2=1;
        for(int i=0;i<nums.length;i++){
            if(max1 <= nums[i]){
                max2=max1;
                max1=nums[i];
            }
            else if(max2<nums[i]) max2=nums[i];
        }
        return Math.abs(max2-1)*Math.abs(max1-1);
        // return max2;
    }
}