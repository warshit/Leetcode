class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if (n == 1) return nums[0];
        
        if (n == 2) return Math.max(nums[0], nums[1]);
        
        int[] d = new int[n];
        d[0] = nums[0];
        d[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + nums[i]);
        }
        
        return d[n - 1];
    }
}