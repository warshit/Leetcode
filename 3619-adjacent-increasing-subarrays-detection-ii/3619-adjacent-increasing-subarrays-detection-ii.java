class Solution {
    public int maxIncreasingSubarrays(List<Integer> list) {
        //  int n = nums.size();
        // int[] inc = new int[n]; 
        // int[] dec = new int[n]; 


        // inc[0] = 1;
        // for (int i = 1; i < n; i++) {
        //     if (nums.get(i) > nums.get(i - 1)) {
        //         inc[i] = inc[i - 1] + 1;
        //     } else {
        //         inc[i] = 1;
        //     }
        // }


        // dec[n - 1] = 1;
        // for (int i = n - 2; i >= 0; i--) {
        //     if (nums.get(i) < nums.get(i + 1)) {
        //         dec[i] = dec[i + 1] + 1;
        //     } else {
        //         dec[i] = 1;
        //     }
        // }

        // int ans = 0;
        // for (int i = 0; i < n - 1; i++) {
        //     int left = inc[i];
        //     int right = dec[i + 1];
        //     ans = Math.max(ans, Math.min(left, right));
        // }

        // return ans;
         Integer[] nums = list.toArray(Integer[]::new);
        int n = nums.length, i = 0, res = 0;
        int prev = 0;

        while (i < n) {
            int start = i;

            while (i + 1 < n && nums[i] < nums[i + 1]) {
                i++;
            }

            int curr = i - start + 1;
            res = Math.max(res, Math.max(curr / 2, Math.min(curr, prev)));
            
            prev = curr;
            i++;
        }
        
        return res;
    }
}