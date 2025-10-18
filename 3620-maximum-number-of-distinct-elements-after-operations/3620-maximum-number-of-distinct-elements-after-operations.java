class Solution {
    public int maxDistinctElements(int[] nums, int k) {
          int n = nums.length;
        long[][] intervals = new long[n][2];

        for (int i = 0; i < n; i++) {
            intervals[i][0] = (long) nums[i] - k; // start
            intervals[i][1] = (long) nums[i] + k; // end
        }

        Arrays.sort(intervals, (a, b) -> Long.compare(a[0], b[0]));

        long current = Long.MIN_VALUE;
        int count = 0;

        for (long[] range : intervals) {
            long left = range[0];
            long right = range[1];

            if (current < left) {
                current = left;
                count++;
            } else if (current + 1 <= right) {
                current++;
                count++;
            }
        }

        return count;
    }
}