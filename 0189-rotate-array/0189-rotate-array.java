class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
       ro(nums,nums.length-k,nums.length-1);
       ro(nums,0,nums.length-k-1);
       ro(nums,0,nums.length-1);
        }
    private void ro(int[] nums,int st,int end){
        while(st<=end){
            int tem=nums[st];
            nums[st]=nums[end];
            nums[end]=tem;
            st++;
            end--;
        }
    }
}