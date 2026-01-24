class Solution {
    public int minPairSum(int[] nums) {
        //  Arrays.sort(nums);
        
        // int left = 0;
        // int right = nums.length - 1;
        // int maxSum = 0;
        
        // while (left < right) {
        //     int pairSum = nums[left] + nums[right];
        //     maxSum = Math.max(maxSum, pairSum);
        //     left++;
        //     right--;
        // }
        
        // return maxSum;
         int minMax = 0;

        for(int n:nums){
            minMax = Math.max(n,minMax);
        }

        int[] arr = new int[minMax+1];
        for(int n:nums){
            arr[n]++;
        }

        int l = 0, r = minMax, ans = 0;
        while (l < r) {
            while (arr[l] == 0)
                l++;
            while (arr[r] == 0)
                r--;
            ans = Math.max(ans, l + r);
            if (arr[r] > arr[l])
                arr[r] -= arr[l++];
            else if (arr[l] > arr[r])
                arr[l] -= arr[r--];
            else {
                l++;
                r--;
            }
        }

        return ans;
    }
}