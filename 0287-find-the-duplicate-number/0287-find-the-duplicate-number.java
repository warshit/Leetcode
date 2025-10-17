class Solution {
    public int findDuplicate(int[] nums) {
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        // }
        // int n=nums.length;
        // int tsum=((n*(n+1)))/2;
        // return tsum-sum;
        //  int low = 1, high = nums.length - 1;
        // int d = -1;

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;

        //     int c = 0;
        //     for (int num : nums) {
        //         if (num <= mid) c++;
        //     }

        //     if (c > mid) {
        //         d = mid;  
        //         high = mid - 1;    
        //     } else {
        //         low = mid + 1;     
        //     }
        // }

        // return d;
         boolean[] arr = new boolean[nums.length];

        for (int i : nums) {
            if (arr[i]) {
                return i;
            } else {
                arr[i] = true;
            }
        }
        return -1;
    }
}