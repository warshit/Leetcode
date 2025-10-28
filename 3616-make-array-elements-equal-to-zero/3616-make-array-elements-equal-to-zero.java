class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (s(nums, i, 1)) c++;   // move right
                if (s(nums, i, -1)) c++;  // move left
            }
        }

        return c;
    }
     private static boolean s(int[] nums, int st, int di) {
        int n = nums.length;
        int[] arr = nums.clone(); 
        int curr = st;
        int dir = di;

        while (curr >= 0 && curr < n) {
            if (arr[curr] == 0) {
                curr += dir;
            } else {
                arr[curr]--;
                dir *= -1;
                curr += dir;
            }
        }

        for (int val : arr) {
            if (val != 0) return false;
        }
        return true;
    }
}