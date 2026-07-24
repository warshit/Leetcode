class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // int n = nums.length;

        // Set<Integer> pairXorSet = new HashSet<>();
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         pairXorSet.add(nums[i] ^ nums[j]);
        //     }
        // }

        // Set<Integer> result = new HashSet<>();
        // for (int x : pairXorSet) {
        //     for (int num : nums) {
        //         result.add(x ^ num);
        //     }
        // }

        // return result.size();
           boolean[] present = new boolean[2048];
        List<Integer> values = new ArrayList<>();

        for (int x : nums) {
            if (!present[x]) {
                present[x] = true;
                values.add(x);
            }
        }

        boolean[][] dp = new boolean[4][2048];
        dp[0][0] = true;

        for (int pick = 0; pick < 3; pick++) {
            for (int xor = 0; xor < 2048; xor++) {
                if (!dp[pick][xor]) continue;

                for (int v : values) {
                    dp[pick + 1][xor ^ v] = true;
                }
            }
        }

        int ans = 0;
        for (boolean ok : dp[3]) {
            if (ok) ans++;
        }
        return ans;
    }
}