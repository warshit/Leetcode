// class Solution {
//     public int[] findXSum(int[] a, int k, int x) {
//         List<Integer> r = new ArrayList<>();
//         Map<Integer, Integer> f = new HashMap<>();
//         int n = a.length;
//         for (int i = 0; i < k; i++) f.put(a[i], f.getOrDefault(a[i], 0) + 1);
//         r.add(s(f, x));
//         for (int i = k; i < n; i++) {
//             int rm = a[i - k], ad = a[i];
//             f.put(rm, f.get(rm) - 1);
//             if (f.get(rm) == 0) f.remove(rm);
//             f.put(ad, f.getOrDefault(ad, 0) + 1);
//             r.add(s(f, x));
//         }
//         int[] ans = new int[r.size()];
//         for (int i = 0; i < r.size(); i++) ans[i] = r.get(i);
//         return ans;
//     }

//     private static int s(Map<Integer, Integer> f, int x) {
//         List<Map.Entry<Integer, Integer>> l = new ArrayList<>(f.entrySet());
//         l.sort((p, q) -> {
//             if (!Objects.equals(p.getValue(), q.getValue()))
//                 return q.getValue() - p.getValue();
//             return q.getKey() - p.getKey();
//         });
//         int c = 0, sum = 0;
//         for (Map.Entry<Integer, Integer> e : l) {
//             if (c >= x) break;
//             sum += e.getKey() * e.getValue();
//             c++;
//         }
//         return sum;
//     }
// }
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < result.length; i++) {
            int left = i, right = i + k - 1;
            result[i] = findXSumofSubArray(nums, left, right, x);
        }

        return result;
    }

    private int findXSumofSubArray(int[] nums, int left, int right, int x) {
        int sum = 0, distinctCount = 0;
        int[] freq = new int[51]; 

        for (int i = left; i <= right; i++) {
            sum += nums[i];
            if (freq[nums[i]] == 0) {
                distinctCount++;
            }
            freq[nums[i]]++;
        }

        if (distinctCount < x) {
            return sum;
        }

        sum = 0;
        for (int pick = 0; pick < x; pick++) {
            int bestFreq = -1;
            int bestVal = -1;

            for (int val = 50; val >= 1; val--) {
                if (freq[val] > bestFreq) {
                    bestFreq = freq[val];
                    bestVal = val;
                }
            }

            if (bestVal != -1) {
                sum += bestVal * bestFreq;
                freq[bestVal] = 0;
            }
        }
        
        return sum;
    }
}