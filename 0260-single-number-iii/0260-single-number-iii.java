class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        int[] arr = new int[2];
        if(nums.length==2) return nums;
        if(nums[0]!=nums[1]) arr[a++]=nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) arr[a++]=nums[nums.length-1];
        if(a>2) return arr;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1] && a<2) arr[a++]=nums[i];
        }
        return arr;
    }
}